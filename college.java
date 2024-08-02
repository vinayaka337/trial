import java.util.*;

class college {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int SNo, RNo, Marks;
        String Name;
        System.out.println("SNo?");
        SNo = sc.nextInt();
        System.out.println("RNo?");
        RNo = sc.nextInt();
        System.out.println("Name?");
        Name = sc.nextLine();
        sc.nextLine();
        sc.next();
        System.out.println("Marks?");
        Marks = sc.nextInt();
        System.out.println("sno = " + SNo);
        System.out.println("rno = " + RNo);
        System.out.println("name = " + Name);
        System.out.println("marks = " + Marks);
    }
}