package hello.utils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yang on 2018/5/10.
 */
@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) req;
        HttpServletResponse response= (HttpServletResponse) resp;
        String  role = (String) request.getSession().getAttribute("role");
        System.out.println("role = " + role);
        if (!"fall".equals(role)) {
            chain.doFilter(req, resp);
        }
        else {
            response.sendRedirect("/application/login.jsp");
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
