import java.util.Scanner;

public class Pemilihan2Percobaan220 {
    public static void main(String[] args) {
        int pilihanMenu, jml_beli;
        String member,met_bayar;
        double harga = 0, diskon = 0, totalBayar;
        Scanner sc = new Scanner(System.in);

        System.out.println("================ MENU KAFE JTI ================");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Roti");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah beli : ");
        jml_beli = sc.nextInt();
        sc.nextLine();

        System.out.print("Apakah punya member (y/n) ? ");
        member = sc.nextLine();

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.1; 
            System.out.println("Besar diskon = 10%");
            if (pilihanMenu == 1) {
                harga = 12000;
                System.out.println("Harga Kopi = " +harga);
            } else if (pilihanMenu == 2) {
                harga = 7000;
                System.out.println("Harga Teh = " +harga);
            } else if (pilihanMenu == 3) {
                harga = 20000;
                System.out.println("Harga Roti = " +harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihanMenu == 1) {
                harga = 12000;
                System.out.println("Harga Kopi = " +harga);
            } else if (pilihanMenu == 2) {
                harga = 7000;
                System.out.println("Harga Teh = " +harga);
            } else if (pilihanMenu == 3) {
                harga = 20000;
                System.out.println("Harga Roti = " +harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
        } else {
            System.out.println("Member tidak valid");
        }

        totalBayar = harga - (harga * diskon); 

        System.out.print("Metode Pembayaran (Tunai/QRIS) : ");
        met_bayar = sc.nextLine().toLowerCase();

        if (met_bayar.equals("qris")) {
            totalBayar -= 1000;       
        }
        
        System.out.println("Total Bayar setelah diskon = " + totalBayar);
    }
}

