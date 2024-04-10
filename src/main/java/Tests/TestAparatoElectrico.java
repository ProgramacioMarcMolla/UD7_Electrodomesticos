/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import AparatosElectricos.AparatoElectrico;
import AparatosElectricos.Computador;
import AparatosElectricos.Electrodomestico;
import AparatosElectricos.Lavadora;
import AparatosElectricos.Movil;
import AparatosElectricos.Television;

/**
 *
 * @author mark
 */
public class TestAparatoElectrico {
    
    public static void main(String[] args) {
        
        AparatoElectrico[] listado = new AparatoElectrico[8];
        
        listado[0] = new Lavadora("1234A", "V1", "Bosch", Electrodomestico.Color.BLANCO, Electrodomestico.ConsumoEnergetico.F, 100, 50, 5);
        listado[1] = new Lavadora("1234B", "F22", "Fagor", Electrodomestico.Color.BLANCO, Electrodomestico.ConsumoEnergetico.F, 100, 70, 12);
        listado[2] = new Television("1234C", "SuperGuay", "LG",false,false,45);
        listado[3] = new Television("1234D", "MásChulaA", "Sony",false,false,14);
        listado[4] = new Computador("1234E", 2048, 5000, 1024);
        listado[5] = new Computador("1234F", 1024,10000, 2048);
        listado[6] = new Movil("1234G", "Samsung", "Galaxy S21", Movil.Memoria.MB256);
        listado[7] = new Movil("1234H", "Iphone", "21", Movil.Memoria.MB512);
        
        verListado(listado);
        
        
    }

    private static void verListado(AparatoElectrico[] listado) {
        System.out.println("----------------Lista de aparatos eléctricos----------------");
        for(AparatoElectrico aparato:listado){
            System.out.println("\n"+aparato.toString());
        }
    }
    
    
}
