

package service;

import entidades.EntidadAlumno;
import java.util.ArrayList;
import java.util.Scanner;



/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
*/

public class AlumnoService {
    private ArrayList<EntidadAlumno> listaAlumno = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

public void crearAlumno(){
    int op = 0;
    while (op == 0){
   EntidadAlumno auxAlu = new EntidadAlumno();
    System.out.println("Ingrese el nombre del alumno: " );
    String nombre = leer.next().toLowerCase();
    auxAlu.setNombre(nombre);
    auxAlu.llenarNotas();
    listaAlumno.add(auxAlu);
    System.out.println("¿Desea agregar otro alumno? (presione 0 para continuar)" );
     op = leer.nextInt();
    
}
}


public void notaFinal(){
    System.out.println("Ingrese el alumno a buscar: ");
    String buscar = leer.next().toLowerCase();

    double promedio = 0;
    for (EntidadAlumno aux : listaAlumno) {///////////utilizo doble for, uno para buscar el alumno
     if(aux.getNombre().equalsIgnoreCase(buscar)){
	 for (int i : aux.getListanotas()) {////////////el otro para obtener la nota

	    promedio +=i;
	   
	 }
	 }
}
    System.out.println("La nota final del alumno. " +buscar+ " es = " +promedio/3);
    }
}

