package controllers;

import jsp.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/tempController")
public class TempController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student("Thomas", 31);
        req.setAttribute("student1", student);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/controllerJsp.jsp");
        requestDispatcher.forward(req, resp);
    }
}
