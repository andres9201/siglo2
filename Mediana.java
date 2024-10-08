package mediana;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mediana {
	public static void main(String[] args) {
		double[] numeros = {86, 45, 34, 90, 
		39, 28, 69};  
		double mediana = calcularMediana(numeros);                       
		System.out.println("La mediana es: " + mediana);    
		}            
		public static double calcularMediana(double[] numeros) {                
		Arrays.sort(numeros);                
		int n = numeros.length; if (n % 2 != 0) {                       
		return numeros[n/2];        
		} else {                       
		return (numeros[n/2 - 1] + numeros[n/2])/ 2.0;        
		}    
		}
		}
