package assignment_practice;

public class ChatApplication {
	
	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.name = "Ram";
		h1.age = 25;
		h1.color= "Fair";
		h1.height = 172;
		
		Human h2 = new Human();
		h2.name = "Shyam";
		h2.age = 26;
		h2.color= "Fair";
		h2.height = 175;
		
		System.out.println(h1.name);
		System.out.println(h2.name);
		
		h1.toSpeak("Hello");
		h2.toSpeak("I am fine");
		
		h2.happybirthday();
		System.out.println(h2.age);
		
		h1.happybirthday();
		h2.toSpeak("Thanks");
		
		Vehicles obj1 = new Vehicles();
		obj1.Brand = "Mahindra";
		obj1. Color = "White";
		
		Vehicles obj2 = new Vehicles();
		obj2.Brand = "Maruti Suzuki";
		obj2.Color = "Black";
		
		System.out.println(obj1.Brand);
		System.out.println(obj1.Color);
		System.out.println(obj2.Brand);
		System.out.println(obj2.Color);
		
		obj1.move("Scarpoi");
		obj1.move("SUV700");
		obj2.move("Swift Desire");
		obj2.move("Baleeno");
		
		
	}

}
