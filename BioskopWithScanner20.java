import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {

            System.out.println("====== MENU ======");
            System.out.println("1\tInput data penonton");
            System.out.println("2\tTampilkan daftar penonton");
            System.out.println("3\tExit");
            System.out.print("Pilih: ");
            int menu = sc.nextInt();
            sc.nextLine();
            Thread.sleep(500);
    
            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("\nMasukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        Thread.sleep(500);
                        System.out.println("\nKursi sudah dipesan");

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        pilihan = sc.nextLine();
    
                        if (pilihan.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Penonton baris ke "+(i+1)+":");
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(" "+penonton[i][j]);
                        }
                        Thread.sleep(500);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\nTerima Kasih!");
                    System.out.println();
                    return;
                default:
                    System.out.println("\nTidak terdefinisi (1-3)");
                    System.out.println();
                    break;
            }
        }
    }
}