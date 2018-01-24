package edu.cnm.deepdive;

public class Gauss {

  private static final int DEFAULT_UPPER_LIMIT = 100; //final is a modifier that is unchangeable. all upper case for this type
  
  public static void main(String[] args) {//args is created in the HEAP so the string in args is at least a string of 0 length; arg[name] name=0 is valid
   int upperLimit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_LIMIT;//ternary operator has 3 piece of operation boolean ? :
                  //  if this true   then    do this        otherwise    do this
                                           //parse for array [0] to an int
 //Long upperLimit = sum  
   System.out.printf("The sum from 1 to %,d is %,d%n", upperLimit, sum(upperLimit));//two % means 2 things to the sentence print
  }                                                              //upperLimit is invoke sum method from public static long sum
  
  public static long sum(int limit) {
    long sum = 0;
    for (int i = 1; i <= limit; i++) {
      sum += i;
    }
    return sum;
    
  }
  public static long smartSum(int limit) {
    long sum = ((long) limit) * ((long) limit + 1) / 2;
    return sum;
  }
}
