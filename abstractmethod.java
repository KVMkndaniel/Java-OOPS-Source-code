package oops;



// abstract class

 abstract class data{
	// abstract method 
	abstract  void add(); 
    
	//normal method 
	void show() {
	
		System.out.println("this method show");
	}
	 
 
 }
 
 
 
public class abstractmethod extends data {
	public static void main(String[] args) {
	  
		abstractmethod ce =new abstractmethod();
		ce.add();
		ce.show();
		
	}
// abstract method override
	@Override
	void add() {
	System.out.println("this method add");
		
	}

}
