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
public class UPNADirect {
    public static void main(String[] args) {
        PresentadorMenu presentadorMenu = new PresentadorMenu(new VistaMenu());        
        while(true) {
            presentadorMenu.mostrar_menu();
        }
    }
}
