package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte primitivo
		byte datoByte = 2;
		Byte datoByteWrapper = 3;    //Wrapper
		System.out.println("Primitivo: "+datoByte);
		System.out.println("Wrapper: "+datoByteWrapper);
		//Conversiones
		byte datoByte1 = 6;
		Byte datoConvertido = datoByte1;
		System.out.println("Byte convertido: "+datoConvertido);
		//Conversiones 2
		Byte datoConvertido2 = 6;
		byte datoByte2 = datoConvertido2.byteValue();
		System.out.println("Byte convertido: "+datoByte2);

		
		// short
		short datoShort = 1;//primitivo
		Short datoShotrtWrapper = 1; //
		System.out.println("Primitivo: "+datoShort);
		System.out.println("Wrapper: "+datoShotrtWrapper);
		//Conversiones 
		short datoShort1 = 2;
		Short shortConvertido = datoShort1;
		System.out.println("Byte convertido: "+shortConvertido);
		//Conversiones 2
		Short shortConvertido2 = 2;
		short datoShort2 = shortConvertido2.shortValue();
		System.out.println("Byte convertido: "+datoShort2);
		
		
		//int
		int edad = 45; //primitivo
		Integer edadWrapper = 48; //Wrapper
		System.out.println("Primitivo: "+edad);
		System.out.println("Wrapper: "+edadWrapper);
		//Conversiones 
		int edad1 = 45; 
		Integer intConvertido = edad1;
		System.out.println("Int convertido: "+intConvertido);
		//conversiones 2
		Integer integerConvertido2 = 23;
		int edad2 = integerConvertido2.intValue();
		System.out.println("Int convertido: "+edad2);
		
		
		//long 
		long valorGrande = 125344L;  //primitivo
		Long valorgrandeWrapper= 123123L;  // Wrapper
		System.out.println("Primitivo: "+valorGrande);
		System.out.println("Wrapper: "+valorgrandeWrapper);
		//Conversiones
		long valorGrande1 = 12312L;
		Long longCompartido = valorGrande1;
		System.out.println("Long convertido: "+longCompartido);
		//Conversiones 2
		Long longCompartido2 = 2352L;
		long valorGrande2 = longCompartido2.longValue();
		System.out.println("Long convertido: "+valorGrande2);
		
		
		//boolean
		boolean datoBoolean = true; //primitivo
		Boolean datoBooleanWrapper = false; //Wrapper
		System.out.println("Primitivo: "+datoBoolean);
		System.out.println("Wrapper: "+datoBooleanWrapper);
		//Conversiones
		boolean datoBoolean1 = true;
		Boolean booleanConvertido = datoBoolean1;
		System.out.println("Boolean convertido: "+booleanConvertido);
		//Conversiones2
		Boolean booleanConvertido2 = false;
		boolean datoBoolean2 = booleanConvertido2.booleanValue();
		System.out.println("Boolean convertido: "+datoBoolean2);
		
		
		//float
		float datoFloat = 123F;//primitivo
		Float datoFloatWrapper = 3252F; //Wrapper
		System.out.println("Primitivo: "+datoFloat);
		System.out.println("Wrapper: "+datoFloatWrapper);
		//Conversiones
		float datoFloat1 = 1245F;
		Float floatConvertido = datoFloat1;
		System.out.println("Float convertido: "+floatConvertido);
		//Conversiones 2
		Float floatConvertido2 =2454F;
		float datoFloat2 = floatConvertido2.floatValue();
		System.out.println("Float convertido: "+datoFloat2);
		
		
		//double
		double DatoDouble = 234;  //primitivo
		Double DatoDoubleWrapper = (double) 123; //Wrapper
		System.out.println("Primitivo: "+DatoDouble);
		System.out.println("Wrapper: "+DatoDoubleWrapper);
		//Conversiones
		double DatoDouble1 = 254; 
		Double doubleConvertido = DatoDouble1;
		System.out.println("Double convertido: "+doubleConvertido);
		//Conversiones2
		Double doubleConvertido2 = (double) 234;
		double DatoDouble2 = doubleConvertido2.doubleValue(); 
		System.out.println("Double convertido: "+DatoDouble2);
		
		
		//char
		char datoChar = 'a';//primitivo
		Character datoCharWrapper = 'b';//Wrapper
		System.out.println("Primitivo: "+datoChar);
		System.out.println("Wrapper: "+datoCharWrapper);
		//Conversiones
		char datoChar1 = 'c';
		Character charConvertido = datoChar1;
		System.out.println("Char convertido: "+charConvertido);
		//Conversiones2
		Character charConvertido2 = 'f';
		char datoChar2 = charConvertido2.charValue();
		System.out.println("Char convertido: "+datoChar2);
	}

}
