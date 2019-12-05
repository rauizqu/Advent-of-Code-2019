import java.util.ArrayList;

public class Dia4 {

	public static void main(String[] args) {
		ArrayList<Integer> array_corte_1= new ArrayList<Integer>();
		int sexto;
		int quinto;
		int cuarto;
		int tercero;
		int segundo;
		int primero;
		int numero;
		for (int i=109165;i<=576723;i++) {
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
			if((primero==segundo || segundo==tercero || tercero==cuarto || cuarto==quinto || quinto==sexto)&&((sexto>=quinto)&&(quinto>=cuarto)&&(cuarto>=tercero)&&(tercero>=segundo)&&(segundo>=primero))){
				array_corte_1.add(i);
			}
		}	
		System.out.println(array_corte_1.size());
	}

}
