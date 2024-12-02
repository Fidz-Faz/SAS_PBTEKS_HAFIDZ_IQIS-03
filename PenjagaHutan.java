import java.util.ArrayList;
import java.util.Scanner;

public class PenjagaHutan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> makananList = new ArrayList<>();

        System.out.println("Masukkan jumlah makanan yang dikumpulkan oleh hewan (masukkan angka negatif untuk berhenti):");

        while (true) {
            System.out.print("Jumlah makanan: 5");
            int jumlahMakanan = scanner.nextInt();

            if (jumlahMakanan < 0) {
                System.out.println("Program selesai. Berikut adalah rekap data:");
                break;
            }

            makananList.add(jumlahMakanan);

            if (jumlahMakanan % 2 == 0) {
                System.out.println("Jumlah makanan " + jumlahMakanan + " adalah genap. Makanan dapat dibagi rata.");
            } else {
                System.out.println("Jumlah makanan " + jumlahMakanan + " adalah ganjil. Cari satu makanan lagi agar bisa dibagi rata.");
            }
        }

        // Cetak semua data makanan yang telah dimasukkan
        System.out.println("Rekap data makanan: " + makananList);

        scanner.close();
    }
}
