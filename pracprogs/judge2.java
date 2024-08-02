import java.util.*;

class judge2 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int j1, j2, j3, tot;
        System.out.println("j1");
        j1 = sc.nextInt();
        System.out.println("j2");
        j2 = sc.nextInt();
        System.out.println("j3");
        j3 = sc.nextInt();
        tot = j1 + j2 + j3;
        String judgement = "looser";
        if (tot > 1) {
            judgement = "runner";
        }
        if (tot > 2) {
            judgement = "winner";
        }
        System.out.println("final judgement = " + judgement);
    }
}