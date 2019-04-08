/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopolimorfismo;

/**
 *
 * @author ifernandezblanco
 */
public class Deportista extends Persoa {
     private String tipoDeporte="futbol";

    public Deportista() {
    }

    public Deportista(String tipoDeporte, String nome, float soldo) {
        super(nome, soldo);
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    @Override
    public String toString() {
        return super.toString() + "tipoDeporte=" + tipoDeporte;
    }
     @Override
     public float calcularSoldo(){
         return super.calcularSoldo()+20000;
     }
     
}
