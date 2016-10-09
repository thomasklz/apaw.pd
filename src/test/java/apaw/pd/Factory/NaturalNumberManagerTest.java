package apaw.pd.Factory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberManagerTest {
	
	private  NaturalNumberManager  managerNaturalNumber;
	
	@Before
	 public void initialize() {
		this.managerNaturalNumber= new NaturalNumberManager();
	}

	@Test
	public void testNaturalNumberEs() {
		NaturalNumberCreator creatorNaturalNumber = new NaturalNumberEsCreator();
		managerNaturalNumber.NaturalNumberCreator(creatorNaturalNumber);
		managerNaturalNumber.createNaturalNumber(2);
		assertEquals(this.managerNaturalNumber.getNaturalNumber().getTextValue(),"dos");
	}
	
	@Test
	public void testNaturalNumberEn() {
		NaturalNumberCreator creatorEnNaturalNumber = new NaturalNumberEnCreator();
		managerNaturalNumber.NaturalNumberCreator(creatorEnNaturalNumber);
		managerNaturalNumber.createNaturalNumber(5);
		assertEquals(this.managerNaturalNumber.getNaturalNumber().getTextValue(),"five");
	}
	
	@Test
	public void testNaturalNumberGer() {
		NaturalNumberCreator creatorGerNaturalNumber = new NaturalNumberGerCreator();
		managerNaturalNumber.NaturalNumberCreator(creatorGerNaturalNumber);
		managerNaturalNumber.createNaturalNumber(4);
		assertEquals(this.managerNaturalNumber.getNaturalNumber().getTextValue(),"vier");
	}

	
}
