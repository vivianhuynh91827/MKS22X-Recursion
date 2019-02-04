import java.util.*;

public class recursion {

 /*Recursively find the sqrt using Newton's approximation
  *tolerance is the allowed percent error the squared answer is away from n.
  *precondition: n is non-negative
  */
 public static double sqrt(double n, double tolerance){
   return guessSqrt(n, 1, tolerance);
 }

 private static double guessSqrt(double n, double guess, double tolerance) {
   double actualN = guess*guess;
   double percentError = Math.abs((actualN-n)/n);
   if (percentError > tolerance) {
     double newGuess = ((n / guess) + guess) / 2;
     return guessSqrt(n, newGuess, tolerance);
   }
   return guess;
 }

 //----------------------------------------------------------------------------

 /*Recursively find the n'th fibbonaci number in linear time
  *fib(0) = 0; fib(1) = 1; fib(5) = 5
  *precondition: n is non-negative
  */
 public static int fib(int n) {
   if (n == 0) {
     return 0;
   }
   if (n==1 || n==2) {
     return 1;
   }
   return fibH(n, 3, 1, 1);
 }

 private static int fibH(int n, int curN, int prev1, int prev2){
   if (curN == n) {
     return prev1 + prev2;
   }
   return fibH(n, curN+1, prev2, prev1+prev2);
 }

 //----------------------------------------------------------------------------

 public static ArrayList<Integer> makeAllSums(int n) {
   ArrayList<Integer> sums = new ArrayList<>();
   masH(sums, n, 0);
   return sums;
 }

 private static void masH(ArrayList<Integer> sums, int n, int sum) {
   if (n == 0) {
     sums.add(sum);
   } else {
     masH(sums, n-1, sum);
     masH(sums, n-1, sum + n);
   }
 }

 //----------------------------------------------------------------------------

 // public static void main(String[] args) {
 //   System.out.println(sqrt(100,0.0000001));
 //   System.out.println(sqrt(2,0.0000001));
 //   System.out.println(sqrt(81,0.0000001));
 //   System.out.println(fib(0));
 //   System.out.println(fib(1));
 //   System.out.println(fib(2));
 //   System.out.println(fib(3));
 //   System.out.println(fib(4));
 //   System.out.println(fib(5));
 //   System.out.println(fib(6));
 //   System.out.println(makeAllSums(2));
 //   System.out.println(makeAllSums(3));
 // }
}
