package praktikum.sesi3;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Kalkulator Sederhana ===");
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            double hasil = 0;
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error! Pembagian dengan nol.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid!");
                    return;
            }

            System.out.println("Hasil: " + hasil);
        }
    }
}
