import java.util.Scanner;
public class KubusNo19 {
    // deklarasi scanner global
    static Scanner sc = new Scanner(System.in);
    // fungsi hitung volume
    static int hitungVolumeKubus(int s){
        int volume = s * s * s;
        return volume;
    }
    // fungsi hitung luas permukaan
    static int luasPermukaan(int s){
        int permukaan = 6*s*s;
        return permukaan;
    }
    public static void main(String[] args) {
        int sisi, vol, luas;
        System.out.print("Masukkan panjang sisi kubus : ");
        sisi = sc.nextInt();

        vol = hitungVolumeKubus(sisi);
        System.out.println("Volume kubus = "+vol);

        luas = luasPermukaan(sisi);
        System.out.println("Luas permukaan kubus = "+luas);
    }
}
