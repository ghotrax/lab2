package gt.edu.umg.antigua.sitemas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class catedratico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    private String apellido;

    private String cod_catedratico;

    private String semetres;

    public catedratico(){

    }

    public catedratico(String nombre, String apellido, String cod_catedratico, String semetres) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cod_catedratico = cod_catedratico;
        this.semetres = semetres;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCod_catedratico() {
        return cod_catedratico;
    }

    public void setCod_catedratico(String cod_catedratico) {
        this.cod_catedratico = cod_catedratico;
    }

    public String getSemetres() {
        return semetres;
    }

    public void setSemetres(String semetres) {
        this.semetres = semetres;
    }
}
