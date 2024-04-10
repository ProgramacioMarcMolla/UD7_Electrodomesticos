/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

/**
 *
 * @author mark
 */
public class Computador extends Dispositivo {
    
    private int memoriaRamDisponible;
    private double velocidadCPU;
    private int tamanoDisco;
    private final String TIPO_APARATO = "Computador";
    
    public Computador(String numSerie, int memoriaRam, double velocidadCPU, int tamanoDisco){
        super(numSerie);
        this.memoriaRamDisponible = memoriaRam;
        this.velocidadCPU  = velocidadCPU;
        this.tamanoDisco = tamanoDisco;
    }
    
    @Override
    public String getTipo(){
        return TIPO_APARATO;
    }
    
    @Override
    public String toString(){
        return "["+TIPO_APARATO+"] "+super.toString()+", RAM: "+this.memoriaRamDisponible+", Velocidad CPU: " + this.velocidadCPU+", Tamaño HD"+ this.tamanoDisco;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Computador otroComputador = (Computador) o;
        
        return this.numSerie == otroComputador.numSerie;
    }
}
