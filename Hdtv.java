package session9;



import java.util.*;  

public class Hdtv {

  
 public int size;

 private String brand;
 Hdtv(String brand,int size){

public static void main(String args[]){  
 
Hdtv  t1=new Hdtv("S",23);  
 Hdtv t2=new Hdtv("R",21);  
  Hdtv t3=new Hdtv("H",25);  
      
  ArrayList<Hdtv> obj=new ArrayList<Hdtv>();
  obj.add(t1);// 
  obj.add(t2);  
  obj.add(t3);  
  

	
	for (Hdtv object:obj){
		
		System.out.println(obj);
	}
	
	System.out.println("=======Sorted========");
	Collections.sort(obj, new Comparator<Hdtv>() {

		@Override
		public int compare(Hdtv t1, Hdtv t2) {
			return( t2.size()- t1.size());
				


	
for (Hdtv objects:obj){
	
	System.out.println(obj);
}
		
			
		

		
	


		
	

	





	
	


   
     
	




  
	
	   
	
	    
	     
  


