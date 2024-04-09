/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

/**
 *
 * @author mark
 */
public class Movil extends Dispositivo{
    
    public enum Memoria {MB64, MB128, MB256, MB512, GB1, GB2}
    private String marca;
    private String modelo;
    private Memoria memoriaRAM;
    
    public Movil(String numSerie, String marca, String modelo , Memoria ram){
        super(numSerie);
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = ram;
    }
    
}
