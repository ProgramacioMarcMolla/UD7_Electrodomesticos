/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import AparatosElectricos.Computador;
import AparatosElectricos.Electrodomestico;
import AparatosElectricos.Lavadora;
import AparatosElectricos.Movil;
import AparatosElectricos.Regleta;
import AparatosElectricos.Television;

/**
 *
 * @author mark
 */
public class TestRegleta {
    
    public static void main(String[] args) {
        
        System.out.println("----------Crear regleta y conectar los cuatro aparatos---------- \n");
        
        Lavadora lavadora = new Lavadora("1234A", "V1", "Bosch", Electrodomestico.Color.BLANCO, Electrodomestico.ConsumoEnergetico.F, 100, 50, 5);
        Television television = new Television("1234C", "SuperGuay", "LG",false,false,45);
        Computador computador = new Computador("1234E", 2048, 5000, 1024);
        Movil movil = new Movil("1234G", "Samsung", "Galaxy S21", Movil.Memoria.MB256);
        
        Regleta regleta = new Regleta();
        
        regleta.enchufar(lavadora);
        regleta.enchufar(television);
        regleta.enchufar(computador);
        regleta.enchufar(movil);
        
        System.out.println("\n---------Listar aparatos enchufados---------- \n");
        
        regleta.listarConectados();
        
        
        System.out.println("\n----------Desconectar lavadora y televisión---------- \n");
        
        regleta.desenchufar(lavadora);
        regleta.desenchufar(television);
        
        System.out.println("\n----------Listar aparatos enchufados ---------- \n");
        
        regleta.listarConectados();
        
        System.out.println("\n----------Crear móvil con número de serie 1234G ----------\n");
        
        Movil movil2 = new Movil("1234G", "Motorola", "S500", Movil.Memoria.MB256);
        System.out.println(movil2);
        
        System.out.println("\n----------Enchufar móvil anterior y obtener mensaje de error ---------- \n");
        
        regleta.enchufar(movil2);
        
        System.out.println("\n---------Desconectar aparato no enchufado (la lavadora)---------- \n");
        
        regleta.desenchufar(lavadora);
        
        
    }
    
}
