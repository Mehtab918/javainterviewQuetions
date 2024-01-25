public class FindQuotientRemainder
{
    public static void main(String [] args)
    {
        
        int dividend = 120;
        
        int divisor = 7;
        
        int quotient = dividend / divisor ;
        
        System.out.println("quotient :" +  quotient);
        
        int remainder = dividend - (divisor * quotient);
        
        System.out.println("remainder:" + remainder);
    }
}