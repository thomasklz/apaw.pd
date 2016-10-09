package apaw.pd.TexSingletonCompositeFlyweight;

import java.util.HashMap;
import java.util.Map;

public class Factoria {

	private static Factoria factoria = new Factoria();
	
	private Map<Character, Caracter> caracter;
	
	public Factoria(){
		this.caracter=new HashMap<Character, Caracter>();
	}
	
	public static Factoria getFactoria(){
		return factoria;
	}
	
	 public Caracter get(char key ){
		 
		 if (caracter.containsKey(key)){
			 return caracter.get(key);
		 }else{
			 
			 Caracter caracteres= new Caracter(key);
			 this.caracter.put(key, caracteres);
			 return caracteres;
		 }
		
	 }
	
	
}
