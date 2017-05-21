package restaurant.action;


import org.apache.logging.log4j.LogManager;
import restaurant.bean.User;
import restaurant.biz.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by asus on 2017/5/20.
 */
@WebServlet(name = "LoginControl",urlPatterns = "/LoginControl")
public class LoginControl extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //step1: 获取用户提交的用户名和口令
        String username = request.getParameter("loginName");
        String password = request.getParameter("loginPassWord");
        User user = new User(username, password);
        //step2：数据库验证用户
        UserService userService = new UserService();
        if (userService.validateUser(user)) {
            request.getRequestDispatcher("show.jsp").forward(request, response);
        }else {
            response.sendRedirect("mylogintest.html");
        }

    }
}
