package myownjavaprogs;

import java.util.*;

class Twinprimes {

	public static void main(String[] args) {
		int num = 2, divi,pp=1;
		for (num = 2; num < 100; num++) {
			int flag = 1;
			for (divi = 2; divi < num; divi++)
				if ((num % divi) == 0)
					flag = 0;

			if (flag == 1) {
				if (num-pp==2)
	                 System.out.println("twin primes: "+pp+" "+num);
				pp=num;
			}
		}

	}

}