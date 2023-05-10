
package entidad;

import java.util.HashMap;


public class EntidadTienda {
    private String producto;
    private Double precio;
    private HashMap<String, Double> lista = new HashMap();

    public EntidadTienda() {
    }

    public EntidadTienda(String producto, Double precio) {
	this.producto = producto;
	this.precio = precio;
    }

    public String getProducto() {
	return producto;
    }

    public void setProducto(String producto) {
	this.producto = producto;
    }

    public Double getPrecio() {
	return precio;
    }

    public void setPrecio(Double precio) {
	this.precio = precio;
    }

    public HashMap<String, Double> getLista() {
	return lista;
    }

    public void setLista(HashMap<String, Double> lista) {
	this.lista = lista;
    }

    @Override
    public String toString() {
	return "EntidadTienda{" + "producto=" + producto + ", precio=" + precio + ", lista=" + lista + '}';
    }



}
