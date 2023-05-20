
package service;

import entidad.LibroEntidades;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class LibroServicio {
    /*
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


public void prestamo( HashSet<String> LibroEntidades){
    
	int conti = 0;
	boolean inexistente = false;
	System.out.println("Cuál libro desea prestar?");
	String titulo = leer.nextLine();
	Iterator<String> it = LibroEntidades.iterator();
	while (it.hasNext()) {
	    if (it.next().equalsIgnoreCase(titulo)){
	    conti++;
	    inexistente = true;
	}
	

    }  System.out.println("la obra está en la biblioteca");

if(inexistente){
       System.out.println("no se encuentra la obra");
    }
}
}

