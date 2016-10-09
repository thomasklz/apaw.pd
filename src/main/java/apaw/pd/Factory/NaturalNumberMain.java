package apaw.pd.Factory;

public  class NaturalNumberMain {

	public static void main(String[] args) {
		
		NaturalNumberManager managerNaturalNumber = new NaturalNumberManager();
	
		NaturalNumberCreator creatorEsNaturalNumber = new NaturalNumberEsCreator();
		managerNaturalNumber.NaturalNumberCreator(creatorEsNaturalNumber);
		managerNaturalNumber.createNaturalNumber(2);
		System.out.println(managerNaturalNumber.getNaturalNumber().getTextValue());
		
		NaturalNumberCreator creatorEnNaturalNumber = new NaturalNumberEnCreator();
		managerNaturalNumber.NaturalNumberCreator(creatorEnNaturalNumber);
		managerNaturalNumber.createNaturalNumber(5);
		System.out.println(managerNaturalNumber.getNaturalNumber().getTextValue());	
		
		NaturalNumberCreator creatorGerNaturalNumber = new NaturalNumberEnCreator();
		managerNaturalNumber.NaturalNumberCreator(creatorGerNaturalNumber);
		managerNaturalNumber.createNaturalNumber(4);
		System.out.println(managerNaturalNumber.getNaturalNumber().getTextValue());	
		
	}

}
