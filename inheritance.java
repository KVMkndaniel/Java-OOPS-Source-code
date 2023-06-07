package oops;


class college {
	String instutename = "kaashiv";
	String location = "chennai";
	void show() {
		System.out.println("Instutename : "+instutename+"LOcation :"+location);
	}
}
//single level inherritance
class teacher extends college {
	String name = "srikanth";
	
	void display() {
		System.out.println("Name :"+name+"Instutename : "+instutename+"LOcation :"+location);
	}	}	




public class inheritance {

	public static void main(String[] args) {
		
		teacher t = new teacher();	
		//single inheritancee
		t.display();
		t.show();
		
	}

}
