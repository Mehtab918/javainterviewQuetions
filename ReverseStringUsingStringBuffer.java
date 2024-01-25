/*

how to remove junk or special character from a string ?
---------------------------------------------------------
using regex  , and replacement 
regex = [a-zA-Z0-9]
using replaceAll() of string class.

*/ 


public class RemoveJunkFromString
{

public static void main(String [] args)

{

String str = "@#$@##@$!$Java#!$#!@#!Program$!#!#Learning";

// we have replaceAll(String regex , String replacement)
str = str.replaceAll("[^a-zA-Z0-9]" , "");

System.out.println(str);
}
}