public class SwappingTwoNumberWithoutThirdVar
{
    public static void main(String [] args)
    {
      int a = 123;
      
      int b = 456; 
      
      int c = a+b;
      
      System.out.println(c);
      
      a = c-a;
      b = c-a;

      System.out.println("a :" + a);
      System.out.println("b :" + b);
     
     
     
      
    }
}