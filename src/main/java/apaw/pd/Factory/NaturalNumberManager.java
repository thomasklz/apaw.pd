package apaw.pd.Factory;

public  class NaturalNumberManager {
	private NaturalNumber naturalNumber ;
	private NaturalNumberCreator naturalNumberCreator;
	
	public NaturalNumber getNaturalNumber(){
		return naturalNumber;
	}
	
	public void NaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
		this.naturalNumberCreator = naturalNumberCreator;
	}
	
	public void createNaturalNumber (int value ){
		
		this.naturalNumber= this.naturalNumberCreator.creatorNaturalNumber(value);
		
		
	}
	
	
	
}
