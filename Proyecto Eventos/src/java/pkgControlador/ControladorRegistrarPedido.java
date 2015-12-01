/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgControlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pkgModelo.Pedido;
import pkgModelo.Plato;

/**
 *
 * @author Sebas
 */
public class ControladorRegistrarPedido extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int total = Integer.parseInt(request.getParameter("total"));
        Plato plato = new Plato();
        Pedido pedido = new Pedido();
        if (total == -1) {
            int id = pedido.ingresarBlancoObteniedoId();
            response.getWriter().write(id + "");
            System.out.println(id);
        } else if (total == -2) {

            LinkedList<String> nombre = plato.listarNombresPLatos();

            String combobox = "<select id=\"cmbPlatos\">\n<option value=\"\"></option>";
            for (String nombre1 : nombre) {
                combobox += "<option value=\"" + nombre1 + "\">" + nombre1 + "</option>";
            }
            combobox += "</select>";
            response.getWriter().write(combobox);
        } else if (total == -3) {
            int idPedido = Integer.parseInt(request.getParameter("idPedido"));
            int valorTotalPedido = Integer.parseInt(request.getParameter("valorTotalPedido"));
            pedido.modificarValorPedido(idPedido, valorTotalPedido);
            pedido.eliminarPedidosInvalidos();

        } else {
            int idPedido = Integer.parseInt(request.getParameter("idPerdido"));
            String nombrePlato = request.getParameter("nombrePlato");
            int cantidad = Integer.parseInt(request.getParameter("cantidad"));
            System.out.println(idPedido + "" + nombrePlato + "" + cantidad);

            int[] datosPlato = plato.obtenerPrecioDePlato(nombrePlato);
            int precioTotal = datosPlato[1] * cantidad;

            pedido.insertarPedidoPlato(idPedido, datosPlato[0], precioTotal);
            response.getWriter().write(precioTotal + "");
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
