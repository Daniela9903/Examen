
import static org.mockito.ArgumentMatchers.nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sucursal")

public class MaterialesModel {


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


@Entity
@Table(name="materiales")

public class MaterialesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )

    private Long id_producto;
    private String nombre;
    private String cantidad;

    public Long getid_producto() {
        return id_producto;
    }

    public String getnombre() {
        return nombre;
    }

    public String getcantidad() {
        return cantidad;
    }

    
    public void setid_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public void setnombre(String nombre_pintura) {
        this.nombre = nombre_pintura;
    }

    public void setcatidad(String cantidad) {
        this.cantidad= cantidad;
    }
}



@Entity
@Table(name="cliente")

public class MaterialesModel {


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



@Entity
@Table(name="cuenta")
public class MaterialesModel {


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

