package org.example;

public class PowerLifter {

    private String nombre;
    private int edad;
    private float peso;
    private float p_sentadilla;
    private float p_muerto;

    public PowerLifter(String nombre, int edad, float peso, float p_sentadilla, float p_muerto){

        this.nombre = nombre;
        this.edad = edad;
        this.peso= peso;
        this.p_sentadilla= p_sentadilla;
        this.p_muerto= p_muerto;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad= edad;
    }

    public float getPeso(){
        return peso;
    }

    public void setPeso(float peso){
        this.peso= peso;
    }

    public float getP_sentadilla(){
        return p_sentadilla;
    }

    public void setP_sentadilla(float p_sentadilla){
        this.p_sentadilla=p_sentadilla;
    }

    public float getP_muerto(){
        return p_muerto;
    }

    public void setP_muerto(float p_muerto){
        this.p_muerto= p_muerto;
    }
}
