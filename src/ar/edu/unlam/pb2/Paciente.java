package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Paciente{
	
	private Integer dni;
	private String nombre;
	private List<Vacuna>vacunas;
	private List<String>enfermedades;
	
	public Paciente(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.vacunas = new LinkedList<Vacuna>();
		this.enfermedades = new LinkedList<String>();
	}
	
	public List<Vacuna> getVacunas() {
		return vacunas;
	}

	public void setVacunas(List<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}

	public void registrarEnfermedad(String enfermedad) {
			enfermedades.add(enfermedad);
	}
	
	public Boolean hasEnfermedad(String enfermedad) {
		if(enfermedades.contains(enfermedad)) {
			return true;
		}
		return false;
	}
	
	public void agregarVacuna(Vacuna vacuna) {
		this.vacunas.add(vacuna);

	}
	
	public Integer getCantidadVacunasAplicadas() {
		return this.vacunas.size();
	}
	
	public Boolean buscarPrimeraDosis() {
		for(Vacuna e:vacunas) {
			if(e.getDosis().equals("Primera dosis")) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
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
