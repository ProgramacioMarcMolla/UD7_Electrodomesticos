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
    
    public Computador(String numSerie, int memoriaRam, double velocidadCPU, int tamanoDisco){
        super(numSerie);
        this.memoriaRamDisponible = memoriaRam;
        this.velocidadCPU  = velocidadCPU;
        this.tamanoDisco = tamanoDisco;
    }
}
