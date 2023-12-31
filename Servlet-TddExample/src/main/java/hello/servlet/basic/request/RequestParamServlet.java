package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("전체 파라미터 조회 시작");
        request.getParameterNames().asIterator().forEachRemaining(paramName -> System.out.println("request.getParameter(paramName) = " + request.getParameter(paramName)));
        System.out.println("전체 파라미터 조회 끝");

        //username = hello, hell2 복수 전달
        System.out.println("이름이 같은 복수 파라미터 조회 ");
        String username[] = request.getParameterValues("username");
        for(String name : username) {
            System.out.println("username = " + name);
        }


    }
}
