package br.com.calc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet implementation class CalcBsic
 */
@WebServlet(name = "CalcBsico", urlPatterns = {"/CalcBsico"})
public class CalcBsico extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /*
    * @see httpServlet#HttpServlet()
    */
    public CalcBsico(){
        super();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            String svalorC = request.getParameter("valorC");
            String sopcao2 = request.getParameter("opcao2");
        
            double dvalorC = Double.parseDouble(svalorC);
            double resultado2 = 0;

            switch (sopcao2) {
                case "10":
                    resultado2 = dvalorC * 10;
                    break;
                case "100":
                    resultado2 = dvalorC * 100;
                    break;
                case "1000":
                    resultado2 = dvalorC * 1000;
                    break;
                default:
                    break;
            }
            out.print("Resultado:<br>"+resultado2);
              request.setAttribute("resultado2", resultado2);
        
        //Encaminhar para a pg de resposta
                RequestDispatcher rd = request.getRequestDispatcher("resultados.jsp");
                rd.forward(request, response);
    
        }
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
