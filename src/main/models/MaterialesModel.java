package com.example.apiPropia.models;
import javax.persistence.*;

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

