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
public class Oferta {
    private float importe;
    private float comision;
    private Aseguradora aseguradora;
    private Bien bien;
    private Cliente cliente;
    
    public float devolver_importe() {
        return this.importe;
    }
    
    public float devolver_comision() {
        return this.comision;
    }
    
    public Aseguradora devolver_aseguradora() {
        return this.aseguradora;
    }
    
    public Bien devolver_bien() {
        return this.bien;
    }
    
    public Cliente devolver_cliente() {
        return this.cliente;
    }
}
