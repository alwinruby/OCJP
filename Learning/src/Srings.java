
public class Srings {
	public static void main(String[] args)

    {

           // char myChar ='abc'; - will give a complier error

           // A string is simply a sequence of chars, which can be represented as an array

           //Essentially an array is creating a little block of memory [A], [B], [C], [D], [E], [F]

           String myString = "abcdef";

           System.out.println(myString);

          

           String weirdInitialisation = new String("abcdef");

           System.out.println(weirdInitialisation);

          

           boolean areStringsThesame = myString.equals(weirdInitialisation);

           if (areStringsThesame)// checks the content of the strings

           {

                  System.out.println("Strings are the same!");

           }

           else

           {

                  System.out.println("Strings are NOT the same!");

           }

          

           if (myString == weirdInitialisation)//checks the location of the memory

           {

                  System.out.println("Strings are the same!");

           }

           else

           {

                  System.out.println("Strings are NOT the same!");

           }

          

           //Strings are immutable, i.e CANNOT BE CHANGED after creating

           String nonImmutableString ="Hello"; // [Hello] <---- nonImmutable

           nonImmutableString = nonImmutableString.replaceAll("l", "o");//[Hello] ---> new block of memory

           System.out.println(nonImmutableString);

    }
}
