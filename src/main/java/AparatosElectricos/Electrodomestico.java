/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AparatosElectricos;

/**
 *
 * @author mark
 */
public abstract class Electrodomestico extends AparatoElectrico {

    protected float precioBase;
    private final float PRECIO_DEFAULT = 100;

    protected String marca;
    protected String modelo;
    protected Color color;
    protected ConsumoEnergetico consumoEnerg;
    private final float PRECIO_ANADIDO_A = 100;
    private final float PRECIO_ANADIDO_B = 80;
    private final float PRECIO_ANADIDO_C = 60;
    private final float PRECIO_ANADIDO_D = 50;
    private final float PRECIO_ANADIDO_E = 30;
    private final float PRECIO_ANADIDO_F = 10;
    
    
    protected int peso;
    private final int PESO_DEFAULT = 5;

    public Electrodomestico(String numSerie, float precioBase, String marca, String modelo, Color color, ConsumoEnergetico consumoEnerg, int peso) {
        super(numSerie);
        this.precioBase = precioBase;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.consumoEnerg = consumoEnerg;
        this.peso = peso;
    }

    public Electrodomestico(String numSerie, String marca, String modelo) {
        super(numSerie);

        this.marca = marca;
        this.modelo = modelo;

        this.color = Color.BLANCO;
        this.consumoEnerg = ConsumoEnergetico.F;
        this.precioBase = PRECIO_DEFAULT;
        this.peso = PESO_DEFAULT;
    }
    
    @Override
    public String toString(){
        return super.toString()+", Marca: "+this.marca+", Modelo:'"+this.modelo+"', Tipo Consumo: "+ this.consumoEnerg +", Color: " + this.color+", Peso: "+this.peso+ ", Precio Base: "+this.precioBase;
    }

    public enum Color {
        BLANCO, NEGRO, ROJO, AZUL, GRIS
    }

    public enum ConsumoEnergetico {
        A, B, C, D, E, F
    }
    
    public double obtenerPrecioVenta(){
        return this.precioBase + getIncrementoConsumoEnerg(this.consumoEnerg);
    }
    
    private float getIncrementoConsumoEnerg(ConsumoEnergetico consumoE){
        switch(consumoE){
            case A:
                return PRECIO_ANADIDO_A;
            case B:
                return PRECIO_ANADIDO_B;    
            case C:
                return PRECIO_ANADIDO_C;
            case D:
                return PRECIO_ANADIDO_D;
            case E:
                return PRECIO_ANADIDO_E;    
            case F:
                return PRECIO_ANADIDO_F;
            default:
                return 0;
        }
    }
    
    
    

}
