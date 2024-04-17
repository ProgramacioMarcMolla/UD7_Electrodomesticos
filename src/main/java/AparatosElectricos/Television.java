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
public class Television extends Electrodomestico implements Conectable{
    
    private int resolucion;
    private final int RESOLUCION_DEFAULT = 20;
    private boolean wifiHabilitado;
    private boolean estaConectadoInternet;
    
    private final String TIPO_APARATO = "Televisión"; 

    public Television(String numSerie, String marca, String modelo) {
        super(numSerie,marca,modelo);
        this.resolucion = RESOLUCION_DEFAULT;
        this.wifiHabilitado = false;
        this.estaConectadoInternet = false;
    }
    
    public Television(String numSerie, String marca, String modelo, boolean wifiHabilitado, boolean estaConectadoInternet, int resolucion){
        super(numSerie,marca,modelo);
        this.wifiHabilitado = wifiHabilitado;
        this.estaConectadoInternet = estaConectadoInternet;
        this.resolucion = resolucion;
    }
    
    public void habilitarWifi(){
        this.wifiHabilitado = true;
    }
    
    public void deshabilitarWifi(){
        this.wifiHabilitado = false;
    }
    
    @Override
    public String getTipo(){
        return TIPO_APARATO;
    }
    
    @Override
    public double obtenerPrecioVenta(){
        if(this.resolucion > 40){
            return super.obtenerPrecioVenta() + (0.3 * super.obtenerPrecioVenta());
        }
        return super.obtenerPrecioVenta();
    }
    
    @Override
    public String toString(){
        String wifiString = "Wifi deshabilitado";
        if(this.wifiHabilitado){
            wifiString = "Wifi habilitado";
        }
        
        String conectadoInternetString = "No conectado a Internet";
        if(this.estaConectadoInternet){
            conectadoInternetString = "Conectado a Internet";
        }
        
        return "["+TIPO_APARATO+"] "+ super.toString()+", Precio Final: " + this.obtenerPrecioVenta()+", "+wifiString+", "+estaConectadoInternet+", Resolución: "+this.resolucion;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Television otraTelevision = (Television) o;
        
        return numSerie.equals(otraTelevision.numSerie);
    }
    
    @Override
    public void activar(){
        if(this.tieneCorrienteElectrica){
            System.out.println("["+TIPO_APARATO+"] "+" Aparato encendido ");
            this.estaEncendida = true;
            return;
        }
        System.out.println("["+TIPO_APARATO+"] "+" No se puede encender (no hay corriente)");
        this.estaEncendida = false;
    }
    
    @Override
    public void desactivar(){
        System.out.println("["+TIPO_APARATO+"] "+" Aparato no está encendido ");
        this.estaEncendida = false;
    }

    @Override
    public boolean sePermiteConexion() {
        return this.tieneCorrienteElectrica&&this.estaEncendida&&this.wifiHabilitado;
    }

    @Override
    public void establecerConexion() {
        this.estaConectadoInternet = true;
        System.out.println("["+TIPO_APARATO+"] Aparato emparejado con éxito ");
    }

    @Override
    public void quitarConexion() {
        this.estaConectadoInternet = false;
        System.out.println("["+TIPO_APARATO+"]  Aparato desemparejado");
    }
    
    
    
    
    
}
