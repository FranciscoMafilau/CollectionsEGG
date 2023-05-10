
package service;


import entidad.EntidadCine;
import java.util.ArrayList;

import java.util.Iterator;


import java.util.Scanner;


public class ServiceCine {
    /*

En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
ArrayList<EntidadCine> Pelicula = new ArrayList();

public void crearPelicula(){

    int op = 0;
    while(op == 0){
    EntidadCine auxEC = new EntidadCine();
    System.out.println("Ingrese título de la película: ");
    String titulo = leer.next().toLowerCase();
   auxEC.setTitulo(titulo);
    System.out.println("Ingrese nombre del Director de la película: ");
    String director = leer.next();
    auxEC.setDirector(director);
    System.out.println("Ingrese duración de la pelicula (en horas):");
    Double duracion = leer.nextDouble();
   auxEC.setDuracion(duracion);
    Pelicula.add(auxEC);

    System.out.println("¿Desea agregar una película más : (presione 0 para continuar)");
	op = leer.nextInt();

}
}

/////• Mostrar en pantalla todas las películas. 
public void mostraPeliculas(){
   Iterator iterator = Pelicula.iterator();
    System.out.println("La lista de película es la siguiente : " ); 
    while (iterator.hasNext()) {
	System.out.println( iterator.next() + " ");
	
    }
    }
///• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
public void peliculasLargas(){/////está creado en entidad el comparator
Pelicula.sort(EntidadCine.compararDuracion);
    for (EntidadCine aux : Pelicula) {
	System.out.println("Las películas de mayor duración son. " + aux);
    }

}
////• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.

public void peliculasPorNombre(){

Pelicula.sort(EntidadCine.compararTitulos);
    for (EntidadCine aux : Pelicula) {
	System.out.println("Las películas ordenadas alfabeticamente son: " + aux);
    }
}
//// Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
public void peliculasPorDirector(){
Pelicula.sort(EntidadCine.compararDirectores);
    for (EntidadCine aux : Pelicula) {
	System.out.println("Las películas ordenadas alfabeticamente por el apellido del director son: " + aux);

}
}
}
