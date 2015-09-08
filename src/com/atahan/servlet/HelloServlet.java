package com.atahan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atahan.bean.Dog;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String breed = request.getParameter("breed");
        int age = Integer.parseInt(request.getParameter("age"));
        
        Dog dog = new Dog(breed,age);
        
        PrintWriter out = response.getWriter();
        out.println (
                  "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
                      "http://www.w3.org/TR/html4/loose.dtd\">\n" +
                  "<html> \n" +
                    "<head> \n" +
                      "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
                        "charset=ISO-8859-1\"> \n" +
                      "<title> Dog JSP Servlet Example  </title> \n" +
                    "</head> \n" +
                    "<h1 align='center'> Current Dog </h1>\n" +
                    "<body> <div align='center'> \n" +
                      "<style= \"font-size=\"12px\" color='black'\"" + "\">" +
                        "Breed: " + dog.getBreed() + " <br> " + 
                        "Age: " + dog.getAge() +
                    "</font></body> \n" +
                  "</html>" 
                );      
        }
}