
package entidad;

import java.util.Comparator;
import java.util.HashSet;


public class PaisesEntidad {
    private String pais;
    ///private HashSet<String> Paises = new HashSet<>();

    public PaisesEntidad() {
    }

    public PaisesEntidad(String pais) {
	this.pais = pais;
    }

    public String getPais() {
	return pais;
    }

    public void setPais(String pais) {
	this.pais = pais;
    }

    @Override
    public String toString() {
	return "PaisesEntidad{" + "pais=" + pais + '}';
    }
public static Comparator <PaisesEntidad> ordenarAlfabeticamente = new Comparator<PaisesEntidad>() {
	@Override
	public int compare(PaisesEntidad o1, PaisesEntidad o2) {
	return o2.getPais().compareTo(o1.getPais());
	}
    };
  }
 
  
