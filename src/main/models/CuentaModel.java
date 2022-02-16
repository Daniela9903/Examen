import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cuenta")
public class CuentaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )

    private Long id_cuenta;
    private String tipo_cuenta;
    private String  plazo_pago;

    public Long getid_cuenta() {
        return id_cuenta;
    }

    public String gettipo_cuenta() {
        return tipo_cuenta;
    }

    
    public String getplazo_pago() {
        return plazo_pago;
    }

    
    public void setid_cuenta(Long id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public void settipo_cuenta(String  tipo_cuenta) {
        this.tipo_cuenta=  tipo_cuenta;
    }

    public void setplazo_pago(String  plazo_pago) {
        this.plazo_pago = plazo_pago;
    }

}

