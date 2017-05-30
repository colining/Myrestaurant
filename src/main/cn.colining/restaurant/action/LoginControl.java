package restaurant.action;


import log4j2.Log4j2test;
import restaurant.bean.User;
import restaurant.biz.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by asus on 2017/5/20.
 */
@WebServlet(name = "LoginControl",urlPatterns = "/LoginControl",initParams = {
        @WebInitParam(name = "test",value = "this is initParam")
})

public class LoginControl extends HttpServlet implements Log4j2test{
    public static void main(String[] args) {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("uft-8");
        String a=this.getInitParameter("test");
        logger.debug(a);
        //step1: 获取用户提交的用户名和口令
        String username = request.getParameter("loginName");
        String password = request.getParameter("loginPassWord");
        User user = new User(username, password);
        //step2：数据库验证用户
        UserService userService = new UserService();
        if (userService.validateUser(user)) {
            request.getRequestDispatcher("showback.jsp").forward(request, response);
        }else {
            response.sendRedirect("mylogin.jsp");
        }

    }
}
