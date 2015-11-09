/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

/**
 *
 * @author Ambrosio
 */
public class PruebaConsulta extends Conexion{

    public PruebaConsulta() {
        super();
    }
    
    public void insertarRegistroEnInsumos(String nombre, String medida){
        this.conectar();
        try {
            this.s = this.connection.createStatement();
            int estado = s.executeUpdate("INSERT INTO insumos (nombre,medida) VALUES ('"+nombre+"','"+medida+"')");
            if(estado == 1){
                System.out.println("Se agrego el registro de manera exitosa");
            }else{
                System.out.println("Ocurrio un problema al agregar el registro");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
    }
    
}
