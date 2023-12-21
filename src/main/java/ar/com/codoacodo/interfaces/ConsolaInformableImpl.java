package ar.com.codoacodo.interfaces;

public class ConsolaInformableImpl implements Informable {
	//puede tener atributos
	private String atrx;
	
	//constructor propio!!!
	public ConsolaInformableImpl() {
					
	}
		 //polimorfismo: sobreescribir

	@Override
	public void Informar() {
		System.out.println();	

	}

	//metodos
	public String getAtrx() {
		return this.atrx;
	}
	public void setAtrx(String atrx) {
		
	this.atrx = atrx;
	}
}
