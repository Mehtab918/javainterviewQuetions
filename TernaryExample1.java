// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class TernaryExample1
{
    public static void main(String [] args)
    {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        
        int d = (a<b)?(a<c)?a:(b<c)?b:c;
   /*
   think like this - 
   x = (b)? c:d 
   d = (a<b) ? ((a<c)?a:(b<c)?b:c) // after question mark 1st part is here but second part : after condition is missing . 
   o.p -> error -   : expected 
   */
        System.out.println(d);  // compile time error saying : expected
    }
}