
// can we write static variable in static methods in java ?
// NO 
class IQ1
{
    static int m1()
    {
        int x = 10;  // LOCAL VAR - here we cannot apply static.use only final . 
        
        return x;
    }
    public static void main(String [] args)
    {
        System.out.println(IQ1.m1());
    }
}
