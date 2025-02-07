
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.business.Person;
import za.ac.tut.business.PersonalisedGreeting;


public class PersonalisedWebAppServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //extract name and gender
        String nameSurname = request.getParameter("nameSurname");
        String gender = request.getParameter("gender");
        
        //do something with data
        Person person = new Person(nameSurname, gender);
        PersonalisedGreeting pG = new PersonalisedGreeting(person);
        String nameAndSurname = pG.gettingNameSurname();
        
        System.out.println(nameAndSurname);
        String title =pG.determineTitle();
        
        System.out.println(title);
        
        request.setAttribute("nameSurname", nameSurname);
        request.setAttribute("gender", gender);
        
        request.setAttribute("nameAndSurname", nameAndSurname);
        request.setAttribute("title", title);
        
        RequestDispatcher rD= request.getRequestDispatcher("personalisedGreeting.jsp");
        rD.forward(request, response);
       
    }
 

}
