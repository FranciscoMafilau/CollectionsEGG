
package entidad;

import java.util.Comparator;


public class EntidadCine {
    /*
Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
*/
    private String titulo;
private String director;
private Double duracion;

    public EntidadCine() {
    }

    public EntidadCine(String titulo, String director, Double duracion) {
	this.titulo = titulo;
	this.director = director;
	this.duracion = duracion;
    }

    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = titulo;
    }

    public String getDirector() {
	return director;
    }

    public void setDirector(String director) {
	this.director = director;
    }

    public Double getDuracion() {
	return duracion;
    }

    public void setDuracion(Double duracion) {
	this.duracion = duracion;
    }

    @Override
    public String toString() {
	return "EntidadCine{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public static Comparator<EntidadCine> compararDuracion = new Comparator<EntidadCine>() {
	@Override
	public int compare(EntidadCine o1, EntidadCine o2) {
	    return o2.getDuracion().compareTo(o1.getDuracion());
}
};

public static Comparator<EntidadCine> compararTitulos = new Comparator<EntidadCine>() {
	@Override
	public int compare(EntidadCine o1, EntidadCine o2) {
	return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
}
    };

public static Comparator<EntidadCine> compararDirectores = new Comparator<EntidadCine>() {
	@Override
	public int compare(EntidadCine o1, EntidadCine o2) {
	    return o1.getDirector().compareToIgnoreCase(o2.getDirector());
	}
    };
}

