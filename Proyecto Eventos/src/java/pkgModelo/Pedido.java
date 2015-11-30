/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Sebas
 */
public class Pedido extends Conexion {

    public Pedido() {
        super();
    }

    public String listarPedidosPendientes() {
        String tabla = "";
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            ResultSet res = s.executeQuery("SELECT id,costo_final,estado FROM pedidos WHERE  costo_final > -1");
            tabla = "<table border='1' style='width:100%'><tr>\n"
                    + "    <th>id</th>\n"
                    + "    <th>costo_final</th>\n"
                    + "    <th>estado</th>\n"
                    + "  </tr>";
            while (res.next()) {
                tabla += "<tr>\n"
                        + "    <td>" + res.getString("id") + "</td>\n"
                        + "    <td>$" + res.getString("costo_final") + "</td>\n"
                        + "    <td>" + res.getString("estado") + "</td>\n"
                        + "  </tr>";
            }
            tabla += "</table> ";

        } catch (Exception e) {
            System.out.println("Error de conexion");

        }
        return tabla;
    }

    public LinkedList<Integer> listarIdentificadoresDePedidosEnEspera() {
        LinkedList<Integer> identificadores = new LinkedList<>();
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            ResultSet res = s.executeQuery("SELECT id FROM pedidos WHERE  UPPER(estado) = 'ESPERA' and costo_final > -1");
            while (res.next()) {
                identificadores.add(Integer.parseInt(res.getString("id")));
            }

        } catch (Exception e) {
            System.out.println("Error de conexion");

        }
        return identificadores;
    }

    public LinkedList<Integer> listarIdentificadoresDePedidos() {
        LinkedList<Integer> identificadores = new LinkedList<>();
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            ResultSet res = s.executeQuery("SELECT id FROM pedidos WHERE costo_final > -1");
            while (res.next()) {
                identificadores.add(Integer.parseInt(res.getString("id")));
            }

        } catch (Exception e) {
            System.out.println("Error de conexion");

        }
        return identificadores;
    }

    public void insertarPedidoPlato(int idPedido, int idPlato, int valor) {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("INSERT INTO platos_pedido (id_pedido,id_plato,costo_estimado) VALUES (" + idPedido + "," + idPlato + "," + valor + ")");
            if (estado == 1) {
                System.out.println("Se ingresó el registro de manera exitosa");
            } else {
                System.out.println("Ocurrió un problema al ingresar el registro");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
    }

    public void modificarValorPedido(int id, int valor) {

        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("UPDATE pedidos SET costo_final=" + valor + " where id=" + id + ";");
            if (estado == 1) {
                System.out.println("Se ingresó el registro de manera exitosa");
            } else {
                System.out.println("Ocurrió un problema al ingresar el registro");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
    }

    public void modificarEstadoPedido(int id, String estadoPedido) {

        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("UPDATE pedidos SET estado='" + estadoPedido + "' where id=" + id + ";");
            if (estado == 1) {
                System.out.println("Se ingresó el registro de manera exitosa");
            } else {
                System.out.println("Ocurrió un problema al ingresar el registro");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
    }

    private int obtenerIDUltimoPlato() {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM pedidos WHERE costo_final = -100;");
            res.next();
            int idPedido = res.getInt("id");
            return idPedido;

        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
        return -1;
    }

    public int ingresarBlancoObteniedoId() {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("INSERT INTO pedidos (costo_final,estado) VALUES ('" + -100 + "','ESPERA');");
            int idPedido = obtenerIDUltimoPlato();
            if (estado == 1) {
                System.out.println("Se ingresó el registro de manera exitosa");
                return idPedido;
            } else {
                System.out.println("Ocurrió un problema al ingresar el registro");

            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
        return -1;
    }

    public void eliminarPedidosInvalidos() {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("DELETE FROM pedidos where costo_final = -100;");
            if (estado == 1) {
                System.out.println("Se ingresó el registro de manera exitosa");
            } else {
                System.out.println("Ocurrió un problema al ingresar el registro");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
    }

    public void ingresar(int total) {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("INSERT INTO pedidos (costo_final) VALUES ('" + total + "')");
            if (estado == 1) {
                System.out.println("Se ingresó el registro de manera exitosa");
            } else {
                System.out.println("Ocurrió un problema al ingresar el registro");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
    }

    public String eliminar(String id) {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("DELETE FROM pedidos WHERE id=" + id + ";");
            if (estado == 1) {
                return "Se eliminó el registro de manera exitosa";
            } else {
                return "Ocurrió un problema al eliminar el registro";
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
            return "Error al intentar eliminar un pedido";
        }
    }

}
