import java.util.*;

class judge {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        boolean judge1;
        System.out.println("declaration of judge-1");
        judge1 = sc.nextBoolean();
        boolean judge2;
        System.out.println("declaratin of judge-2");
        judge2 = sc.nextBoolean();
        boolean judge3;
        System.out.println("declaration ofjudge-3");
        judge3 = sc.nextBoolean();
        String judgement = "looser";
        if ((judge1 && judge2 && !judge3) || (judge2 && judge3 && !judge1) || (judge3 && judge1 && !judge2)) {
            judgement = "runner";
        }
        if ((judge1) && (judge2) && (judge3)) {
            judgement = "winner";
        }
        System.out.println("final judgement = " + judgement);
    }
}