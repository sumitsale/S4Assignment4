import java.util.Scanner;

class S4Assignment4
{
   public static void main(String args[])
   {
		Scanner in = new Scanner(System.in);

	    System.out.println("Enter a string");
	    String str = in.nextLine();
		
		for (int i =str.length()-1; i >= 0; i--) {            
               System.out.print(str.charAt(i));    
        }
   }
}