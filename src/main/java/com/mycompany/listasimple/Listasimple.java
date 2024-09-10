package com.mycompany.listasimple;

import javax.swing.JOptionPane;

public class Listasimple {
    
    Nodo inicio;
    Listasimple(){
        inicio = null;
    }
    
    public void insertarInicio(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();

        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio = nuevo;
        }
        else{
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        }
    }
    
    public void insertarFinal(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio = nuevo;
        }
        else{
            Nodo temporal = inicio;
            while(temporal.getEnlace()!=null){
                temporal = temporal.getEnlace();
            }
            temporal.setEnlace(nuevo);
        }
    }
    
        public void insertareleccion(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        String nombreval = "";
        JOptionPane.showInputDialog("ingrese el nombre del objeto para poner despues de este", nombreval);
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio = nuevo;
        }
    }
        
    public void eliminarIndice(){
        int contador = 1;
        boolean encontrado = false;
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta cual posicion"));
        Nodo anterior = inicio;
        Nodo siguiente = null;
        
        if(indice == 1){
            inicio = inicio.getEnlace();
            return;
        }
        while (anterior!=null){
            if(contador+1==indice){
                siguiente = anterior.getEnlace().getEnlace();
                encontrado = true;
                break;
            }
        }
    }

    //Lista, pide el nombre de la persona, ordenar la lista de forma alfabetica de manera ascedente, con un solo botón hacer eso, de la a-z
    //metodo de poner antes, consultar, despues de un nodo dado, por nombre o por indice, ahora eliminar por indice o nombre, crear un ordenador de forma alfabetica
    public void eliminarNombre(){
        Nodo temporal = inicio;
        String nomelim = JOptionPane.showInputDialog("Ingrese cual nombre desea eliminar");
        if(inicio==null){
        JOptionPane.showMessageDialog(null, "La lista está vacía");
        }else{
            while(temporal.getEnlace() != null){
                temporal = temporal.getEnlace();
            }
        }
    }    
    
    public void consultar(){
        
        Nodo temporal = inicio;
        if(inicio==null){
        JOptionPane.showMessageDialog(null, "La lista está vacía");
        }else{
            do{
                JOptionPane.showMessageDialog(null, "Nombre: " + temporal.getNombre() + " edad: " +  temporal.getEdad() + " promedio: " + temporal.getPromedio());
                temporal = temporal.getEnlace();
            }while(temporal.getEnlace() != null);
        }
        
    }
}
