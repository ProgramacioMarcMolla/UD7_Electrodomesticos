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
public class Router extends AparatoElectrico{
    
    private final String TIPO_APARATO = "Router";
    private Conectable[] conexiones;
    private final int TAMANO_ROUTER = 5;
    
    public Router(String numSerie){
        super(numSerie);
        this.conexiones = new Conectable[TAMANO_ROUTER];
    }

    @Override
    public String getTipo(){
        return TIPO_APARATO;
    }
    
    public boolean emparejar(Conectable aparato){
        for(int i = 0; i<conexiones.length; i++){
            if(conexiones[i] == null){
                conexiones[i] = aparato;
                aparato.establecerConexion();
                return true;
            }
            
        }
        return false;
    }
    
    public boolean desemparejar(Conectable aparato){
        
        for(int i = 0; i<conexiones.length; i++){
            if(conexiones[i] == null){
                continue;
            }
            if(conexiones[i].equals(aparato)){
                conexiones[i] = null;
                aparato.quitarConexion();
                return true;
            }
            
        }
        return false;
    }
    
    private int obtenerNumeroDeDispositivosEmparejados(){
        actualizarDispositivosEmparejados();
        int contador = conexiones.length;
        for (Conectable conexion : conexiones) {
            if (conexion == null) {
                contador--;
            }
        }
        return contador;
    }
    public void listarConectados(){
        actualizarDispositivosEmparejados();
        for(int i = 0; i<conexiones.length; i++){
            if(conexiones[i] != null){
                System.out.println(conexiones[i]);
            }
        }
        
        System.out.println("\nSe han conectado"+ obtenerNumeroDeDispositivosEmparejados()+"/"+this.conexiones.length);
    }
    
    private void actualizarDispositivosEmparejados(){
        Conectable temp;
        
        for(int i = 0; i<conexiones.length; i++){
            if(conexiones[i] == null){
                continue;
            }
            temp = conexiones[i];
            conexiones[i] = null;
            if(!(emparejar(temp))){
               temp.quitarConexion();
            }
        }
    }

    
    
}
