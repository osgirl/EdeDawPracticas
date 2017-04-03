
public class CalculadoraDemo 
{
	
public static void main(String[] args) 
	{
	
	Calculadora Calc = new Calculadora();
	
	//System.out.println(" El resultado de sumar 2 y 3 es " + Calculadora.sumar(2,3));
	
	//System.out.println(" 2 + 4 = " + Calculadora.sumar(2,4));
	//System.out.println(" 4 - 1 = " + Calculadora.restar(4,1));
	//System.out.println(" 2 + 4 = " + Calculadora.multiplicar(4,1));
	//System.out.println(" 4 - 1 = " + Calculadora.dividir(4,1));


	System.out.println(" 2 + 4 = " + Calc.sumar(2,4));
	System.out.println(" 4 - 1 = " + Calc.restar(4,1));
	System.out.println(" 2 * 6 = " + Calc.multiplicar(4,1));
	System.out.println(" 8 / 4 = " + Calc.dividir(4,1));
	
	}

}
