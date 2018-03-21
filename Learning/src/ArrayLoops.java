import java.util.Arrays;

public class ArrayLoops {

	public static void main(String[] args) {
		int[] myArray = new int[4];
		myArray[0] = 20;
		myArray[1] = 30;
		myArray[2] = 2;
		myArray[3] = 4;
		
		int sum = 0;
		for(int j = 0; j < myArray.length; j++)
		{
			sum += myArray[j];
		}
		
		Arrays.sort(myArray);
		for (int i=0; i < myArray.length; i++)
		{
			System.out.println(myArray[i]);
		}
		
		System.out.println("**********");
		String[] names = 
		{
			"Al", "Bob", "Charlie", "Dave", "Ernie"
		};
		
		for(int k = 0; k<names.length; k++)
		{
			String name = names[k];
			System.out.println(names[k]);	
		}
		
		System.out.println("----------");
		for(String name : names)
		{
			System.out.println(name);
		}
	}

}
