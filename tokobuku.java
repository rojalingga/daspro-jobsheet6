import java.util.Scanner;
public class tokobuku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hari, jenis_buku;
        int jumlah_buku, total_harga, int_total_bayar;
        int harga = 25000; 
        double double_total_harga, total_bayar, total_diskon, diskon = 0;

        System.out.print("Masukkan Hari : ");
        hari = sc.nextLine().toLowerCase();
        System.out.print("Masukkan jenis buku : ");
        jenis_buku = sc.nextLine();
        System.out.print("Masukkan jumlah_buku : ");
        jumlah_buku = sc.nextInt();

        if (hari.equals("rabu")) {
            if (jenis_buku.equals("kamus") || jenis_buku.equals("novel")) {
                if (jenis_buku.equals("kamus")) {
                    if (jumlah_buku > 2) {
                        diskon = 0.10 + 0.02;
                    } else {
                        diskon = 0.10;
                    }
                } else {
                    if (jumlah_buku > 3) {
                        diskon = 0.07 + 0.02;
                    } else {
                        diskon = 0.07 + 0.01;
                    }
                }
            } else if (jumlah_buku > 3){
                diskon = 0.05;
            }
        }

        total_harga = harga * jumlah_buku;
        double_total_harga = (double) total_harga;
        total_diskon = diskon * double_total_harga;
        total_bayar = double_total_harga - total_diskon;
        int_total_bayar = (int) total_bayar;

        System.out.println("Jenis Buku : " +jenis_buku);
        System.out.println("Jumlah Buku : " +jumlah_buku);
        System.out.println("Harga per Buku : " +harga);
        System.out.println("Total Bayar : " +int_total_bayar);

    }
}