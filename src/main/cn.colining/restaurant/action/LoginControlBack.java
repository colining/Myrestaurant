package restaurant.action;


import com.sun.org.apache.regexp.internal.RE;
import com.sun.xml.internal.bind.v2.model.core.ID;
import log4j2.Log4j2test;
import org.apache.logging.log4j.LogManager;
import restaurant.bean.CartItemBean;
import restaurant.bean.Dish;
import restaurant.bean.User;
import restaurant.biz.DishService;
import restaurant.biz.UserService;
import restaurant.dao.DishDAOImpl;
import restaurant.utils.JDBCUtils;
import restaurant.utils.PageModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.logging.Logger;

/**
 * Created by asus on 2017/5/20.
 */
@WebServlet(name = "LoginControlBack", urlPatterns = "/LoginControlBack", initParams = {
        @WebInitParam(name = "test", value = "this is initParam")
})

public class LoginControlBack extends HttpServlet implements Log4j2test {
    public static void main(String[] args) {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取当前请求页面的类型，是登录呢，还是购物车呢？
        String actionType = request.getParameter("actionType");
        switch (actionType) {
            case "login":
                loginCheck(request, response);
                break;
            case "pageList":
                pageListView(request, response);
                break;
            case "detail":
                //todo
            case "dishToCart":
                dishToCart(request, response);
                break;
            case "car":
                //todo
        }
    }

    private void dishToCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dishId = (request.getParameter("dishId"));
        Map<Integer, CartItemBean> shoppingCar = (Map<Integer, CartItemBean>) request.getSession().getAttribute("shoppingCar");
        if (shoppingCar == null) {
            shoppingCar = new HashMap<Integer, CartItemBean>();

        }
        if (dishId != null && !"".equals(dishId)) {
            DishService dishService = new DishService();
            Dish dish = dishService.getDish(dishId);
            int Id = Integer.parseInt(dishId);
            if (shoppingCar.containsKey(Id)) {
                shoppingCar.get(Id).setQuantity(shoppingCar.get(Id).getQuantity()+1);
                CartItemBean cartItemBean = shoppingCar.get(Id);
                shoppingCar.put(Id,cartItemBean);
            } else {
                CartItemBean cartItemBean = new CartItemBean(dish,1);
                shoppingCar.put(Id, cartItemBean);
            }
            CartItemBean cartItemBean = shoppingCar.get(Id);
            request.getSession().setAttribute("shoppingCar", shoppingCar);
        }
        RequestDispatcher requestDispatcher = null;
        requestDispatcher = request.getRequestDispatcher("shopCart.jsp");
        requestDispatcher.forward(request, response);
    }

    /**
     * 登录检查
     *
     * @param request
     * @param response
     */
    private void loginCheck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //step1: 获取用户提交的用户名和口令
        String userName = request.getParameter("loginName");
        String password = request.getParameter("loginPassWord");
        User loginUser = new User(userName, password);

        //step2 :数据库验证
        UserService userService = new UserService();
        RequestDispatcher requestDispatcher = null;

        if (userService.validateUser(loginUser)) {
            //验证通过的话
            HttpSession httpSession = request.getSession(true);
            httpSession.setAttribute("loginUser", loginUser);

            DishService dishService = new DishService();
            int pageNO = 1;

            int pageSize = getPageSize();
            PageModel<Dish> pageModel = dishService.findDish4PageList(pageNO, pageSize);

            request.setAttribute("dishList", pageModel.getList());
            request.setAttribute("pageModel", pageModel);

            requestDispatcher = request.getRequestDispatcher("show2.jsp?pageNO=1&totalPages=" + pageModel.getTotalPages());
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect("login.html");
        }
    }

    private int getPageSize() {
        InputStream in = JDBCUtils.class.getClassLoader().
                getResourceAsStream("page.properties");
        Properties prop = new Properties();
        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(prop.getProperty("pageSize"));
    }

    /**
     * 分页显示
     *
     * @param request
     * @param response
     */
    private void pageListView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取当前页号
        int pageNO = Integer.parseInt(request.getParameter("pageNO"));

        DishService dishService = new DishService();
        int pageSize = getPageSize();
        PageModel<Dish> pageModel = dishService.findDish4PageList(pageNO, pageSize);
        request.setAttribute("dishList", pageModel.getList());
        request.setAttribute("pageModel", pageModel);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("show2.jsp?pageNO=" + pageNO + "&totalPages=" + pageModel.getTotalPages());
        requestDispatcher.forward(request, response);
    }
}
