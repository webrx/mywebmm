package cn.webrx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>功能描述: </p>
 *
 * @author webrx
 * @version 1.0
 * @date 2019-07-30 17:05
 */
@WebServlet("/show.do")
public class Show extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>玉灵 QQ:7031633 Email:webrx@126.com</title>");
        out.println("<meta name=\"keywords\" content=\"关键字\">");
        out.println("<meta name=\"description\" content=\"简介\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Hello World  中文效果2222222222222</h3>");
        out.println("<h3>Hello World  中文效果222222666666222</h3>");
        out.println("<h3>Hello World  中文效果2222222222222</h3>");

        out.println("<h3>Hello World  中文效果2222222222222</h3>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }
}
