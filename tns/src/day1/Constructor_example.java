package day1;

public class Constructor_example {
	Constructor_example() {
		System.out.println("default constructor");		
	}
	Constructor_example(int a){
		System.out.println("constructor with one parameter");
	}
	Constructor_example(int b,String a){
		System.out.println("constructor with different parameters");
	}
	public static void main(String args[]) {
		Constructor_example c=new Constructor_example();
		Constructor_example b=new Constructor_example(4);
		Constructor_example s=new Constructor_example(3,"s");
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
	}

}
