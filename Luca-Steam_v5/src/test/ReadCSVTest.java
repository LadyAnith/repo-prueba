package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import utilities.ReadCSV;

/**
 * Nombre Clase: ReadCSVTest.java 
 * Descripcion: Clase para realizar pruebas del m�todo LeerFicher().
 * Unitarias de un fichero CSV 
 * Fecha: 16/06/2021 Version: 1.0
 * 
 * @author Ana D�az, Sara Sevillano, Rebeca Mart�nez, Rocio Jimenez, Ana M� Ram�rez
 */
class ReadCSVTest {
	/**
	 * Atributo de la clase ReadCSV
	 */
	private final ReadCSV rcsv = new ReadCSV();

	/**
	 * M�todo de prueba que comprueba si el fichero tiene contenido.
	 */
	@Test
	public void testRecuperarCantidadDeLineas() {
		boolean expectedResult = true;
		boolean realResult = ReadCSV.leerFichero().size() > 0;
		Assert.assertEquals(expectedResult, realResult);
	}

	/**
	 * M�todo de prueba que devuelve true si la cabecera del archivo CSV es correcta.
	 */
	@Test
	public void testLeerCabecera() {
		String cabecera1 = "Rank";
		String cabecera2 = "Name";
		String cabecera3 = "Platform";
		String[] cabeceras = ReadCSV.leerFichero().get(0);

		boolean expectedResult = true;
		boolean realResult = cabeceras[0].equals(cabecera1);
		Assert.assertEquals(expectedResult, realResult);

		realResult = cabeceras[1].equals(cabecera2);
		Assert.assertEquals(expectedResult, realResult);

		realResult = cabeceras[2].equals(cabecera3);
		Assert.assertEquals(expectedResult, realResult);
	}

}
