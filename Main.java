import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        int u = 2;

        System.out.print("Birinci Kenar: ");
        a = input.nextInt();
        System.out.print("İkinci Kenar: ");
        b = input.nextInt();
        System.out.print("Üçüncü Kenar: ");
        c = input.nextInt();

        double cevre = (a+b+c)/u;
        double alan = Math.sqrt((cevre)* (cevre-a)*(cevre-b)*(cevre-c));
        System.out.println("Alanı = "+alan);
    }
}
