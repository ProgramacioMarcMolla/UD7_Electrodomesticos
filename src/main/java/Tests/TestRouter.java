/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import AparatosElectricos.Computador;
import AparatosElectricos.Movil;
import AparatosElectricos.Regleta;
import AparatosElectricos.Router;
import AparatosElectricos.Television;

/**
 *
 * @author mark
 */
public class TestRouter {
    
    
    public static void main(String[] args) {
        
        System.out.println("----------Aparatos conectables creados ---------- \n");
        
        Television television = new Television("1234C", "SuperGuay", "LG",false,false,45);
        Computador computador = new Computador("1234E", 2048, 5000, 1024);
        Movil movil = new Movil("1234G", "Samsung", "Galaxy S21", Movil.Memoria.MB256);

        System.out.println(television);
        System.out.println(computador);
        System.out.println(movil);
        
        System.out.println("\n----------Encender televisión, móvil y ordenador ---------- \n");
        
        television.activar();
        computador.activar();
        movil.activar();
        
        System.out.println("\n----------Conectar televisión a una regleta y encender la TV ---------- \n");
        
        Regleta regleta = new Regleta();
        
        regleta.enchufar(television);
        television.activar();
        
        System.out.println("\n-----------Crear router, conectarlo a la regleta y encenderlo ----------------\n");
        
        Router router = new Router("0001");
        regleta.enchufar(router);
        router.activar();
        
        System.out.println("\n----------Emparejar los tres aparatos. Televisión no podrá por no tener habilitado Wifi ----------\n");
        
        
        router.emparejar(television);
        router.emparejar(computador);
        router.emparejar(movil);
        
        System.out.println("");
        
        router.listarConectados();
        
        System.out.println("\n----------Habilitar Wifi para televisión y emparejar con router ---- \n");
        
        television.habilitarWifi();
        router.emparejar(television);
        router.emparejar(television);
        
        System.out.println("");
        router.listarConectados();
        
        System.out.println("\n----------Desemparejar móvil y mostrar los aparatos emparejados ----------\n");
        
        router.desemparejar(movil);
        System.out.println("");
        router.listarConectados();
        
        System.out.println("\n----------Desenchufar televisión y listar aparatos emparejados ---------- \n");
        
        regleta.desenchufar(television);
        System.out.println("");
        router.listarConectados();
        
    }
    
    
    
}
