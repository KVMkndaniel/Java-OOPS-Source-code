package oops;

 class car{
	
	//color,weight,model
	//break,Accelerate,gear
	String color;
	double weight;
	String model;
	
  public car(String color, double weight,String model) {
		// TODO Auto-generated constructor stub
			
			this.color = color ;
			this.weight = weight ;
			this.model = model ;
			
	}
		  public car() {
			  
			  String name = "kumar";
			  System.out.println("my name is : " + name);
		}
		void applybreak() {
			System.out.println("car breaked");
			
		}		
		void acceleatre() {
			System.out.println("car fasted");

			}
		void gearchange() {
			System.out.println("car gearchange");

		}	
}

public class ObjectCar  {

		public static void main(String[] args) {
		
		car drive = new car("yellow",100.2d,"audi");

		car drive1 = new car();
		
		//default constructers
		 System.out.println(drive1);
		 System.out.println(drive1);

		//parameter constructers methods access
		drive.applybreak();
		drive.acceleatre();
		drive.gearchange();
		
		System.out.println(drive.color);
		System.out.println(drive.model);
		System.out.println(drive.weight);
	
			
	}
}
