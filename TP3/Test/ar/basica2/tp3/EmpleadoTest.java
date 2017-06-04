package ar.basica2.tp3;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {
	
	@Test
	public void testServicioImpuesto() {
		
		Date miFecha = new Date();
		ServicioImpuesto miImpuesto = new ServicioImpuesto();
		Gerente miGerente = new Gerente("Esteban", 35.000, miFecha);
		
		Double impuestoActual = 2.000;
		Double impuestoEsperado = miImpuesto.obtenerImpuestos(miGerente);
		
		Assert.assertEquals(impuestoEsperado, impuestoActual);
	}
}
