import junit.framework.TestCase;
import org.junit.Test;


public class FechaTest extends TestCase {
	/* Escribe las pruebas para comprobar:
	* - Para una fecha correcta
	* - Pon dos meses que estén mal
	* - Pon dos días que estén mal
	* - Que el més de noviembre tiene día 31
	* - Que el més de diciembre tiene día 31
	* - Que el mes de febrero tiene día 30
	* - Que el 29 de febrero existe para 2008 (que es bisiesto)
	* - Que el 29 de febrero no existe para un año que no sea
	bisiesto
	* - Comprobar que el año 1900 es bisiesto
	*/
	
	private Fecha fechaCorrecta = new Fecha(17,5,2017);
	private Fecha mesIncorrecto1 = new Fecha(17,5,2017);
	private Fecha mesIncorrecto2 = new Fecha(17,5,2017);
	
	
	
	
	@Test
	public void testValida() {
	/* Para cada una de las fechas creadas anteriormente, hacer
	las comprobaciones
	* utilizando el método más adecuado para el caso
	*/
		assertTrue(fechaCorrecta.valida());
		
	}
}
