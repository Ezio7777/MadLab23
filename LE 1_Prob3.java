/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("enter value of n");
	    int n = myObj.nextInt(); 
	    for(int i=1;i<=10;i++)
	    {
	        System.out.println(n + "x" + i +"=" + n*i);
	    }
	}
}