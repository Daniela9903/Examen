import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")

public class ClienteModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )

    private Long id_cli;
    private String nombre_cliente;
    private String direccion;

    public Long getid_cli() {
        return id_cli;
    }

    public String getnombre_cliente() {
        return nombre_cliente;
    }

    public String getdireccion() {
        return direccion;
    }

    
    public void setid_cli(Long id_cli) {
        this.id_cli = id_cli;
    }

    public void setnombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setdireccion(String direccion) {
        this.direccion= direccion;
    }

   
}

