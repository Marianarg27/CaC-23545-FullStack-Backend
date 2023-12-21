package ar.com.codoacodo.interfaces;

public class MainInterfaces {

	public static void main(String[] args) {
		//instanciar
		ConsolaInformableImpl obj1 = new ConsolaInformableImpl();
		
		//Interface nombre = ClaseQueImplementa
		Informable i = new ConsolaInformableImpl();
		i.Informar();
		
		//down casting
		//quiero la consola infromable que esta dentro de i
		ConsolaInformableImpl ci = (ConsolaInformableImpl)i;
	}

}
