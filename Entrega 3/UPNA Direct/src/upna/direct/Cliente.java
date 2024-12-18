/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upna.direct;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author n
 */
public class Cliente extends Usuario {
    private float salario;
    private Date fecha_nacimiento;
    
    public Cliente(String nombre_usuario, String contrasenia, float salario, Date fecha) {
        super(nombre_usuario, contrasenia);
        this.salario = salario;
        this.fecha_nacimiento = fecha;
    }
    
    public int calcular_edad() {
        Calendar fechaActual = Calendar.getInstance();
        
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(this.fecha_nacimiento);

        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        
        return edad;
    }
    
    public float devolver_salario() {
        return this.salario;
    }
    /*
        import java.text.SimpleDateFormat;
        import java.text.ParseException;
    
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fecha = formatoFecha.parse("19/12/2003");
        } catch (ParseException e) {
            System.out.println("[ERROR] Formato de fecha inválido. Use DD/MM/YYYY.");
        }
        Cliente c = new Cliente(fecha);
        System.out.println(c.calcular_edad());
    */
}
