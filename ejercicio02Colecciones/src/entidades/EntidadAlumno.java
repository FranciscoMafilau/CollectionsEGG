
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
*/
public class EntidadAlumno {
    private String nombre;
    private Integer notas;
    private ArrayList <Integer> listanotas = new ArrayList();

    public EntidadAlumno() {
    }

    public EntidadAlumno(String nombre, Integer notas) {
	this.nombre = nombre;
	this.notas = notas;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public Integer getNotas() {
	return notas;
    }

    public void setNotas(Integer notas) {
	this.notas = notas;
    }

    public ArrayList<Integer> getListanotas() {
	return listanotas;
    }

    public void setListanotas(ArrayList<Integer> listanotas) {
	this.listanotas = listanotas;
    }

    @Override
    public String toString() {
	return "EntidadAlumno{" + "nombre=" + nombre + ", notas=" + notas + ", listanotas=" + listanotas + '}';
    }

public void llenarNotas(){
    Scanner leer = new Scanner(System.in);
	System.out.println("Ingrese las 3 notas del alumno ");
	 Integer nota;
	for (int i = 0; i < 3; i++) {
	    nota = leer.nextInt();
	    listanotas.add(nota);
	}
    }
}

