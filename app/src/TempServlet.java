import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/temp")
public class TempServlet extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String var1 = req.getParameter("var1");
//        System.out.println(var1);
//
////        Take table of parameters with one nameValue
//        String[] varibles = req.getParameterValues("type");
//        for (String myVar : varibles) {
//            System.out.println(myVar);
//        }
//
////        Get parameters name & value
//        Enumeration<String> parametersName = req.getParameterNames();
//        while (parametersName.hasMoreElements()) {
//            String elementName = parametersName.nextElement();
//            System.out.println(elementName + " = " + req.getParameter(elementName));
//        }
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String one = req.getParameter("one");
        String two = req.getParameter("two");
        resp.getWriter().write("<HTML>" +
                "<head></head>" +
                "<body>" +
                "one = " + one +
                "two = " + two +
                "<form action='temp2' method='post'>" +
                "<input type='text' name='one'/><br>" +
                "<input type='text' name='two'/><br>" +
                "<input type='submit' name='Submit'>" +
                "</form>" +
                "</body>" +
                "</HTML>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}


