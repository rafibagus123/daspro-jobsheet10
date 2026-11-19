import java.util.Scanner;

public class SIAKAD20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa, jumlahMataKuliah;

        System.out.println("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        System.out.println("Masukkan jumlah mata kuliah: ");
        jumlahMataKuliah = sc.nextInt();

        int [][] inputSendiri = new int[jumlahMahasiswa][jumlahMataKuliah];

        for (int i = 0; i < inputSendiri.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < inputSendiri[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                inputSendiri[i][j] = sc.nextInt();
                totalPerSiswa += inputSendiri[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa / inputSendiri[i].length);
        }

        System.out.println("\n========================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < inputSendiri[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < inputSendiri.length; i++) {
                totalPerMatkul += inputSendiri[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / inputSendiri.length);
        }
    }
}