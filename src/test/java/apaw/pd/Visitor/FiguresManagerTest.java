package apaw.pd.Visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FiguresManagerTest {
	private FiguresManager figuresManager = new FiguresManager();
	private Triangle tringle = new Triangle("Triangulo (Base:2)(Altura:4) ", 2, 4);
	private Square square = new Square("Longitud del Cuadrado es de", 4);

	@Before
	public void before() {
		this.figuresManager.add(tringle);
		this.figuresManager.add(square);
	}

	@Test
	public void testTotalArea() {
		this.figuresManager.add(new Circle("Radio del circulo es:", 2.75));
		assertEquals(this.figuresManager.totalArea(), 43.75829, 10e-5);
	}

	@Test
	public void testTotalNumberOfSides() {
		assertEquals(this.figuresManager.totalNumberOfSides(), 7, 10e-5);
	}

}
