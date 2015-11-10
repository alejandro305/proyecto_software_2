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
public class Alta extends Conexion {

    public Alta() {
        super();
    }

    public String ingresar(String insumo, String cantidad, String precio) {
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("INSERT INTO altas (id_insumo,cantidad,precio_total) VALUES (" + insumo + "," + cantidad + "," + precio + ")");
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

    

}
