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
public class Plato extends Conexion {

    public Plato() {
        super();
    }

    public String ingresar(String descripcion,String nombre,String precio, String ingredientes) {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("INSERT INTO platos (descripcion,nombre,precio,ingredientes) VALUES ('" + descripcion + "','" + nombre + "'," + precio + ",'" + ingredientes + "')");
            if (estado == 1) {
                return "Se ingresó el registro de manera exitosa";
            } else {
                return "Ocurrió un problema al ingresar el registro";
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
            return "Error al intentar ingresar un nuevo plato";
        }
    }

    public String modificar(String id, String descripcion,String nombre,String precio, String ingredientes) {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("UPDATE platos SET descripcion='" + descripcion + "',nombre='" + nombre + "',precio=" + precio + ",ingredientes='" + ingredientes + "' where id=" + id + ";");
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



    public String listar() {
        this.conectar();
        String str="";
        try {
            this.s = this.connection.createStatement();

            ResultSet res = s.executeQuery("SELECT id,descripcion, nombre,precio,ingredientes FROM platos");
            str = "<table border='1' style='width:100%'><tr>\n"
                    + "    <th>id</th>\n"
                    + "    <th>descripcion</th>\n"
                    + "    <th>nombre</th>\n"
                    + "    <th>precio</th>\n"
                    + "    <th>ingredientes</th>\n"
                    + "  </tr>";
            while (res.next()) {
                str += "<tr>\n"
                        + "    <td>" + res.getString("id") + "</td>\n"
                        + "    <td>" + res.getString("descripcion") + "</td>\n"
                        + "    <td>" + res.getString("nombre") + "</td>\n"
                        + "    <td>" + res.getString("precio") + "</td>\n"
                        + "    <td>" + res.getString("ingredientes") + "</td>\n"
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
