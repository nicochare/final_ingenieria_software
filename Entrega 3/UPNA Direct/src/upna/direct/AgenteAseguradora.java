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
public class AgenteAseguradora extends Usuario {
    private Aseguradora aseguradora;
    
    public AgenteAseguradora(String nombre_usuario, String contrasenia, Aseguradora aseguradora) {
        super(nombre_usuario, contrasenia);
        this.aseguradora = aseguradora;
    }
    
    public Aseguradora devolver_aseguradora() {
        return this.aseguradora;
    }
}
