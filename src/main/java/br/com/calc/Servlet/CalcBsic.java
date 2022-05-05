package br.com.calc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * 
 * Servlet implementation class CalcBsic
 */
@WebServlet(name = "CalcBsic", urlPatterns = {"/CalcBsic"})
public class CalcBsic extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /*
    * @see httpServlet#HttpServlet()
    */
    public CalcBsic(){
        super();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            String svalorA = request.getParameter("valorA");
            String svalorB = request.getParameter("valorB");
            String sopcao = request.getParameter("opcao");
        
            double dvalorA = Double.parseDouble(svalorA);
            double dvalorB = Double.parseDouble(svalorB);
            double resultado = 0;

            switch (sopcao) {
                case "+":
                    resultado = dvalorA + dvalorB;
                    break;
                case "-":
                    resultado = dvalorA - dvalorB;
                    break;
                case "*":
                    resultado = dvalorA * dvalorB;
                    break;
                case "/":
                    resultado = dvalorA / dvalorB;
                    break;
                default:
                    break;
            }
//            out.print("Resultado:<br>"+resultado);
              request.setAttribute("resultado", resultado);
        
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
