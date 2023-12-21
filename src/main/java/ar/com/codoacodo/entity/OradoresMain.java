package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class OradoresMain {

	public static void main(String[] args) {
		// simular que creamos un objeto de la clase orador 
		//para grabar en la db
		//instancio un objeto de la clase Orador
		//crear un Orador a partir de clase Orador
				
			Oradores nuevoOrador = new Oradores("Carlos", "Lopez","email@email.com", "java", LocalDate.now());
				
		//instancia de la clase orador simulando que viene de la db
				
				Oradores nuevoFromDB = new Oradores(1L, "Carlos", "Lopez","email@email.com", "java", LocalDate.now());
				
				//mostrar por consola el nuevo orador
				System.out.println(nuevoOrador);
				
				
				//un tipo de polimorfismo: en la misma clase tengo dos metodos o constructores
				//con el mismo nombre pero con distintos parametros
				
				//nuevoOrador.id = 1L; //problema de encapsulamiento
				
					
				//si quiero saber nombre del orador, entonces implemento un getter

	}

}
