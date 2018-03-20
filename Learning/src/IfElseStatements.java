
public class IfElseStatements {

	public static void main(String[] args) {
		if (4==3) // 3==3 --> is 3 equal to 3?
		{
			System.out.println("Inside the if statement!");
		}
		else
		{
			System.out.println("Not inside the if statement!");
		}

		double defaultTicketPrice = 10.00;
		double discount = .1;
		double ticketPrice = defaultTicketPrice;
		int age = 20;
		if(age < 18)
		{
			//give a 10% discount
			ticketPrice = ticketPrice - ticketPrice * discount;
		}
		else if (age <25)
		{
			//give a 5% discount
			ticketPrice = ticketPrice - ticketPrice * .05;
		}
		
		System.out.println(ticketPrice);
		
	}

}
