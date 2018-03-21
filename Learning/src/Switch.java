//A better way for if else statements if the decision chain gets too long
public class Switch {

	public static void main(String[] args) {
		
		int age = 50;
		
		switch(age)
		{
			case(1):
				System.out.println("You are 1");
				break;
			case(30):
				System.out.println("You are old!");
				break;
			case(50):
				System.out.println("You are very old!");
				break;
		}
	}

}
