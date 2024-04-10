/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

/**
 *
 * @author mark
 */
public class Movil extends Dispositivo {

    
    private String marca;
    private String modelo;
    private Memoria memoriaRAM;
    private final String TIPO_APARATO = "Móvil";

    public Movil(String numSerie, String marca, String modelo, Memoria ram) {
        super(numSerie);
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = ram;
    }
    
    @Override
    public String getTipo(){
        return TIPO_APARATO;
    }
    
    @Override
    public String toString(){
        return "["+TIPO_APARATO+"] "+super.toString()+", Memoria" + this.memoriaRAM.toString()+  ", Marca: "+ this.marca+", Modelo:"+this.modelo;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Movil otroMovil = (Movil) o;
        
        return this.numSerie == otroMovil.numSerie;
    }
    
    public enum Memoria {
        MB64("64gb"),
        MB128("128gb"),
        MB256("256gb"),
        MB512("512gb"),
        GB1("1tb"),
        GB2("2tb");

        private final String capacidad;

        Memoria(String capacidad) {
            this.capacidad = capacidad;
        }

        @Override
        public String toString() {
            return capacidad;
        }
    }

}
