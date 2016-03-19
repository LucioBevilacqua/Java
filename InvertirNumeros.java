package javaUTN;

import java.util.Scanner;

public class InvertirNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1[] = new int[10];		
		
		Scanner entrada=new Scanner(System.in);		
		
		for(int i=0;i<n1.length;i++){
			
			System.out.println("#"+ (i+1) + ": ");
			n1[i] =entrada.nextInt();
			
		}
		
		
		for(int j=n1.length-1;j>-1;j--){
			
			System.out.println("" + n1[j]);
		}		
		
	
		
	}

}
