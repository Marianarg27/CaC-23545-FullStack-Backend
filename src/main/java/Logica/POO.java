package Logica;

public class POO {

	public static void main(String[] args) {
		Alumno alu1 = new Alumno();
		Alumno alu2 = new Alumno (23,"Maria", "GP");
		
		System.out.println("la id del alumno 2 es: " +alu2.getId());
		System.out.println("el nombre del alumno 2 es: " +alu2.getNombre()); 
		System.out.println("el apellido del alumno 2 es: " +alu2.getApellido());
		
		alu1.setId(8);
		alu1.setNombre("Milagros");
		alu1.setApellido("Gomez");
		
		
		System.out.println("--------------");
		System.out.println("la id del alumno 1 es: " +alu1.getId());
		System.out.println("el nombre del alumno 1 es: " +alu1.getNombre()); 
		System.out.println("el apellido del alumno 1 es: " +alu1.getApellido());
		
		
		alu2.setId(26);
		System.out.println("--------------");
		System.out.println("la id del alumno 2 es: " +alu2.getId());
		System.out.println("el nombre del alumno 2 es: " +alu2.getNombre()); 
		System.out.println("el apellido del alumno 2 es: " +alu2.getApellido());
		
		
	}
	
	
	
	
	
	
}
