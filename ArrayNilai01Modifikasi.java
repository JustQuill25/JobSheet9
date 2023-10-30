import java.util.Scanner;

public class ArrayNilai01Modifikasi {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        boolean[] statusKelulusan = new boolean[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = input01.nextInt();
            statusKelulusan[i] = false;
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                statusKelulusan[i] = true;
            }
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Mahasiswa ke-" + i + (statusKelulusan[i] ? " Lulus!" : " Tidak Lulus!"));
        }
    }
}
