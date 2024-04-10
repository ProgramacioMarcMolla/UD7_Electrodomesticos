/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

import Interfaces.Conectable;

/**
 *
 * @author mark
 */
public abstract class Dispositivo extends AparatoElectrico implements Conectable{
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

    @Override
    public boolean sePermiteConexion() {
        return this.tieneCorrienteElectrica&&this.estaEncendida;
    }

    @Override
    public void establecerConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void quitarConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
