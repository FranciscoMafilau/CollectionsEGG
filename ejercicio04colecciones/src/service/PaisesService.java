
package service;

import entidad.PaisesEntidad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;




public class PaisesService {
    private HashSet<String> paises = new HashSet<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

public void crearPaises(){
PaisesEntidad auxp = new PaisesEntidad();
int op = 0;
while(op == 0){ /////pedimos el ingreso por teclado
    System.out.println("Ingrese un país para agregar a la lista= ");
    String pais = leer.next().toUpperCase();

if(paises.contains(pais)){////comprobamos que el país no esté en el conjunto
    System.out.println("El país ya se encuentra en el conjunto");
}else{
paises.add(new String(pais)); ////creamos un nuevo objeto para sumar al conjunto
}
   
 System.out.println("¿Desea agregar otro país? (selecciones 0 para continuar)");////preguntamos si quiere agregar
    op = leer.nextInt();

}System.out.println("Paises guardados en el conjunto: ");/////mostramos los paises del conjunto
    for (String paise : paises) {
	System.out.println("- " + paise);
    }


}
 // Ordenamos el conjunto alfabéticamente y lo mostramos
public void ordenarPaises(){
        ArrayList<String> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort (paisesOrdenados);
        System.out.println("Países ordenados alfabéticamente: ");
        for (String pais : paisesOrdenados) {
            System.out.println("- " + pais);
        }
}

/*
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
*/
public void buscarBorrar(){
    System.out.println("Ingrese un país a buscar en el conjunto:");
    String buscar = leer.next();
    Boolean encontrado = false;
    Iterator <String> it = paises.iterator();
    while (it.hasNext()) {
	if(it.next().equalsIgnoreCase(buscar)){
	it.remove();
	encontrado=true;
}
	
    }

 
            System.out.println("Conjunto luego de eliminar ; " + buscar + " : ");
            for (String pais : paises) {
                System.out.println("- " + pais);
            }
      
if(!encontrado){
    System.out.println("El país no pertenece al conjunto.");
}

}
}

/*

public void crearPaises(){
PaisesEntidad auxp = new PaisesEntidad();
int op = 0;
while(op == 0){
    System.out.println("Ingrese un país para agregar a la lista= ");
    String pais = leer.next().toUpperCase();
    paises.add(new PaisesEntidad(pais));
    
    System.out.print("¿Desea agregar otro país? (selecciones 0 para continuar)");
    op = leer.nextInt();

} paises.forEach(PaisesEntidad -> System.out.println(PaisesEntidad.toString()));

    } 

////Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
////cómo se ordena un conjunto.
public void ordenarPaises(){
   
     ArrayList <PaisesEntidad> orden = new ArrayList<>(paises);
	///Collections.sort(orden);
    }
}
  
/*
public class PonePais {

    public static void Cargar() {
        Scanner sc = new Scanner(System.in);
        Set<String> paises = new HashSet<>();

        // Bucle para pedir países al usuario
        boolean seguir = true;
        while (seguir) {
            System.out.print("Ingrese un país: ");
            String pais = sc.nextLine();

            // Verificar si el país ya está en el conjunto
            if (paises.contains(pais)) {
                System.out.println("El país ya se encuentra en el conjunto.");
            } else {
                paises.add(pais);
            }

            // Preguntar si desea agregar otro país o salir
            System.out.print("¿Desea agregar otro país? (s/n): ");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                seguir = false;
            }
        }

        // Mostrar todos los países
        System.out.println("Países guardados en el conjunto: ");
        for (String pais : paises) {
            System.out.println("- " + pais);
        }

        // Ordenar el conjunto alfabéticamente y mostrarlo
        List<String> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados);
        System.out.println("Países ordenados alfabéticamente: ");
        for (String pais : paisesOrdenados) {
            System.out.println("- " + pais);
        }

        // Pedir al usuario un país para eliminarlo del conjunto
        System.out.print("Ingrese un país para eliminar del conjunto: ");
        String paisAEliminar = sc.nextLine();

        // Buscar el país en el conjunto y eliminarlo si se encuentra
        Iterator<String> it = paises.iterator();
        boolean encontrado = false;
        while (it.hasNext()) {
            String pais = it.next();
            if (pais.equalsIgnoreCase(paisAEliminar)) {
                it.remove();
                encontrado = true;
            }
        }

        // Mostrar el conjunto actualizado si se eliminó el país
        if (encontrado) {
            System.out.println("Países en el conjunto después de eliminar " + paisAEliminar + ":");
            for (String pais : paises) {
                System.out.println("- " + pais);
            }
        } else {
            System.out.println("El país ingresado no se encuentra en el conjunto.");
        }

        sc.close();
    }
}
        }
*/