//first program concept//
package Pack1;

public class boy {
public static int noofhands;
public static int nooflegs;
//static properties of boy class//

public String name;
public String colour;
public String ig;
public String cos;
//non-static properties of boy class//

public static void breath()
{
	System.out.println("breathing");
}
public static void sleep()
{
	System.out.println("sleeping");
}//static functions of boy class//

public void play()
{
	System.out.println(name+"playing"+ig);
}
public void study()
{
	System.out.println(name+"studying"+cos);
}//non-static functions//

public static void main(String[] args) {
		boy b1 = new boy();
		b1.name = "suresh";
		b1.colour = "white";
		b1.ig = "cricket";
		b1.cos = "1st class";//creating a object for boy class//
		
		boy b2 = new boy();
		b2.name = "mahesh";
		b2.colour = "pure white";
		b2.ig = "foot ball";
		b2.cos = "2nd class";//creating object for boy class//
		
	//calling the output//
		breath();
		sleep();
		b1.play();
		b1.study();
		System.out.println("my name is happy");
		b2.study();
		b2.play();
		System.out.println("i am very happy to write java program");
		
		
		

	}

}
