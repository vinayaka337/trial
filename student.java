import java.util.*;

class student {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int rollno, m1, m2, m3, tot;
        double avg;
        String grade = "happy";
        System.out.println("roll no of the student");
        rollno = sc.nextInt();

        System.out.println("marks in the first sub");
        m1 = sc.nextInt();

        System.out.println("marks in the second sub");
        m2 = sc.nextInt();

        System.out.println("marks in the third sub");
        m3 = sc.nextInt();

        tot = m1 + m2 + m3;
        avg = (tot) / 3.0;
        grade = "fail";
        if (m1 > 35) {
            if (m2 > 35) {
                if (m3 > 35) {
                    if (avg > 35) {
                        grade = "third class";
                    }
                    if (avg >= 50) {
                        grade = "second class";
                    }
                    if (avg >= 60) {
                        grade = "first class";
                    }
                }
            }
        }

        System.out.println("roll no = " + rollno);
        System.out.println("total = " + tot);
        System.out.println("average = " + avg);
        System.out.println("class = " + grade);
    }
}