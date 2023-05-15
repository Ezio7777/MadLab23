/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("enter value of n");
	    int n = myObj.nextInt(); 
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	           System.out.print(" ") ;
	        }
	        for(int j=0;j<n-i;j++){
		        System.out.print("* ");
	        }
	        System.out.println("");
	    }
	}
}
