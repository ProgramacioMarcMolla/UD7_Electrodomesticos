/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

import AparatosElectricos.Electrodomestico.Color;
import AparatosElectricos.Electrodomestico.ConsumoEnergetico;

/**
 *
 * @author mark
 */
public class Lavadora extends Electrodomestico{
    private double carga;
    private final double CARGA_DEFAULT = 7;
    
    public Lavadora(String numSerie,  String marca, String modelo, Color color, ConsumoEnergetico consumoEnerg,float precioBase, int peso,  float carga){
        super(numSerie,  precioBase,  marca,  modelo, color,  consumoEnerg,  peso);
        this.carga = carga;
    }
    
    public Lavadora(String numSerie, String marca, String modelo){
        super(numSerie,  marca,  modelo);
        this.carga = CARGA_DEFAULT;
    }
    
    @Override
    public double obtenerPrecioVenta(){
        if(this.carga > 10){
            return super.obtenerPrecioVenta() + 50;
        }
        return super.obtenerPrecioVenta();
    }
    
    @Override
    public String toString(){
        return "[Lavadora] "+ super.toString() + ", Precio Final:"+ this.obtenerPrecioVenta()+", Carga: " + this.carga;
    }
    
}
