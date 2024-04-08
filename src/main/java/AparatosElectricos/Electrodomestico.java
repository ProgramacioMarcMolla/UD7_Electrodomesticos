/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

/**
 *
 * @author mark
 */
public class Electrodomestico extends  AparatoElectrico {
    
     protected float precioBase;
     protected String marca;
     protected String modelo;
     protected Color color;
     protected ConsumoEnergetico consumoEnerg;
     protected int peso;
    
    public Electrodomestico(String numSerie){
       super(numSerie);
       //
       
       
    }
    
    private enum Color{
        BLANCO,NEGRO,ROJO,AZUL,GRIS
    }
    
    private enum ConsumoEnergetico{
        A,B,C,D,E,F
    }
    
}


