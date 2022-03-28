import java.util.Scanner;


public class ciftSayilar {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner dongu = new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Giriniz :");
            n = dongu.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                total += n;

            }


        } while (n % 2 == 0);
        System.out.println(total);

    }
}
