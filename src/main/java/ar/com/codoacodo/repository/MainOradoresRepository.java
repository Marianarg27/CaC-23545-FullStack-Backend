package ar.com.codoacodo.repository;

import ar.com.codoacodo.entity.Oradores;

public class MainOradoresRepository {

	public static void main(String[] args) {
		// interface i = new CalqQueImplementa()..
		
		MySQLOradoresRepository repository = new MySQLOradoresRepository();
		
		Oradores orador = repository.getById(2L);
		
		
		//le cambio algo??
		//orador.setId(null);
		//orador.setEmail("otromailca@mail.com");
		
		//repository.save(orador);
		
		Oradores o = repository.getById(2L);
		
		o.setApellido ("Perez");
		o.setNombre ("Juan");
		o.setTema ("PHP");
		
		
		
		
		System.out.println(o);
		
	}
				
}
