package com.calendarjsf.modelos;
// Generated 05-mar-2019 8:58:10 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Datospersonales generated by hbm2java
 */
@Entity
@Table(name="datospersonales"
    ,catalog="calendar"
)
public class Datospersonales  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellidos;
     private String pais;
     private String provincia;
     private String poblacion;
     private String direccion;
     private String postal;
     private String telefono;

    public Datospersonales() {
    }

	
    public Datospersonales(String nombre, String pais, String provincia, String poblacion, String direccion) {
        this.nombre = nombre;
        this.pais = pais;
        this.provincia = provincia;
        this.poblacion = poblacion;
        this.direccion = direccion;
    }
    public Datospersonales(String nombre, String apellidos, String pais, String provincia, String poblacion, String direccion, String postal, String telefono) {
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.pais = pais;
       this.provincia = provincia;
       this.poblacion = poblacion;
       this.direccion = direccion;
       this.postal = postal;
       this.telefono = telefono;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="nombre", nullable=false, length=50)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="apellidos", length=50)
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    @Column(name="Pais", nullable=false, length=50)
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    @Column(name="Provincia", nullable=false, length=50)
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    
    @Column(name="Poblacion", nullable=false, length=50)
    public String getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    
    @Column(name="Direccion", nullable=false, length=50)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="Postal", length=50)
    public String getPostal() {
        return this.postal;
    }
    
    public void setPostal(String postal) {
        this.postal = postal;
    }

    
    @Column(name="Telefono", length=50)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




}

