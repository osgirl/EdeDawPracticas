import org.junit.*;
import static org.junit.Assert.*;

public class LineTest 
{
	
	Line l1;
	double delta=0.001;
	double x0=1, y0=2, x1=3, y1=4;
	
	@Before
	public void setUp ()
	{
		l1 = new Line(1, 2, 3, 4);
	}
	
	@Test
	public void getSlopeTest () //calculate the slop of the line
	{
		double valorReal = l1.getSlope();
		double valorEsperado = (4-2)/(3-1);
		assertEquals(valorEsperado, valorReal, delta);
	}
	
	@Test
	public void getDistanceTest () //calculate the slop of the line
	{
		double valorReal = l1.getDistance();
		double valorEsperado = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
		assertEquals(valorEsperado, valorReal, delta);
	}
	
	@Test
	public void parallelToTest ()
	{
		Line l2 = new Line(2, 2, 3, 4);
		boolean valorReal = l1.parallelTo(l2);
		Line valorEsperado = l1=l2;
		assertTrue(!valorReal);
		assertFalse(valorReal);
	}
	
}
