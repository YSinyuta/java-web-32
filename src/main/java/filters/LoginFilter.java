package filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //1-пользователь не залогинен и он идет на /login
        //2-пользователь не залогинен и он идет на по любой др ссылке
        //3-тянутся картинки и файлы css для отображения страницы
        //4-пользователь залогинен и он переходит по любой ссылке,кроме /login
        //5-пользователь залогинен и он переходит на /login

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        String url = req.getRequestURI(); // /login,/,sdfdh.jpg
        if (url.endsWith(".css") || url.endsWith(".js")) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        Object isLogin = req.getSession().getAttribute("isLogin");
        if (isLogin != null && url.endsWith("/login")) {
            resp.sendRedirect("/");
            return;
        }
        if (isLogin != null && !url.endsWith("/login")) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        if (url.endsWith("/login")){
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }else{
            resp.sendRedirect("/login");
            return;
        }
    }

    @Override
    public void destroy() {

    }
}
