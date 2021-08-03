package ar.edu.unlam.pb2;

public abstract class Vacuna {
	
	private String nombre;
	private Integer codigoVacuna;
	
	public Vacuna(String nombre, Integer codigoVacuna) {
		this.nombre = nombre;
		this.codigoVacuna = codigoVacuna;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigoVacuna() {
		return codigoVacuna;
	}

	public void setCodigoVacuna(Integer codigoVacuna) {
		this.codigoVacuna = codigoVacuna;
	}
	
	public String getDosis() {
		return "";
	}

}
