import java.util.Scanner;

public class angkaterbesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3, max;

        System.out.print("Masukkan bilangan 1 : ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan 3 : ");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                max = bil1;
            } else {
                max = bil3;
            }
        } else {
            if (bil2 > bil3) {
                max = bil2;
            } else {
                max = bil3;
            }
        }

        System.out.println("Bilangan terbesar adalah : " +max);
    }
}
