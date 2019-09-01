//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/lifeCycle")
//public class HelloServlet extends HttpServlet {
//
//    @Override
//    public void init() throws ServletException {
//        System.out.println("Servlet initialization");
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("do get method");
//        String string = "<html>" +
//                "<header><title>Life cycle</title></header>" +
//                "<body>" +
//                "<h3>It is lifecycle of my servlet</h3>" +
//                "</body>" +
//                "</html>";
//        resp.getWriter().write(string);
//    }
//
//    //    run same code if user use POST method
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doGet(req, resp);
//    }
//
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        System.out.println("service method");
//        super.service(req, res);
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("destroy");
//    }
//}
