import java.text.NumberFormat;

// DebugSix1.java
// Start with a penny
// double it every day
//   how much do you have in a 30-day month?
public class DebugSix1
{
   public static void main(String []args)
   {
      final int DAYS = 31;
      double money = 0.01;
      int day = 2;
      while(day < DAYS)
      {
         money *= 2;
         String moneyOutput = NumberFormat.getCurrencyInstance().format(money);
         System.out.println("After day " + day + " you have " + moneyOutput);
         day ++;
      }
   }
}