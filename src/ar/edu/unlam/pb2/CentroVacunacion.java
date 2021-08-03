package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CentroVacunacion {
	
	private Set<Paciente>pacientes;
	
	public CentroVacunacion() {
		this.pacientes = new TreeSet<Paciente>();
	}
	
	public Boolean vacunar(Paciente paciente, Vacuna vacuna) {
		Boolean estado = false;
		for(Paciente e: pacientes) {
			if(e.getVacuna(vacuna) == null) {
				if(vacuna.getDosis().equals("Primer dosis")) {
					
				}
			}
		}
		
		return estado;
	}

}
