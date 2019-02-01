public class Recursion {

/**
 *@param n any non-negative value you want to take the sqrt of
 *@return the approximate sqrt of n within a tolerance of 0.001%
 */
 public static double sqrt(double n){
   return guessSqrt(n, 1);
 }

 private static double guessSqrt(double n, double guess) {
   double actualN = guess*guess;
   double percentError = Math.abs((actualN-n)/n);
   if (percentError > 0.00001) {
     double newGuess = ((n / guess) + guess) / 2;
     return guessSqrt(n, newGuess);
   }
   return guess;
 }

 public static void main(String[] args) {
   System.out.println(sqrt(100));
   System.out.println(sqrt(2));
   System.out.println(sqrt(81));
 }
}
