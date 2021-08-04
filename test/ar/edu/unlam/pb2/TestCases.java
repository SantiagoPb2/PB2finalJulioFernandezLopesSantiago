package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestCases {

	@Test
	public void queAlCrearseUnPacienteEsteNoEsteVacunado() {
		Paciente numero1 = new Paciente(41399474,"Santiago");
		Paciente numero2 = new Paciente(202131231,"Ruben");
		assertEquals(0,numero1.getCantidadVacunasAplicadas(),0.0);
		assertEquals(0,numero2.getCantidadVacunasAplicadas(),0.0);
	}

	@Test
	public void estaVacunadoContraCovid() throws NoCovidVaccineException {
		Paciente numero1 = new Paciente(41399474,"Santiago");
		Paciente numero2 = new Paciente(202131231,"Ruben");
		CentroVacunacion centro = new CentroVacunacion();
		Vacuna covid = new VacunaCovid("Covid",1,"Primera dosis");
		Vacuna covid1 = new VacunaCovid("Covid",2,"Segunda dosis");
		
		centro.agregarPaciente(numero2);
		centro.agregarPaciente(numero1);
		
		centro.vacunarCovid(numero1, covid);
		centro.vacunarCovid(numero1, covid1);
		centro.vacunarCovid(numero2, covid);
		centro.vacunarCovid(numero2, covid1);
		
		assertTrue(centro.estaVacunadoPorCovid(numero1, covid, covid1));
		assertTrue(centro.estaVacunadoPorCovid(numero2, covid, covid1));
	}
	
	@Test(expected = NoCovidVaccineException.class)
	public void queNoSePuedaVacunarCon2daDosisSinLaPrimera() throws NoCovidVaccineException {
		Paciente numero1 = new Paciente(41399474,"Santiago");
		Paciente numero2 = new Paciente(202131231,"Ruben");
		CentroVacunacion centro = new CentroVacunacion();
		Vacuna covid = new VacunaCovid("Covid",1,"Primera dosis");
		Vacuna covid1 = new VacunaCovid("Covid",2,"Segunda dosis");
		
		centro.agregarPaciente(numero2);
		centro.agregarPaciente(numero1);
		
		centro.vacunarCovid(numero1, covid1);
		centro.vacunarCovid(numero1, covid);

		centro.vacunarCovid(numero2, covid1);
		centro.vacunarCovid(numero2, covid);

		
		assertFalse(centro.estaVacunadoPorCovid(numero1, covid, covid1));
		assertFalse(centro.estaVacunadoPorCovid(numero2, covid, covid1));
	}
	
	@Test
	public void queNoSePuedaVacunarSiEstuvoEnfermoDeRubeolaOHepatitis() {
		Paciente numero1 = new Paciente(41399474,"Santiago");
		Paciente numero2 = new Paciente(202131231,"Ruben");
		CentroVacunacion centro = new CentroVacunacion();
		Vacuna hepatitis = new VacunaHepatitis("Hepatitis",1);
		Vacuna rubeola = new VacunaRubeola("Rubeola",2);
		String hepatitisA = "Hepatitis";
		String rubeolaA = "Rubeola";
		
		centro.agregarPaciente(numero2);
		centro.agregarPaciente(numero1);
		
		numero1.registrarEnfermedad(hepatitisA);
		numero2.registrarEnfermedad(rubeolaA);
		
		assertTrue(numero1.hasEnfermedad(hepatitisA));
		assertTrue(numero2.hasEnfermedad(rubeolaA));
	}
	
	@Test
	public void queLosPacientesEstenOrdenados() {
		fail("Not yet implemenadasdted");
	}
	

}
