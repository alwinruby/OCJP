public class Types {

       public static void main(String[] args)

       {

              int myInt = 20; // For storing whole numbers

              double myDouble = 20.55; // For storing numbers with decimals

              int sum = myInt +10;

             

              //Adding an integer and a double as an integer will give a compiler error

              //int sum1 = myInt + myDouble;

             

              int sum2 =(int)(myInt + myDouble);

              boolean isRainy = true; // 0 == false, 1 == true

             

              if(isRainy)

              {

                     System.out.println("You need an umbrella");

              }

             

              int nine = 9;

              char myChar = '9'; // A -> number 57 ---> 00111001

              // number 9 ---> 00001001

             

              int mappedVal = (int) myChar;

              System.out.println(myChar);

              System.out.println(mappedVal);

             

              // 'A' + 'B' + 'C'; Strings are just a collection or sequence of characters

       }

}