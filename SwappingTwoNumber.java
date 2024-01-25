public class SwappingTwoNumberWithThirdVar
{
    public static void main(String [] args)
    {
      int a = 123;
      
      int b = 456; 
      
      int temp = 0;
     
      System.out.println("Before swapping :");
      System.out.println("a value :" +  a);
      System.out.println("b value :" + b);
      System.out.println();
      
      temp = a;
      a= b;
      b = temp;
          
      System.out.println("After swapping :");
      System.out.println("a value :" +  a);
      System.out.println("b value :" + b);
     
      
    }
}