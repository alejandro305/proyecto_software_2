/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import java.sql.ResultSet;

/**
 *
 * @author Sebas
 */
public class Pedido extends Conexion {

    public Pedido() {
        super();
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
            return "Error al intentar eliminar un insumo";
        }
    }
    
    
    
    
    
    
    public void modificarPedido(int id, int valor) {

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
            int estado = s.executeUpdate("INSERT INTO pedidos (costo_final) VALUES ('" + -100 + "');");
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
