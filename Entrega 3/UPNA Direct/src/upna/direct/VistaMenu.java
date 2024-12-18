/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upna.direct;
import java.util.Scanner;

/**
 *
 * @author n
 */
public class VistaMenu {
    private final Scanner scanner = new Scanner(System.in);
    
    private void mostrar_opcion(int nro, String msg) {
        System.out.println("      --- " + nro + ": " + msg);
    }
    
    private void mostrar_opciones(String[] opciones) {
        mostrar_opcion(0, "Salir");
        
        for (int i = 0; i < opciones.length; i++) {
            mostrar_opcion(i+1, opciones[i]);
        }
    }
    
    private void mostrar_bienvenida() {
        System.out.println("\n--- Bienvenido al sistema UPNA Direct de correduría de seguros ---");
        System.out.println("  --- Opciones:");
    }
    
    public int pedir_opcion() {
        System.out.println("          --- Eleccion: ");
        int opcion = scanner.nextInt();
        
        return opcion;
    }

    public void mostrar_menu(String[] opciones) {
        mostrar_bienvenida();
        mostrar_opciones(opciones);
    }
    
    public void mostrar_error_opcion() {
        System.out.println("\n[ERROR] Opción elegida inválida.\n");
    }
}
