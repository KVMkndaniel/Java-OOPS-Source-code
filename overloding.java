package oops;

class methodoverloding{
	
   void loding(){
	    System.out.println(" default parameter method");
	    
	   }
   void loding(String name) { 
	    System.out.println(" parameter method" +name);
	    
   }
   void loding (int x,int y) {
	   
	   System.out.println("method"+(x+y));
   }
 
}

public class overloding extends methodoverloding {
	
  public static void main(String[] args) {
     
	  overloding ce = new overloding();
	  ce.loding();
	  ce.loding("main");
	  ce.loding(2, 5);
}
}
