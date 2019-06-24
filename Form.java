import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
//port java.time.Localdate;
//import.java.util.*;
class Form{
	public static void main(String[] args){
		Scanner myobj=new Scanner(System.in);
		
			//localdate myobj = localdate.now();
			//System.out.println(myobj);
			
			System.out.println("enter your first name");
			String Fname =myobj.nextLine();
			System.out.println("enter your Last name");
			String Lname =myobj.nextLine();
			System.out.println("enter your Age");
			String age =myobj.nextLine();
			System.out.println("enter mobile number");
			String mnum =myobj.nextLine();
			System.out.println("welcome to my page " + Fname + " " + Lname + " " + age);
			System.out.println(mnum);
	}	
}