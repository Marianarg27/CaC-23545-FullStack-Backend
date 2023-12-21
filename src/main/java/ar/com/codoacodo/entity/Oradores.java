package ar.com.codoacodo.entity;
import java.time.LocalDate;

public class Oradores {/*atributos que representan los campos de la tabla oradores en la db*/
	private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String tema;
    private LocalDate fecha_alta;
    
  //usado cuando quiera enviar un orador a la db
 public Oradores(String nombre, String apellido, String email, String tema, LocalDate fecha_alta) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.tema = tema;
    this.fecha_alta = fecha_alta;	
    }

    //usado cuando quiera traer un orador desde la db
 public Oradores(Long id, String nombre, String apellido, String email, String tema, LocalDate fecha_alta) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.tema = tema;
    this.fecha_alta = fecha_alta;
    }

    //anulo el constructor por defecto al colocar estos metodos
    /*constructor*/
    //alt+shift+s

    //agregamos getters y setters
    //un setter es un metod que me permite modificar el contenido de UN SOLO atributo

 public void setNombre(String nombre) {  //firma del metodo
    if(this.nombre != nombre) {
    	} else {
    this.nombre ="N/D";
    	}	
    	
    }
 public String getNombre() {
    return this.nombre;
    }
    //automaticamente creo los get/set
    //alt/shift+s

 public Long getId() {
    return id;
    }

 public void setId(Long id) {
    this.id = id;
    }

 public String getApellido() {
    return apellido;
    }

 public void setApellido(String apellido) {
    this.apellido = apellido;
    }

 public String getEmail() {
    return email;
    }

 public void setEmail(String email) {
    this.email = email;
    }

 public String getTema() {
    return tema;
    }

 public void setTema(String tema) {
    this.tema = tema;
    }

 public LocalDate getFechaAlta() {
    return fecha_alta;
    }

 public void setFechaAlta(LocalDate fecha_alta) {
    this.fecha_alta = fecha_alta;
    }

    /*Polimorfismo: SOBREESCRITURA*/

 public String toString() {
    return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + email + ", tema=" + tema
    			+ ", fechaAlta=" + fecha_alta + "]";
    }

    }


