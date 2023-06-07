package oops;


class Grandfather{
	
	
	void gfhome() {
		System.out.println("old house in grand father house");
	}
}
class father extends Grandfather{
	void fhouse() {
		System.out.println("new House in father home ");
	}
}

class son extends father{
	void plat(){
		System.out.println("My plats in stay ");
	}
}





public class multipleinheritance {

	public static void main(String[] args) {

		son s = new son();
		s.gfhome();
		s.fhouse();
		s.plat();
	}

}
