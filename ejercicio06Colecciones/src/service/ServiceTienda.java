
package service;

import entidad.EntidadTienda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;




public class ServiceTienda {
    private HashMap<String, Double> lista = new HashMap();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

public void menu(){
	int opc=0;
    do {	
 System.out.println("***********************************");
	System.out.println("BIENVENIDO A LA TIENDA");
	System.out.println("QUE ACTIVIDAD DESEA REALIZAR:");
	System.out.println("***************************************");
	System.out.println("1. CARGAR PRODUCTOS");
	System.out.println("2. MODIFICAR PRECIOS:");
	System.out.println("3. ELIMINAR PRODUCTOS: ");
	System.out.println("4. SALIR DEL PROGRAMA");
	System.out.println("//////////////////////////////////////////////////");
	System.out.println("INGRESE UNA OPCION");
	opc = leer.nextInt();

	    switch (opc) {
		case 1:
		    cargarProducto();
		    break;
		case 2:
		    modificarPrecio();
		    break;
		case 3:
		    eliminarProduto();
		    break;
		case 4:
		    System.out.println("Saliendo del programa");
		default:

	    }
	} while (opc != 0);
    }

    public void cargarProducto() {
	EntidadTienda auxP = new EntidadTienda();
	int op = 0;
	while (op == 0) {

	    System.out.println("Ingrese nombre del producto");
	    String prod = leer.next().toUpperCase();
	    System.out.println("Ingrese precio del producto: ");
	    Double valor = leer.nextDouble();
	    lista.put(prod, valor);
	    System.out.println("¿Desea agregar otro producto?(presione 0 para continuar)");
	    op = leer.nextInt();

	}
	 System.out.println("****************STOCK******************");
	for (Map.Entry<String, Double> entry : lista.entrySet()) {
	    String key = entry.getKey();
	    Double value = entry.getValue();
	    
	    System.out.println("Producto - " + entry.getKey() + " Precio por kg. = $" + entry.getValue());
	   
	}
    }

    public void modificarPrecio() {
	System.out.println("Ingrese el nombre del producto que desea modificar");
	String productoabuscar = leer.next();
	Double precio;
	boolean respuesta = false;
	for (Map.Entry<String, Double> producto : lista.entrySet()) {
	    if (productoabuscar.equalsIgnoreCase(producto.getKey())) {

		System.out.println("Ingrese el precio deseado");
		precio = leer.nextDouble();
		respuesta = true;
		producto.setValue(precio);
		
		
	    }
	}
	if (respuesta) {

	} else {
	    System.out.println("El producto no esta en el stock");
	}
	for (Map.Entry<String, Double> entry : lista.entrySet()) {
	    String key = entry.getKey();
	    Double value = entry.getValue();
	System.out.println("**************LISTA PRECIOS ACTUALIZADA**************************");
	    System.out.println("Producto - " + entry.getKey() + " Precio por kg. = $" + entry.getValue());
	}
	
    }


public void eliminarProduto(){
   ArrayList<String> actual = new ArrayList();
 System.out.println("Producto que desea eliminar = ");
    String eliminar = leer.next().toUpperCase();
    if(actual.equals(eliminar));
    lista.remove(eliminar);
 System.out.println("************* STOCK ACTUALIZADO*******");
    for (Map.Entry<String, Double> entry : lista.entrySet()) {
	String key = entry.getKey();
	Double value = entry.getValue();
	 System.out.println("Producto - " + entry.getKey()+ " Precio por kg. = $" + entry.getValue());
    }
	    
	
	    
    }
}
