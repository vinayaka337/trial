import java.util.*;

class name {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int m1, m2, tot;
        double avg;
        System.out.println("marks in first sub");
        m1 = sc.nextInt();
        System.out.println("name of the studdent");
        name = sc.nextLine();
        sc.next();
        System.out.println("marks in the second sub");
        m2 = sc.nextInt();
        tot = m1 + m2;
        System.out.println("total = " + tot);
    }
}