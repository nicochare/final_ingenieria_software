/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upna.direct;

/**
 *
 * @author n
 */
public class Usuario {
    private String nombre_usuario;
    private String contrasenia;
    
    public Usuario(String nombre_usuario, String contrasenia) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
    }
    
    public String devolver_username() {
        return this.nombre_usuario;
    }
}
