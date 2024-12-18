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
public class PresentadorMenu {
    private VistaMenu vista;
    private PresentadorAutenticacion p_auth;
    private PresentadorOfertas p_ofertas;
    private PresentadorAltaCliente p_alta_cliente;

    public PresentadorMenu(VistaMenu vista) {
        this.vista = vista;
        this.p_auth = new PresentadorAutenticacion(new VistaAutenticacion());
        this.p_ofertas = new PresentadorOfertas(new VistaOfertas());
        this.p_alta_cliente = null;
    }   
    
    public void mostrar_menu() {
        String[] opciones;
        int opcion;
        if (p_auth.devolver_usuario() instanceof Cliente) {
            opciones = new String[] {"Cerrar sesión", "Consultar ofertas disponibles"};        
        } else if (p_auth.devolver_usuario() instanceof TecnicoComercial) {
            opciones = new String[] {"Cerrar sesión", "Registrar nuevo cliente", "Ofrecer oferta más ventajosa"};        
        } else if (p_auth.devolver_usuario() instanceof AgenteAseguradora) {
            opciones = new String[] {"Cerrar sesión", "Consultar ofertas aseguradora"};
        } else {
            opciones = new String[] {"Iniciar sesión"};
        }
        
        this.vista.mostrar_menu(opciones);
        
        do {
            opcion = this.vista.pedir_opcion();
        } while (opcion < 0 || opcion > opciones.length);     
        
        redireccionar_presentador(opcion);
    }
    
    public void redireccionar_presentador(int opcion) {
        if (opcion == 0) {
            System.out.println("\n\n\nSaliendo del programa... ¡Gracias por usar UPNA Direct!\n\n\n");
            System.exit(0);
        } else if (p_auth.devolver_usuario() instanceof Cliente) {
            redirect_cliente(opcion);
        } else if (p_auth.devolver_usuario() instanceof AgenteAseguradora) {
            redirect_agente(opcion);
        } else if (p_auth.devolver_usuario() instanceof TecnicoComercial) {
            redirect_tecnico(opcion);
        }
        redirect_login();
    }
    
    private void redirect_login() {
        p_auth.iniciar_sesion();
    }
    
    private void redirect_cliente(int opcion) {
        switch (opcion) {
            case 1:
                p_auth.cerrar_sesion();
                break;
            case 2:
                this.p_ofertas.consultar_ofertas(this.p_auth.devolver_usuario());
                break;
            default:
                this.vista.mostrar_error_opcion();
                break;
            
        }
    }
    private void redirect_agente(int opcion) {
        switch (opcion) {
            case 1:
                p_auth.cerrar_sesion();
                break;
            case 2:
                this.p_ofertas.consultar_ofertas(this.p_auth.devolver_usuario());
                break;
            default:
                this.vista.mostrar_error_opcion();
                break;
            
        }
    }
    private void redirect_tecnico(int opcion) {
        switch (opcion) {
            case 1:
                p_auth.cerrar_sesion();
                break;
            case 2:
                if (this.p_alta_cliente == null) {
                    this.p.alta_cliente = new PresentadorAltaCliente(new VistaAltaCliente());
                }
                this.p_alta_cliente.registrar_nuevo_cliente();
                break;
            case 3:
                this.p_ofertas.devolver_oferta_mas_ventajosa();
                break;
            default:
                this.vista.mostrar_error_opcion();
                break;
            
        }
    }
}
