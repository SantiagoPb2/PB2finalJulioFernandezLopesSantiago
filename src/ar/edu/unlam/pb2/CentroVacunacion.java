package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CentroVacunacion {
	
	private List<Paciente>pacientes;
	
	public CentroVacunacion() {
		this.pacientes = new LinkedList<Paciente>();
	}
	
	public void agregarPaciente(Paciente paciente) {
		this.pacientes.add(paciente);
	}
	
	public void vacunarHepatitisRubeola(Paciente paciente, Vacuna vacuna,String enfermedad) {
		Paciente pacienteBusqueda = buscarPaciente(paciente);
		
		if(pacienteBusqueda == null) {
			
		}else if(pacienteBusqueda.hasEnfermedad(enfermedad)) {
			
		}else {
			pacienteBusqueda.agregarVacuna(vacuna);			
		}
	
	}
	
	public void vacunarCovid(Paciente paciente, Vacuna vacuna) throws NoCovidVaccineException {
		Paciente pacienteBusqueda = buscarPaciente(paciente);
		
		if(pacienteBusqueda == null) {
			
		}else if(pacienteBusqueda.buscarPrimeraDosis().equals(Boolean.TRUE)) {
			if(vacuna.getDosis().equals("Segunda dosis")) {
				pacienteBusqueda.agregarVacuna(vacuna);
			}
			
		}else if(vacuna.getDosis().equals("Primera dosis")){ 
				pacienteBusqueda.agregarVacuna(vacuna);

			
		}else {
			throw new NoCovidVaccineException();

		}
		
	}
	
	public Boolean estaVacunadoPorCovid(Paciente paciente, Vacuna primeraDosis, Vacuna segundaDosis) {
		List <Vacuna>vacunas = paciente.getVacunas();
		if(vacunas.contains(primeraDosis) && vacunas.contains(segundaDosis)) {
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
	}
	
	private Paciente buscarPaciente(Paciente paciente) {
		for(Paciente e: pacientes) {
			if(e.getDni().equals(paciente.getDni())) {
				return e;
			}
		}
		return null;
	}

}
