package ar.edu.unlam.pb2;

public class VacunaCovid extends Vacuna{
	
	private String dosis;

	public VacunaCovid(String nombre, Integer codigoVacuna,String dosis) {
		super(nombre,codigoVacuna);
		this.dosis = dosis;
	}

	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
	
}
