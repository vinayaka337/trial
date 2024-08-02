package myownjavaprogs;

import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		int i,j,k;
		for (i=1;i<=5;i++)
		{  System.out.println();
		//for printing spaces before numbers
		    for(k=1;k<=5-i;k++)
		    	System.out.print(" ");
		    //for printing numbers 
			for (j=1;j<=i;j++)
				System.out.print(j);
			
		}
	}
}
