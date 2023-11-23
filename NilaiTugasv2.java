import java.util.Scanner;

public class NilaiTugasv2 {
    static int JumlahMhs;
    static int JumlahMinggu;

    static int[][] nilaiMhs;
    static String[] namaMhs;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        JumlahMhs = scanner.nextInt();

        System.out.print("Masukkan jumlah minggu: ");
        JumlahMinggu = scanner.nextInt();

        nilaiMhs = new int[JumlahMhs][JumlahMinggu];
        namaMhs = new String[JumlahMhs];

        inputDataNilai(scanner);
        tampilkannilaiMhs();
        int hariTertinggi = cariHariTertinggi();
        System.out.println("Nilai tertinggi terdapat pada hari ke-" + hariTertinggi);
        tampilkanMahasiswaTertinggi();
    }

    static void inputDataNilai(Scanner scanner) {
        for (int i = 0; i < JumlahMhs; i++) {
            System.out.print("\nMasukkan nama Mahasiswa " + (i + 1) + ": ");
            namaMhs[i] = scanner.next();
            System.out.println("Masukkan nilai mahasiswa: ");
            for (int j = 0; j < JumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMhs[i][j] = scanner.nextInt();
            }

            scanner.nextLine();
        }
    }



    static void tampilkannilaiMhs() {
        System.out.println("Tabel Nilai Mahasiswa:");
        System.out.printf("%-15s", "Nama Mahasiswa");

        for (int j = 0; j < JumlahMinggu; j++) {
            System.out.printf("%-10s", "Minggu " + (j + 1));
        }
        System.out.println();

        for (int i = 0; i < JumlahMhs; i++) {
            System.out.printf("%-15s", namaMhs[i]);
            for (int j = 0; j < JumlahMinggu; j++) {
                System.out.printf("%-10d", nilaiMhs[i][j]);
            }
            System.out.println();
        }
    }

    static int cariHariTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < JumlahMinggu; j++) {
            int totalNilaiHari = 0;

            for (int i = 0; i < JumlahMhs; i++) {
                totalNilaiHari += nilaiMhs[i][j];
            }

            if (totalNilaiHari > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHari;
                hariTertinggi = j + 1;
            }
        }

        return hariTertinggi;
    }

    static void tampilkanMahasiswaTertinggi() {
        int mahasiswaTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int i = 0; i < JumlahMhs; i++) {
            int totalnilaiMhs = 0;

            for (int j = 0; j < JumlahMinggu; j++) {
                totalnilaiMhs += nilaiMhs[i][j];
            }

            if (totalnilaiMhs > nilaiTertinggi) {
                nilaiTertinggi = totalnilaiMhs;
                mahasiswaTertinggi = i + 1;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + namaMhs[mahasiswaTertinggi - 1] +
                " dengan nilai " + nilaiTertinggi +
                " (Minggu ke-" + cariHariTertinggi() + ")");
    }
}
