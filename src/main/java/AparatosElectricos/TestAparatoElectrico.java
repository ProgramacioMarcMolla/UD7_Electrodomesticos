/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

/**
 *
 * @author mark
 */
public class TestAparatoElectrico {
    
    public static void main(String[] args) {
        
        AparatoElectrico[] listado = new AparatoElectrico[8];
        
        listado[0] = new Lavadora("1234A", "V1", "Bosch");
        listado[1] = new Lavadora("1234B", "V1", "Bosch");
        listado[2] = new Television("1234C", "V1", "Bosch");
        listado[3] = new Television("1234D", "V1", "Bosch");
        listado[4] = new Computador("1234E", 2048, 5000, 1024);
        listado[5] = new Computador("1234F", 1024,10000, 2048);
        listado[6] = new Movil("1234G", "Samsung", "Galaxy S21", Movil.Memoria.MB256);
        listado[7] = new Movil("1234H", "V1", "Bosch");
        
        verListado(listado);
        
    }

    private static void verListado(AparatoElectrico[] listado) {
        for(AparatoElectrico aparato:listado){
            System.out.println(aparato.toString());
        }
    }
    
    
}
