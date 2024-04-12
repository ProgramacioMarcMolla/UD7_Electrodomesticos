/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

import Interfaces.Conectable;

/**
 *
 * @author mark
 */
public class Router extends AparatoElectrico {

    private final String TIPO_APARATO = "Router";
    private Conectable[] conexiones;
    private final int TAMANO_ROUTER = 5;
    
    private static final String VERDE = "\u001B[32m";
    private static final String ROJO = "\u001B[31m";
    private static final String RESET = "\u001B[0m";


    public Router(String numSerie) {
        super(numSerie);
        this.conexiones = new Conectable[TAMANO_ROUTER];
    }

    @Override
    public String getTipo() {
        return TIPO_APARATO;
    }

    public boolean emparejar(Conectable aparato) {
        
        if(!(isDisponible())){
            System.out.println(ROJO+"El router no está disponible (sin corriente o no encendido)");
            return false;
        }
        
        if(comprobarAparatoEnLista(aparato)){
            return false;
        }
        
        for (int i = 0; i < conexiones.length; i++) {
            if (conexiones[i] == null) {

                if (aparato.sePermiteConexion()) {
                    conexiones[i] = aparato;
                    aparato.establecerConexion();
                    return true;
                } else {
                    return false;
                }

            }

        }
        return false;
    }
    
    private boolean comprobarAparatoEnLista(Conectable aparato){
        for(int i = 0; i<this.conexiones.length; i++){
            if(this.conexiones[i] == null){
                continue;
            }
            if(this.conexiones[i].equals(aparato)){
                System.out.println("["+aparato.getTipo()+"] El aparato ya está concectado");
                return true;
            }
        }
        return false;
    }

    public boolean desemparejar(Conectable aparato) {

        for (int i = 0; i < conexiones.length; i++) {
            if (conexiones[i] == null) {
                continue;
            }
            if (conexiones[i].equals(aparato)) {
                conexiones[i] = null;
                aparato.quitarConexion();
                return true;
            }

        }
        return false;
    }

    private int obtenerNumeroDeDispositivosEmparejados() {
        actualizarDispositivosEmparejados();
        int contador = conexiones.length;
        for (Conectable conexion : conexiones) {
            if (conexion == null) {
                contador--;
            }
        }
        return contador;
    }

    public void listarConectados() {
        actualizarDispositivosEmparejados();
        for (int i = 0; i < conexiones.length; i++) {
            if (conexiones[i] != null) {
                System.out.println(conexiones[i]);
            }
        }

        System.out.println("\nSe han conectado " + obtenerNumeroDeDispositivosEmparejados() + "/" + this.conexiones.length + "aparatos");
    }

    private void actualizarDispositivosEmparejados() {

        for(int i = 0; i<conexiones.length; i++){
            if(conexiones[i] == null){
                continue;
            }
            if(!(conexiones[i].sePermiteConexion())){
                conexiones[i] = null;
            }  
        }
         
    }
    
    private boolean isDisponible() {
        return this.estaEncendida && this.tieneCorrienteElectrica;
    }
    
    @Override
    public void activar(){
        if(this.tieneCorrienteElectrica){
            System.out.println(VERDE+"["+TIPO_APARATO+"] "+" Aparato encendido "+RESET);
            this.estaEncendida = true;
            return;
        }
        System.out.println(ROJO+"["+TIPO_APARATO+"] "+" No se puede encender (no hay corriente)"+RESET);
        this.estaEncendida = false;
    }
    
    @Override
    public void desactivar(){
        System.out.println(ROJO+"["+TIPO_APARATO+"] "+" Aparato no está encendido "+RESET);
        this.estaEncendida = false;
    }
    
    

}
