import java.util.*;
import java.io.*;

public class JavaUdemyProject1 {

   public static void main(String args[]) {
   
   double a = 20.00;
   double b = 80.00;
   double result = (a + b) * 100;
   double c = result % 40;
   boolean d;
   if (c == 0) {
      d = true;
   }
   else {
      d = false;
   }
   System.out.println(d);
   if (d = false) {
   System.out.println("Got some remainder");
   }
   }
}
   