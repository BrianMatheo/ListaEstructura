package com.mycompany.listasimple;
public class Nodo {

    /**
     * @return the enlace
     */
    public Nodo getEnlace() {
        return enlace;
    }

    /**
     * @param enlace the enlace to set
     */
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
    private String nombre;
    private int edad;
    private float promedio;
    private Nodo enlace;
    
    public Nodo(){
    }

    public Nodo(String nombre, int edad, float promedio, Nodo enlace) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.enlace = enlace;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    
    
}
