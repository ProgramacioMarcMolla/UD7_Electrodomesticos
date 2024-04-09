/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

/**
 *
 * @author mark
 */
public abstract class AparatoElectrico {
    
    protected String numSerie;
    protected boolean estaEncendida;
    protected boolean tieneCorrienteElectrica;
    
    public AparatoElectrico(String numSerie){
        this.numSerie = numSerie;
        this.estaEncendida = false;
        this.tieneCorrienteElectrica = false;
    }
    
    @Override
    public String toString(){
        String corrienteString = "(Sin corriente eléctrica)";
        if(this.tieneCorrienteElectrica){
            corrienteString = "(Con corriente eléctrica)";
        }
        
        String encendidoString = "Está encendido";
        if(this.estaEncendida){
            encendidoString = "No está encendido";
        }
        return "Núm.Serie: "+ this.numSerie+" "+corrienteString+", " + encendidoString;
    }
    
    
    
    
}
