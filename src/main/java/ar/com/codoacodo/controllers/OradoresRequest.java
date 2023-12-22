package ar.com.codoacodo.controllers;

public class OradoresRequest {
	private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String tema;
    
    //porque lo necesita jackson
 
	public OradoresRequest() {
		
	}
	
	public OradoresRequest(Long id, String nombre, String apellido, String email, String tema) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.tema = tema;
	}

	

	@Override
	public String toString() {
		return "OradorRequest [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", tema=" + tema + "]";
	}

		public String getNombre() {
		return nombre;
	}

		public String getApellido() {
		return apellido;
	}

	
	public String getEmail() {
		return email;
	}

		public String getTema() {
		return tema;
	}

	     
    }

