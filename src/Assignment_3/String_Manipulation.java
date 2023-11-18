package Assignment_3;

import java.util.Scanner;

public class String_Manipulation {

	public static void main(String[] args) {
		
		Scanner ui= new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = ui.nextLine();
		
		String input2 = input.toUpperCase();//for UpperCase 
        System.out.println("The String: "+input+" in upper case is :"+input2);
	
	    System.out.println("The length of "+input+" is: "+input.length());//length of the string
	
	    input2 = input2.replace('O', 'Z');//to replace it
	    System.out.println("Replacing O with Z: "+input2);
	
	    System.out.println("The last character of string "+input2+" is: "+input2.charAt(input2.length()-1));//to print last character.index start from 0 so length()-1
	    
	    String input3= " Test";
	    System.out.println("String concetination: "+input.concat(input3));//put 2 string together after concetination it return a string also
	    
	}

}
