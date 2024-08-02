package myownjavaprogs;

import java.util.*;

class Trial {
	public static void main(String... args) {
		int num=2, divi;
		for(num=2;num<100;num++)
			{{  int flag=1;
			for(divi=2;divi<num;divi++)
				 if((num%divi)==0)
					 flag=0;
			
			if (flag==1) 
				System.out.println(num);
			}
		
		}
	}}
