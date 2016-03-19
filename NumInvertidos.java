package primerEjemplo;
import java.util.*;

public class NumInvertidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[10];
		
		Scanner entrada = new Scanner(System.in);
		
	    for(int i=0;i<10;i++){
	    	
	    	System.out.println("Ingresa numero:");
	    	
	    	numeros[i] = entrada.nextInt();
	    	}
	    
	    for(int j=9;j>=0;j--){
	    	
	    	System.out.println(numeros[j]);
	    }		
	    entrada.close();
	}
}

