package gt.edu.umg.antigua.sitemas.model;

import javax.persistence.Entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.transform.sax.SAXTransformerFactory;

@Entity
public class curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long   id;

    private String nombre;

    private String descricion;

    private String creditos;

    private String telefono;

    private String semetres;

    public curso(){

    }

    public curso(String nombre, String descricion, String creditos, String telefono, String semetres) {
        this.nombre = nombre;
        this.descricion = descricion;
        this.creditos = creditos;
        this.telefono = telefono;
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

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSemetres() {
        return semetres;
    }

    public void setSemetres(String semetres) {
        this.semetres = semetres;
    }
}
