/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

/**
 *
 * @author mark
 */
public abstract class Dispositivo extends AparatoElectrico{
    protected boolean estaConectadoInternet;
    
    public Dispositivo(String numSerie){
        super(numSerie);
        this.estaConectadoInternet = false;
    }
    
    @Override
    public String toString(){
        String conectadoInternetString = "No conectado a Internet";
        if(this.estaConectadoInternet){
            conectadoInternetString = "Conectado a Internet";
        }
        return super.toString()+", " + conectadoInternetString;
    }
    
}
