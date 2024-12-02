import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menggabungkan prompt dan hasil dalam satu string
        System.out.print("Masukkan sebuah angka: 5");
        int angka = scanner.nextInt();

        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka yang kamu masukkan adalah " + hasil + ".");

        scanner.close();
    }
}
