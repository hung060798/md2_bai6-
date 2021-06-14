import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t1 = new Triangle();

        System.out.println("nhap do dai canh tam giac");
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double c3 = sc.nextDouble();

        t1.setSide(c1, c2, c3 );
        System.out.println(t1);

        System.out.println("nhap mau sac");
        String color1 = sc.next();
        t1.setColor(color1);

        System.out.println(t1);

    }
}
