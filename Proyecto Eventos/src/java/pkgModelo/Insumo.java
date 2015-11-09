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
public class Insumo extends Conexion {

    public Insumo() {
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

    public String modificar(String id, String nombre, String medida) {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("UPDATE insumos SET nombre='" + nombre + "', medida='" + medida + "' where id=" + id + ";");
            if (estado == 1) {
                return "Se modificó el registro de manera exitosa";
            } else {
                return "Ocurrió un problema al modificar el registro";
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
            return "Error al intentar modificar un insumo";
        }
    }

    public String eliminar(String id) {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("DELTE FROM insumos WHERE id=" + id + ";");
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

    public String listar(String nombre, String medida) {
        this.conectar();
        String str;
        try {
            this.s = this.connection.createStatement();

            ResultSet res = s.executeQuery("SELECT * FROM insumos");
            str = "<table style='width:100%'><tr>\n"
                    + "    <th>id</th>\n"
                    + "    <th>nombre</th>\n"
                    + "    <th>medida</th>\n"
                    + "  </tr>";
            while (rs.next()) {
                str += "<tr>\n"
                        + "    <td>" + res.getString("id") + "</td>\n"
                        + "    <td>" + res.getString("nombre") + "</td>\n"
                        + "    <td>" + res.getString("medida") + "</td>\n"
                        + "  </tr>";
            }
            str += "</table> ";

        } catch (Exception e) {
            System.out.println("Error de conexion");
            str = "Ocurrió un problema al listar los registros";
        }
        return str;
    }

}
