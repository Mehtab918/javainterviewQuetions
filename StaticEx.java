public class StaticEx
{
    String name;
    int roll;
    static String college ="Oxford";
    
    public void tell()
    {
        System.out.println("student name :" + name); 
        System.out.println("student roll :" +  roll);
        System.out.println("student College :" +  college);
       
    }
    public static void main(String [] args)
    {
    StaticEx obj = new StaticEx();
    obj.name= "Mehtab";
    obj.roll = 11;
    StaticEx.college;
      System.out.println();
    StaticEx obj1 = new StaticEx();
    obj1.name= "kapil";
    obj1.roll = 12;
    StaticEx.college;
    obj.tell();
     System.out.println();
   obj1.tell();
    
        
    }
}
   