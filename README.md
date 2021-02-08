# inrCommaDelimited
JAVA PACKAGE TO PRODUCE - COMMA DELIMITED INR(The Indian rupee) CURRENCY
MAXIMUM SUPPORTED NUMBER - (2^63-1 = 9223372036854775807)



	import java.io.*;
	import java.util.Scanner;
	import java.lang.*;

	import inrCommaDelimited.*;    //importing package

	class Demo{
	
		public static void main(String args[]){

			Scanner s = new Scanner(System.in);		

			System.out.println("Enter Amount");   // maximum supported number = 9223372036854775807

			long inr = s.nextLong();

			InrCommaDelimited obj =  new InrCommaDelimited();
			System.out.println(obj.getInrCommaDelimited(inr));			//public String getInrCommaDelimited(Long value)
		}
	}


OUTPUT:

		Enter Amount

		9223372036854775807

		Rs.92,23,37,20,36,85,47,75,807.00  //OUTPUT


		Enter Amount

		000088231872817

	Rs.88,23,18,72,817.00 //OUTPUT

