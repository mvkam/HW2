package hw22;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnketaServlet extends HttpServlet {

    public class Member {
        String name;
        String surname;
        String gender;
        String pet;
    }

    ArrayList<Member> members = new ArrayList<>();

    public static int maleNum;
    public static int femaleNum;
    public static int dogsNum;
    public static int catsNum;
    public static int counter;

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        members.add(new Member());
        members.get(counter).name = req.getParameter("name");
        members.get(counter).surname = req.getParameter("surname");
        String gender = req.getParameter("gender");
        String pet = req.getParameter("pet");

        if ("male".equals(gender)) {
            members.get(counter).gender = "male";
            maleNum++;
        } else {
            members.get(counter).gender = "female";
            femaleNum++;
        }

        if ("dogs".equals(pet)) {
            members.get(counter).pet = "dogs";
            dogsNum++;
        } else {
            members.get(counter).pet = "cats";
            catsNum++;
        }

        counter++;

        RequestDispatcher view = req.getRequestDispatcher("statistic.jsp");
        view.forward(req, resp);
    }
}
