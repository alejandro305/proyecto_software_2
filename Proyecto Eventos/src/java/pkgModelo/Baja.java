/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import java.sql.ResultSet;

/**
 *
 * @author Ambrosio
 */
public class Baja extends Conexion {

    public Baja() {
        super();
    }

    public String ingresar(String nombre, String medida) {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("INSERT INTO insumos (nombre,medida) VALUES ('" + nombre + "','" + medida + "')");
            if (estado == 1) {
                return "Se ingresó el registro de manera exitosa";
            } else {
                return "Ocurrió un problema al ingresar el registro";
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
            return "Error al intentar ingresar un nuevo insumo";
        }
    }


    public String eliminar(String id) {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("DELETE FROM bajas WHERE id=" + id + ";");
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

}
