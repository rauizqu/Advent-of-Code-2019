import java.util.ArrayList;

public class Dia4_Parte2 {

	public static void main(String[] args) {
		ArrayList<Integer> array_corte_1= new ArrayList<Integer>();
		ArrayList<Integer> posiciones= new ArrayList<Integer>();
		ArrayList<Integer> digitos= new ArrayList<Integer>();	
		int sexto;
		int quinto;
		int cuarto;
		int tercero;
		int segundo;
		int primero;
		int numero;
		for (int i=109165;i<=576723;i++) {
			digitos.clear();
			for (int j=0;j<6;j++) {
				digitos.add(0);
			}
			numero = i;
			sexto = numero%10;
			numero = numero/10;
			quinto = numero%10;
			numero= numero/10;
			cuarto = numero%10;
			numero = numero/10;
			tercero = numero%10;
			numero = numero/10;
			segundo = numero%10;
			numero = numero/10;
			primero = numero%10;
			if((sexto>=quinto)&&(quinto>=cuarto)&&(cuarto>=tercero)&&(tercero>=segundo)&&(segundo>=primero)) {
				digitos.set(5,sexto);
				digitos.set(4,quinto);
				digitos.set(3,cuarto);
				digitos.set(2,tercero);
				digitos.set(1,segundo);
				digitos.set(0,primero);
				if(primero==segundo) { 
					digitos.remove(0);
					digitos.remove(0);
					int contador_1 = 0;
					for(int k=0;k<digitos.size();k++) {
						if (digitos.get(k)!=primero) {
							contador_1++;
							posiciones.add(k);
						}
					}
					if((contador_1==4)||(contador_1==2)) {
							array_corte_1.add(i);

					}
				}else if (segundo==tercero) {
					digitos.remove(1);
					digitos.remove(1);
					int contador_1 = 0;
					for(int k=0;k<digitos.size();k++) {
						if (digitos.get(k)!=segundo) {
							contador_1++;
						}
					}
					if((contador_1==4)||(contador_1==2)) {
						array_corte_1.add(i);
					}
				}else if (tercero==cuarto) {
					digitos.remove(2);
					digitos.remove(2);
					int contador_1 = 0;
					for(int k=0;k<digitos.size();k++) {
						if (digitos.get(k)!=tercero) {
							contador_1++;
						}
					}
					if((contador_1==4)||(contador_1==2)) {
						array_corte_1.add(i);
					}
				}else if (cuarto==quinto) {
					digitos.remove(3);
					digitos.remove(3);
					int contador_1 = 0;
					for(int k=0;k<digitos.size();k++) {
						if (digitos.get(k)!=cuarto) {
							contador_1++;
						}
					}
					if((contador_1==4)||(contador_1==2)) {
						array_corte_1.add(i);
					}
				}else if (quinto==sexto){
					digitos.remove(4);
					digitos.remove(4);
					int contador_1 = 0;
					for(int k=0;k<digitos.size();k++) {
						if (digitos.get(k)!=quinto) {
							contador_1++;
						}
					}
					if((contador_1==4)||(contador_1==2)) {
						array_corte_1.add(i);
					}				
				}	
			}
		}	
		System.out.println(array_corte_1.size()+4);
	}

}