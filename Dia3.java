import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Dia3 {

	public static void main(String[] args) {
		File archivo= null;
		FileReader fr = null;
		BufferedReader br = null;
		StringTokenizer st_1 = null;
		StringTokenizer st_2 = null;
		try {
	          archivo = new File ("C:\\Users\\Raúl y Pablo\\Desktop\\AdventOfCode2019\\Dia3.txt");
	          fr = new FileReader (archivo);
	          br = new BufferedReader(fr);
	          ArrayList<String> lineas=new ArrayList<String>();
	          String linea=null;
	          int numero_linea=0;
	          while((linea = br.readLine()) != null) {
	        	  lineas.add(numero_linea, linea);
	        	  numero_linea++;
	          }
	          st_1 = new StringTokenizer(lineas.get(0),",");
	          st_2 = new StringTokenizer(lineas.get(1),",");
	          String palabra = null;
	          Point p = new Point(1,1);
	          ArrayList<Point> puntos_1 =new ArrayList<Point>();
	          ArrayList<Point> puntos_2 =new ArrayList<Point>();
	          ArrayList<Integer> pasos_1 = new ArrayList<Integer>();
	          ArrayList<Integer> pasos_2 = new ArrayList<Integer>(); 
	          puntos_1.add(p);
	          puntos_2.add(p);
	          int numero_palabra = 0;
	          int pos_x=0;
	          int pos_y=0;
	          int i;
	          while (st_1.hasMoreTokens()) {
	        	  palabra=st_1.nextToken();
	        	  numero_palabra=Integer.parseInt(palabra.substring(1,palabra.length()));
	        	  i=0;
	        	  if(palabra.charAt(0)=='L') {
	        		  while (i!=numero_palabra) {
	        			  i++;
	        			  pos_x=pos_x-1;  
			        	  p=new Point(pos_x,pos_y);
			        	  puntos_1.add(p);
	        		  }
	        		  pasos_1.add(i);
		          }else if(palabra.charAt(0)=='R') {
	        		  while (i!=numero_palabra) {
	        			  i++;
	        			  pos_x=pos_x+1;  
			        	  p=new Point(pos_x,pos_y);
			        	  puntos_1.add(p);		        	  
	        		  }
	        		  pasos_1.add(i);
		          }else if(palabra.charAt(0)=='U') {
		        	  while (i!=numero_palabra) {
		        		  i++;
		        		  pos_y=pos_y+1;  
			        	  p=new Point(pos_x,pos_y);
			        	  puntos_1.add(p);
		        	  }
	        		  pasos_1.add(i);
		          }else if(palabra.charAt(0)=='D') {
		        	  while (i!=numero_palabra) {
		        		  i++;
		        		  pos_y=pos_y-1;  
			        	  p=new Point(pos_x,pos_y);
			        	  puntos_1.add(p);
		        	  }
	        		  pasos_1.add(i);
		          }
	          }
	          pos_x=0;
	          pos_y=0;
	          while (st_2.hasMoreTokens()) {
	        	  palabra=st_2.nextToken();
	        	  numero_palabra=Integer.parseInt(palabra.substring(1,palabra.length()));
	        	  i=0;
	        	  if(palabra.charAt(0)=='L') {
	        		  while (i!=numero_palabra) {
	        			  pos_x=pos_x-1;  
			        	  p=new Point(pos_x,pos_y);
			        	  puntos_2.add(p);
			        	  i++;
	        		  }
	        		  pasos_2.add(i);
		          }else if(palabra.charAt(0)=='R') {
	        		  while (i!=numero_palabra) {
	        			  pos_x=pos_x+1;  
			        	  p=new Point(pos_x,pos_y);
			        	  puntos_2.add(p);
			        	  i++;
	        		  }
	        		  pasos_2.add(i);
		          }else if(palabra.charAt(0)=='U') {
		        	  while (i!=numero_palabra) {
		        		  pos_y=pos_y+1;  
			        	  p=new Point(pos_x,pos_y);
			        	  puntos_2.add(p);
			        	  i++;
		        	  }
	        		  pasos_2.add(i);
		          }else if(palabra.charAt(0)=='D') {
		        	  while (i!=numero_palabra) {
		        		  pos_y=pos_y-1;  
			        	  p=new Point(pos_x,pos_y);
			        	  puntos_2.add(p);
			        	  i++;
		        	  }
	        		  pasos_2.add(i);
		          }
	          }
	          ArrayList<Integer> interseccion = new ArrayList<Integer>();
	          int min=10000000;
	          Point punto_minimo = null;
	          for (int j=0;j<puntos_1.size();j++) {
	        	  for(int k=0;k<puntos_2.size();k++) {
		        	  if(puntos_1.get(j).equals(puntos_2.get(k))&&(Math.abs(puntos_1.get(j).x)+Math.abs(puntos_1.get(j).y)!=2)){
		        		  interseccion.add(Math.abs(puntos_1.get(j).x)+Math.abs(puntos_1.get(j).y));
		        		  if(min>(Math.abs(puntos_1.get(j).x)+Math.abs(puntos_1.get(j).y))) {
		        			  min=(Math.abs(puntos_1.get(j).x)+Math.abs(puntos_1.get(j).y));
		        	          punto_minimo=new Point(puntos_1.get(j).x, puntos_1.get(j).y);
		        		  }
		        	  }
	        	  }
	          }
	          System.out.println(punto_minimo);
	          System.out.println(min);
		}catch(Exception e){
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
