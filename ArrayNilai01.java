import java.util.Scanner;

public class ArrayNilai01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai Akhir ke-" + i + " : ");
            nilaiAkhir[i] = input01.nextInt();

        }

        for (int i = 0; i < 10; i++) {
                System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
            }

    }
}