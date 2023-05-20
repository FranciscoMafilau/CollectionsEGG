
package entidad;


public class LibroEntidades {
    /*
La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
*/
private String titulo;
private String autor;
private Integer numEjemp;
private Integer numEjempPrestados;

    public LibroEntidades() {
    }

    public LibroEntidades(String titulo, String autor, Integer numEjemp, Integer numEjempPrestados) {
	this.titulo = titulo;
	this.autor = autor;
	this.numEjemp = numEjemp;
	this.numEjempPrestados = numEjempPrestados;
    }

    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = titulo;
    }

    public String getAutor() {
	return autor;
    }

    public void setAutor(String autor) {
	this.autor = autor;
    }

    public Integer getNumEjemp() {
	return numEjemp;
    }

    public void setNumEjemp(Integer numEjemp) {
	this.numEjemp = numEjemp;
    }

    public Integer getNumEjempPrestados() {
	return numEjempPrestados;
    }

    public void setNumEjempPrestados(Integer numEjempPrestados) {
	this.numEjempPrestados = numEjempPrestados;
    }
    @Override
    public String toString() {
	return "LibroEntidades{" + "titulo=" + titulo + ", autor=" + autor + ", numEjemp=" + numEjemp + ", numEjempPrestados=" + numEjempPrestados + '}';
    }

}