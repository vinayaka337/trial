import java.util.*;

class nestedswitch {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("month?");
        String month = sc.nextLine();
        System.out.println("week?");
        int week = sc.nextInt();
        switch (month) {
            case ("jan"):
                switch (week) {
                    case (1):
                        System.out.println("water bill=2000");
                        break;
                    case (2):
                        System.out.println("water bill=1000");
                        break;
                    case (3):
                        System.out.println("water bill=1500");
                        break;
                    case (4):
                        System.out.println("water bill=2000");
                        break;
                }
            case ("feb"):
                switch (week) {
                    case (1):
                        System.out.println("water bill=2000");
                        break;
                    case (2):
                        System.out.println("water bill=1000");
                        break;
                    case (3):
                        System.out.println("water bill=1500");
                        break;
                    case (4):
                        System.out.println("water bill=2000");
                        break;
                }
        }
    }
}