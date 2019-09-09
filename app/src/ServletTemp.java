import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/temp")
public class ServletTemp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headersNames = req.getHeaderNames();
        while (headersNames.hasMoreElements()) {
            String s = headersNames.nextElement();
            System.out.println(s + " = " + req.getHeader(s));
        }

//        resp.setStatus(HttpServletResponse.SC_OK);
//        resp.sendRedirect("/hello");
        resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "O no !!!!!!!!!!!!!");
    }
}
