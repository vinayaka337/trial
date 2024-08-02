package myownjavaprogs;
import java.util.*;
public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n;
		System.out.println("n?");
		n = sc.nextInt();
		i=0;
		while(i<=n) {
			if(i%2==0)
		System.out.println(i);
			i++;
		}
	}

}
