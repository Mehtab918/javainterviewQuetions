public class ReverseAnInteger
{
    public static void main(String [] args)
    {
	// procedure 1 :
        int x = 12345;
        
       // step 1  , create a variable rev 
       int rev = 0;
       
       // divide = 12345 /10   =  5 ,
       
       while(x!=0)
       {
           rev =  rev * 10 + x % 10;  // 5
           
           x = x/10;   // 1234
       }
       
       System.out.println(rev);

       
        System.out.println("-----------");
        
        
        //String.valueOf(string variable)  , reverse is used to reverse the string . we are using StringBuilder class reverse method. We dont have reverse method in 
        // String class because String is an Imutable Object in  java . if we try to do , we will get error .
      
	// reverse an String  
        String name = "Md Mehtab Khan";
        
        StringBuffer stbr2 = new StringBuffer(String.valueOf(name)).reverse();
        
        System.out.println(stbr2);
        
        //String valueOf(long l) 
        long num = 248657332;
        
        StringBuffer stbr = new StringBuffer(String.valueOf(num)).reverse();
        System.out.println(stbr);
       
       // String valueOf(boolean b) 
        boolean b = true;
        
        StringBuffer stbr1 = new StringBuffer(String.valueOf(b)).reverse();
        System.out.println(stbr1);
        
        
        String name = "Md Mehtab Khan";
        
        StringBuffer stbr2 = new StringBuffer(String.valueOf(name)).reverse();
        
        System.out.println(stbr2);
     
     
        
    }
}