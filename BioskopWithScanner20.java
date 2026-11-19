import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {

            System.out.println("\n====== MENU ======");
            System.out.println("1\tInput data penonton");
            System.out.println("2\tTampilkan daftar penonton");
            System.out.println("3\tExit");
            System.out.print("\nPilih: ");
            int menu = sc.nextInt();
            sc.nextLine();
            Thread.sleep(500);
    
            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("\nMasukkan nama: ");
                        nama = sc.nextLine();
                        do {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();
                            Thread.sleep(500);
                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi sudah terisi, silahkan pilih lagi");
                            }else if (baris < 1 || baris > 4) {
                                System.out.println("Baris tidak valid, silahkan pilih lagi");
                            } else if (kolom < 1 || kolom > 2) {
                                System.out.println("Kolom tidak valid, silahkan pilih lagi");
                            }
                        } while (penonton[baris - 1][kolom - 1] != null || baris < 1 || baris > 4 || kolom < 1 || kolom > 2);
                        Thread.sleep(500);
                        System.out.println("Kursi sudah dipesan");

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
                            if (penonton[i][j] == null) {
                                System.out.print(" ***");
                            } else {
                                System.out.print(" "+penonton[i][j]);
                            }
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