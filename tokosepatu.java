import java.util.Scanner;

public class tokosepatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merk, kategori;
        int ukuran, total_harga;

        System.out.print("Masukkan Merk (Converse, Sketcher, Nike): ");
        merk = sc.nextLine().toLowerCase();

        switch (merk) {
            case "converse":
                System.out.print("Masukkan Kategori (Slip On/High Top) : ");
                kategori = sc.nextLine().toLowerCase();
                switch (kategori) {
                    case "slip on":
                        System.out.print("Masukkan ukuran (36-40) : ");
                        ukuran = sc.nextInt();
                        if (ukuran < 36 || ukuran > 40) {
                            System.out.println("Maaf ukuran tidak tersedia");
                        } else {
                            System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 800.000", merk,kategori,ukuran));
                        }
                        break;
                    case "high top":
                        System.out.print("Masukkan ukuran (40-44) : ");
                        ukuran = sc.nextInt();
                        if (ukuran < 40 || ukuran > 44) {
                            System.out.println("Maaf ukuran tidak tersedia");
                        } else {
                            System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 1.200.000", merk,kategori,ukuran));
                        }
                        break;
                    default:
                        System.out.println("Kategori tidak tersedia");
                        break;
                }
                break;
            case "sketcher":
                System.out.print("Masukkan Kategori (Woman/Man) : ");
                kategori = sc.nextLine().toLowerCase();
                switch (kategori) {
                    case "woman":
                        System.out.print("Masukkan ukuran (36-41) : ");
                        ukuran = sc.nextInt();
                        if (ukuran < 36 || ukuran > 41) {
                            System.out.println("Maaf ukuran tidak tersedia");
                        } else {
                            System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 1.000.000", merk,kategori,ukuran));
                        }
                        break;
                    case "man":
                        System.out.print("Masukkan ukuran (41-44) : ");
                        ukuran = sc.nextInt();
                        if (ukuran < 41 || ukuran > 44) {
                            System.out.println("Maaf ukuran tidak tersedia");
                        } else {
                            System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 1.800.000", merk,kategori,ukuran));
                        }
                        break;
                    default:
                        System.out.println("Kategori tidak tersedia");
                        break;
                }
                break;
            case "nike":
                System.out.print("Masukkan Kategori (kids/adult) : ");
                kategori = sc.nextLine().toLowerCase();
                switch (kategori) {
                    case "kids":
                        System.out.print("Masukkan ukuran (36-40) : ");
                        ukuran = sc.nextInt();
                        if (ukuran < 36 || ukuran > 40) {
                            System.out.println("Maaf ukuran tidak tersedia");
                        } else {
                            System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 750.000", merk,kategori,ukuran));
                        }
                        break;
                    case "adult":
                        System.out.print("Masukkan ukuran (40-44) : ");
                        ukuran = sc.nextInt();
                        if (ukuran < 40 || ukuran > 44) {
                            System.out.println("Maaf ukuran tidak tersedia");
                        } else {
                            System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 1.500.000", merk,kategori,ukuran));
                        }
                        break;
                    default:
                        System.out.println("Kategori tidak tersedia");
                        break;
                }
                break;
            default:
                System.out.println("Merk tidak tersedia");
                break;
        }
    }
}
