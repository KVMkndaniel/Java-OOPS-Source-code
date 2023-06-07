package oops;


//Method OverLoading  & Static Polymorphism & Compile Time Polymorphism

class Overloading{
	void display() {
		System.out.println("Hello From Display method ");
	}
	
	void display(String name) {
		System.out.println("Name is : "+name);
	}
	
	void display(int x ,int  y) {
		System.out.println("sum is : "+(x+y));
	}
}

//Method Overriding  & Dynamic Polymorphism & Run Time Polymorphism

class WildAnimal{
	void makenoise() {
		System.out.println("deafult sound ");
	}
	
	
	void makenoise(String name) {
		System.out.println("Animal name and sound "+name);
	}
	
}	
class Lion extends WildAnimal {
		void makenoise() {
		System.out.println("Lion Llllloooorrrr....");
	}
		void Lion() {
			System.out.println("Lion method this");
		}

		void makenoise(String name) {
			System.out.println("Animal name and sound "+name);
		}
		
}	

class cat extends WildAnimal {
	void makenoise() {
	System.out.println("Cat Meow mewo meow...");
}
	void cat() {
		System.out.println("cat method this");
	}

	void makenoise(String name) {
		System.out.println("Animal name and sound "+name);
	}
	
}	




public class Polymarphism {
	public static void main(String[] args) {

		
		//Method OverLoading  & Static Polymorphism & Compile Time Polymorphism
		
		Overloading Load = new Overloading();
		
		Load.display();
		Load.display(10,20);
		Load.display("Kumar");
		
		
		//Method Overriding  & Dynamic Polymorphism & Run Time Polymorphism
		Lion L = new Lion();
		L.makenoise();
		L.Lion();
		L.makenoise("loin parameter");
	
		
		cat C = new cat();
		C.makenoise("cat parameter");
		C.cat();
		C.makenoise();
		
		
		
		
		
		
		
		
		
	}

}
