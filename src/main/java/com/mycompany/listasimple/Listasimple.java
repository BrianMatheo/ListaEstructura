package com.mycompany.listasimple;

import java.util.Random;
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
    
    // algoritmo que genere n nombres de forma aleatoria aunque no sean nombres correctos
    
    public void createName(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("cuantos nombres quieres crear?"));
        Random random = new Random();
        int surprise = random.nextInt(n);
        for(int i = 0; i<n;i++){
        int largo = random.nextInt(8) + 3;
        int age = random.nextInt(100) + 1;
        float prom = random.nextFloat(5);
        String name = "";
            for(int j = 0; j < largo; j++){
                char aleatorio = (char)(random.nextInt(26) + 97);
                name = name + aleatorio;
            }
            if(i==surprise){
                name = "Matheo";
            }
            insertarFinal(name,age,prom);
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
    
        public void insertarName(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        String nombreval = JOptionPane.showInputDialog("ingrese el nombre del objeto para poner despues de este");
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        boolean search = false;
        
        Nodo temporal1 = inicio;
        Nodo temporal2 = null;
        while(temporal1.getEnlace() != null){
            if(temporal1.getNombre().equals(nombreval)){
                temporal2 = temporal1.getEnlace();
                search = true;
                break;
            }
            temporal1 = temporal1.getEnlace();
        }
        if(search){
            temporal1.setEnlace(nuevo);
            nuevo.setEnlace(temporal2);
        }else{
            JOptionPane.showMessageDialog(null, "Nombre no encontrado");
        }
    }
        
    public void insertAge(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        int ageval = Integer.parseInt(JOptionPane.showInputDialog("ingrese el nombre del objeto para poner despues de este"));
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        boolean search = false;
        Nodo temporal1 = inicio;
        Nodo temporal2 = null;
        while(temporal1.getEnlace() != null){
            if(temporal1.getEdad() == ageval){
                temporal2 = temporal1.getEnlace();
                search = true;
                break;
            }
            temporal1 = temporal1.getEnlace();
        }
        if(search){
        temporal1.setEnlace(nuevo);
        nuevo.setEnlace(temporal2);
        }else{
            JOptionPane.showMessageDialog(null, "Edad no encontrada");
        }
    }
    
    public void insertAverage(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        float aveval = Float.parseFloat(JOptionPane.showInputDialog("ingrese el nombre del objeto para poner despues de este"));
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        boolean search = false;
        Nodo temporal1 = inicio;
        Nodo temporal2 = null;
        while(temporal1.getEnlace() != null){
            if(temporal1.getPromedio() == aveval){
                temporal2 = temporal1.getEnlace();
                search = true;
                break;
            }
            temporal1 = temporal1.getEnlace();
        }
        if(search){
        temporal1.setEnlace(nuevo);
        nuevo.setEnlace(temporal2);
        }else{
            JOptionPane.showMessageDialog(null, "Edad no encontrada");
        }
}
    
    public void insertPosition(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        int position = Integer.parseInt(JOptionPane.showInputDialog("ingrese el nombre del objeto para poner despues de este"));
        nuevo.setNombre(nombre);
        int contador = 0;
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        boolean search = false;
        Nodo temporal1 = inicio;
        Nodo temporal2 = null;
        
        if(position<=0){
            JOptionPane.showMessageDialog(null, "no puede elegir una posicion cero");
        }else{
        while(temporal1.getEnlace() != null){
            if(contador == position){
                temporal2 = temporal1.getEnlace();
                search = true;
                break;
            }
            temporal1 = temporal1.getEnlace();
            contador++;
        }
        if(search){
        temporal1.setEnlace(nuevo);
        nuevo.setEnlace(temporal2);
        }else{
            JOptionPane.showMessageDialog(null, "posicion no existente, ingresando de ultimo");
            Nodo temporal = inicio;
            while(temporal.getEnlace()!=null){
                temporal = temporal.getEnlace();
            }
            temporal.setEnlace(nuevo);
        }
    }
    }

    //Lista, pide el nombre de la persona, ordenar la lista de forma alfabetica de manera ascedente, con un solo botón hacer eso, de la a-z
    //metodo de poner antes, consultar, despues de un nodo dado, por nombre o por indice, ahora eliminar por indice o nombre, crear un ordenador de forma alfabetica
    public void deleteName(){
        String nombredelete = JOptionPane.showInputDialog("ingrese el nombre del objeto que desea eliminar");
        int contador = 1;
        Nodo temporal1 = inicio;
        Nodo temporal2 = null;
        while(temporal1.getEnlace() != null){
            
            if(temporal2 == null && contador == 1 && temporal1.getNombre().equals(nombredelete)){
                Nodo temporal3 = temporal1.getEnlace();
                while(temporal3.getNombre().equals(nombredelete)){
                    temporal3 = temporal3.getEnlace();
                }
                inicio = temporal3.getEnlace();
            }
            
            if(temporal2 != null && temporal2.getNombre().equals(nombredelete)){
                Nodo temporal3 = temporal1.getEnlace();
                while(temporal3 != null && temporal3.getNombre().equals(nombredelete)){
                    temporal3 = temporal3.getEnlace();
                }
                temporal1.setEnlace(temporal3);
            }
            temporal1 = temporal1.getEnlace();
            
            if(temporal1 == null){
                break;
            }
            temporal2 = temporal1.getEnlace();
            contador++;
        }
    }    
    
    public void deletePosition(){
        int contador = 1;
        Nodo temporal1 = inicio;
        Nodo temporal2 = null;
        boolean search = false;
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("escribe la posicion del objeto a eliminar"));
        if (posicion == 1){
            inicio = inicio.getEnlace();
            return;
        }
        while(temporal1 != null){
            if(contador+1 == posicion){
                temporal2 = temporal1.getEnlace().getEnlace();
                search = true;
                break;
            }
        temporal1 = temporal1.getEnlace();
        contador++;
    }
        if(search){
            temporal1.setEnlace(temporal2);
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró");
        }
    }
    
    public void order(){
        if (inicio == null || inicio.getEnlace() == null) {
            return;
        }

        Nodo temporal1;
        Nodo temporal2;
        String nom;
        boolean cambiado;
        int ed;
        float prom;

        do {
            cambiado = false;
            temporal1 = inicio;

            while (temporal1.getEnlace() != null) {
                temporal2 = temporal1.getEnlace();
                
                if (temporal1.getNombre().compareToIgnoreCase(temporal2.getNombre()) > 0) {
                    nom = temporal1.getNombre();
                    ed = temporal1.getEdad();
                    prom = temporal1.getPromedio();
                    
                    temporal1.setNombre(temporal2.getNombre());
                    temporal1.setEdad(temporal2.getEdad());
                    temporal1.setPromedio(temporal2.getPromedio());

                    temporal2.setNombre(nom);
                    temporal2.setEdad(ed);
                    temporal2.setPromedio(prom);

                    cambiado = true;
                }
                temporal1 = temporal1.getEnlace();
            }
        } while (cambiado);
    
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
