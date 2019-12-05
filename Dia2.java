import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Dia2 {

	public static void main(String[] args) throws FileNotFoundException {
		File archivo= null;
		FileReader fr = null;
		BufferedReader br = null;
		StringTokenizer st = null;
		try {
	          archivo = new File ("C:\\Users\\Raúl y Pablo\\Desktop\\AdventOfCode2019\\Dia2.txt");
	          fr = new FileReader (archivo);
	          br = new BufferedReader(fr);
	          String linea=br.readLine();
	          st = new StringTokenizer(linea,",");
	          ArrayList<String> arrayNumeros = new ArrayList<String>();
	          while (st.hasMoreTokens()) {
	        	  arrayNumeros.add(st.nextToken());
	          }
	          int suma;
	          int producto;
	          int contador_de_instr_1=0;
	          int contador_de_instr_2=0;
        	  arrayNumeros.set(Integer.valueOf(1), String.valueOf(12));
        	  arrayNumeros.set(Integer.valueOf(2), String.valueOf(2));        
	          for (int i=0;i<arrayNumeros.size();i=i+4) {
	        	  suma=0;
	        	  producto=0;
	        	  if(Integer.valueOf(arrayNumeros.get(i))==1) {
	        		  suma=Integer.valueOf(arrayNumeros.get(Integer.valueOf(arrayNumeros.get(i+1))))+Integer.valueOf(arrayNumeros.get(Integer.valueOf(arrayNumeros.get(i+2))));
	        		  arrayNumeros.set(Integer.valueOf(arrayNumeros.get(i+3)), String.valueOf(suma));
	        		  contador_de_instr_1=contador_de_instr_1+4;
	        	  }else if(Integer.valueOf(arrayNumeros.get(i))==2) {
	        		  producto=Integer.valueOf(arrayNumeros.get(Integer.valueOf(arrayNumeros.get(i+1))))*Integer.valueOf(arrayNumeros.get(Integer.valueOf(arrayNumeros.get(i+2))));
	        		  arrayNumeros.set(Integer.valueOf(arrayNumeros.get(i+3)), String.valueOf(producto));
	        		  contador_de_instr_2=contador_de_instr_2+4;
	        	  }else if(Integer.valueOf(arrayNumeros.get(i))==99) {
	        		  
	        	  }
	          }
	          System.out.println(arrayNumeros.get(0));
	       }
	       catch(Exception e){
	          e.printStackTrace();
	       }finally{
	          try{                    
	             if( null != fr ){   
	                fr.close();     
	             }                  
	          }catch (Exception e2){ 
	             e2.printStackTrace();
	          }
	       }
	}
}