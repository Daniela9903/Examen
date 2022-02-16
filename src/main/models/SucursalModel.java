import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sucursal")

public class SucursalModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )

    private Long id_suc;
    private String nombre_suc;
    private String localizacion;

    public Long getid_suc() {
        return id_suc;
    }

    public String getnombre_suc() {
        return nombre_suc;
    }

    public String getlocalizacion() {
        return localizacion;
    }

    
    public void setid_suc(Long id_suc) {
        this.id_suc = id_suc;
    }

    public void setnombre_suc(String nombre_suc) {
        this.nombre_suc = nombre_suc;
    }

    public void localizacion(String localizacion) {
        this.localizacion= localizacion;
    }
}

