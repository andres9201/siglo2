package cadenasamigas;

import java.util.Scanner;

public class Cadenas {
	public static void main(String[] args) {        
		Scanner scanner = new Scanner(System.in);        
		System.out.print("Ingrese la primera cadena (S): ");        
		String S = scanner.nextLine();        
		System.out.print("Ingrese la segunda cadena (T): ");        
		String T = scanner.nextLine();        
		boolean sonAmigas = verificarCadenasAmigas(S, T);        
		if (sonAmigas) {            
		System.out.println("Las cadenas son amigas.");        
		} else {            
		System.out.println("Las cadenas no son amigas.");        
		}    
		}    
		public static boolean verificarCadenasAmigas(String S, String T) {        
		if (S.length() != T.length()) {            
		return false;        
		}        
		int n = S.length();        
		for (int i = 1; i < n; i++) {            
		String u = S.substring(0, i);            
		String v = S.substring(i);            
		String vu = v + u;            
		if (vu.equals(T)) {                
		return true;            
		}        
		}               
		return false;    
		}
		}

