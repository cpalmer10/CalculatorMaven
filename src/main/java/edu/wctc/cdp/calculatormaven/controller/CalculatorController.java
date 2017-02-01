/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.cdp.calculatormaven.controller;

import edu.wctc.cdp.calculatormaven.model.CalculatorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.wctc.cdp.calculatormaven.calculatorstrategy.Circle;
import edu.wctc.cdp.calculatormaven.calculatorstrategy.Rectangle;
import edu.wctc.cdp.calculatormaven.calculatorstrategy.Triangle;


/**
 *
 * @author Chris
 */
@WebServlet(name = "CalculatorController", urlPatterns = {"/CalculatorController"})
public class CalculatorController extends HttpServlet {
    
    private final String START_PAGE = "index.jsp";
    private final String RESULT_PAGE = "result.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       
        response.setContentType("text/html;charset=UTF-8");
        Circle cir = new Circle();       
        CalculatorService service = new CalculatorService();
        
        String calcType = request.getParameter("calcType");
        
        
        //Area of Rectangle
        String width = request.getParameter("width");
        String length = request.getParameter("length");
        String radius = request.getParameter("radius");
        String sideA = request.getParameter("sideA");
        String sideB = request.getParameter("sideB");
        
        if (calcType.equals("rectangle")){
            double areaRectangle = cir.calculateArea(length, width, "", "", "");
            request.setAttribute("answer", areaRectangle);
           
        } 
        else if (calcType.equals("circle")){
            double areaCircle = cir.calculateArea("", "", radius, "", "");
            request.setAttribute("answer", areaCircle);
        }
        else if (calcType.equals("triangle")){
            double hypotenuse = cir.calculateArea("", "", "", sideA, sideB);
            request.setAttribute("answer", hypotenuse);
        }
        
        
        
        //double area = service.calculateRectangle(width, length);
      
        
        
        RequestDispatcher view =
            request.getRequestDispatcher(RESULT_PAGE);
            view.forward(request, response);
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}
