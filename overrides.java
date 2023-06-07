package oops;

 class override{
	  
	 void car() {
		 
		 System.out.println( "method");
		 }
	 void car(String name) {
		 System.out.println("my own car"+name);
		 
	 }
}
 class override2  extends override{
     
	 void car(String name) {
    	 
    	 System.out.println(" my car  audi 2 "+name);
    	 
     }
     void car()  {
    	 
    	 System.out.println("my car audi1  3");
     }
     
	 
 }

public class overrides{
	
	public static void main(String[] args) {
		
		
		
		override2 o4ver = new override2();
		
		o4ver.car();
		o4ver.car("audica");
		
		override onb = new  override();
		
		onb.car();
		onb.car("bogii");
		
	}

	

	

}
