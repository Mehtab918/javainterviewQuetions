public class ReverseString
{
    public static void main(String [] argss)
    {
        String str = "Learning";
        //  we dont have reverse method in String class 
        // so we will  convert it using for loop.
        
        // step 1 - get the length of the string
        
        String rev = "";
        int length = str.length();  // get here length   8  (8-1) = 7 
        //step 2 
        for(int i = length - 1; i >=0 ; i--)
        {
                rev = rev + str.charAt(i);
        }
        
        System.out.println(rev);
        
        
    }
}