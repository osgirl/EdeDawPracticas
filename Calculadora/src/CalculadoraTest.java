import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest 
{
	Calculadora Calc;

	@Before
	public void antesDelTest(){
		Calc = new Calculadora();
		System.out.println("Reiniciando calculadora... ");
	}
	
	@Test
	public void sumarTest()
	{
		float resultado = Calc.sumar(2, 4);
				System.out.println("2 + 4 = " + resultado);
				assertEquals("Metodo sumarTest", 6.0, resultado, 0);
	}
	
	@Test
	public void restarTest()
	{
		float resultado = Calc.restar(4, 1);
				System.out.println("4 - 1 = " + resultado);
				assertEquals("Metodo restarTest", 4.0, resultado, 0);
	}
	
	@Test
	public void multiplicarTest()
	{
		float resultado = Calc.multiplicar(2, 6);
				System.out.println("2 * 6 = " + resultado);
				assertEquals("Metodo multiplicarTest", 12.0, resultado, 0);
	}
	
	@Test
	public void dividirTest()
	{
		float resultado = Calc.dividir(8, 4);
				System.out.println("8 / 4 = " + resultado);
				assertEquals("Metodo dividirTest", 2.0, resultado, 0);
	}
	
}
