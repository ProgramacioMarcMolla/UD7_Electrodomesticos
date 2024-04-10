/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

/**
 *
 * @author mark
 */
public class Television extends Electrodomestico {
    
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
        
        return numSerie == otraTelevision.numSerie;
    }
    
    
    
    
}
