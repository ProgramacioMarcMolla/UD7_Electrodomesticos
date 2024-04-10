/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

import Interfaces.Enchufable;


/**
 *
 * @author mark
 */
public class Regleta{
    
    private Enchufable[] listaAparatos;
    
    public Regleta(){
        this.listaAparatos = new Enchufable[10];
    }
    
    public boolean enchufar(Enchufable aparato){
        
        if(comprobarAparatoEnLista(aparato)){
            return false;
        }
        
        for(int i = 0; i < listaAparatos.length; i++){
            if(listaAparatos[i] == null){
                listaAparatos[i] = aparato;
                aparato.darEnergia();
                System.out.println("["+aparato.getTipo()+"] Aparato enchufado");
                return true;
            }
        }
        System.out.println("["+aparato.getTipo()+"] No hay sitios disponible");
        return false;
    }
    
    private boolean comprobarAparatoEnLista(Enchufable aparato){
        for(int i = 0; i<this.listaAparatos.length; i++){
            if(this.listaAparatos[i] == null){
                continue;
            }
            if(this.listaAparatos[i].equals(aparato)){
                System.out.println("["+aparato.getTipo()+"] El aparato ya está enchufado a la regleta");
                return true;
            }
        }
        return false;
    }
    
    public boolean desenchufar(Enchufable aparato){
        
        for(int i = 0; i < listaAparatos.length; i++){
            
            if(this.listaAparatos[i] == null){
                continue;
            }
            
            if(listaAparatos[i].equals(aparato)){
                listaAparatos[i] = null;
                aparato.quitarEnergia();
                System.out.println("["+aparato.getTipo()+"] Aparato desenchufado");
                return true;
            }
        }
        
        System.out.println("["+aparato.getTipo()+"] El aparato no está enchufado a la regleta ");
        return false;
    }
    
    private int obtenerTomasLibres(){
        int contador = 0;
        for(int i = 0; i< listaAparatos.length; i++){
            if(listaAparatos[i] == null){
                contador++;
            }
        }
        return contador;
    }
    
    public void listarConectados(){
        for(int i = 0; i<listaAparatos.length; i++){
            if(listaAparatos[i] != null){
                System.out.println(listaAparatos[i]);
            }
        }
        
        System.out.println("\nNúmero de tomas libres: "+ obtenerTomasLibres());
    }
    
}
