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
        
        for(int i = 0; i < listaAparatos.length; i++){
            if(listaAparatos[i] == null){
                listaAparatos[i] = aparato;
                aparato.darEnergia();
                return true;
            }
        }
        
        return false;
    }
    
}
