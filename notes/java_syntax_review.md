#Java Syntax and Class Review

1. What is the output of the following program?

      public static void main(String[] args)
      {
        int a = 2;
        double b = 4.0;
        double c = 10.0;
        double out = c/b  +  a/(2 * a);
        System.out.println(out);
      }
Answer - 2.5 the answer is stored as a double so that is fine.  For a/(2*a) can also be expressed as a/2a.  Now a may be cancelled out so effectively its 0/2 which is _zero_ Whenever you divide two
integers, you don’t worry about anything that comes after the decimal point in the
result - you’re always left with a whole number.
And hence the answer 2.5.


2. What is the output of the following program?

      public static void main(String[] args)
      {
        String in = "hello";
        String out = in.replaceAll("l", "");
        in = out.toUpperCase();
        System.out.println(in);
      }

Answer - HEO
So _in_ is assigned the string value of hello then in a new string called _out_ the contents of in with the l's replaced by no chars which now becomes heo.  Applying the toUpperCase method makes out now HEO.  This is now assigned to _in_.

First, we got rid of all the “l”s in hello. Then, we converted the string to uppercase
and re-assigned the original in variable. Careful: if we hadn’t reassigned the
original variable, we would have printed just hello.


3. Write code to capitalise the first letter of lowerCaseString.


      public static void main(String[] args)
      {
        String lowercaseString = "this is a very long lower case string";
        // One possible answer
        if (lowercaseString.length() > 0)
        {
          lowercaseString = Character.toUpperCase(lowercaseString.charAt(0)) +
          lowercaseString.substring(1, lowercaseString.length());
        }
        System.out.println(lowercaseString);
      }


4. Which of the following are correct ways of creating arrays in Java?
    a. String[] myArray = new String[];
    b. String[] myArray = { "Hey", "Bye", "Hello" };
    c. int myArray = new int[10];
    d. int[10] myArray = new int[];
    e. All of the above

Answer *b* and *c*

5. What is the output of the following program?

      public static void main(String[] args)
      {
        int val = 10;
        switch (val)
        {
          case 1:
            System.out.println("Orange");
            break;
          case 2:
            System.out.println("Pear");
            break;
          default:
            System.out.println("Apples!");
            break;
        }
      }

Answer *Apples* this is because in case of no value matching, in this case 10, the default is given, which is _Apples_
