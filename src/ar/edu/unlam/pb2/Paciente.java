package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Paciente {
	
	private Integer dni;
	private String nombre;
	private List<Vacuna>vacunas;
	private List<String>enfermedades;
	
	public Paciente(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.vacunas = new LinkedList<Vacuna>();
	}
	
	public void registrarEnfermedad(String enfermedad) {
		if(this.enfermedades.contains(enfermedad)) {
			
		}else {
			enfermedades.add(enfermedad);
		}
	}
	
	public void darVacuna(Vacuna vacuna) {
		this.vacunas.add(vacuna);

	}
	
	public Integer getCantidadVacunasAplicadas() {
		return this.vacunas.size();
	}
	
	public Vacuna getVacuna(Vacuna vacuna) {
		for(Vacuna e:vacunas) {
			if(e.getCodigoVacuna().equals(vacuna.getCodigoVacuna())) {
				return e;
			}
		}
		return null;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
