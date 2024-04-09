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

    public Television(String numSerie, String marca, String modelo) {
        super(numSerie,marca,modelo);
        this.resolucion = RESOLUCION_DEFAULT;
        this.wifiHabilitado = false;
        this.estaConectadoInternet = false;
    }
    
    
    
}
