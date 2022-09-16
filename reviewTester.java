import java.util.Scanner;
public class reviewTester {
    public static void main(String[] args) {
        review kg = new review("Ken Goettsche", "Olive Garden", 1);
        review cn = new review("Charles Nichols", "Vini's", 5);
        review sd = new review("Shannon Denna", "Panera", 3);
        review jm = new review("Jerry Moon", "Kura", 5);
        System.out.println(kg);
        System.out.println(cn);
        System.out.println(sd);
        System.out.println(jm);
    }
}