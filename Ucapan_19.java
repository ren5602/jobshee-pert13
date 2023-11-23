import java.util.Scanner;
public class Ucapan_19 {
    // Fungsi PenerimaUcapan
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        // menutup scan input
        sc.close();
        // mengembalikan nilai input, jika dihapus program akan error
        // program menjadi error dikarenakan fungsi bukan void
        return namaOrang;
    }
    public static void main(String[] args){
        // bukan argument, hanya pemanggilan fungsi "PenerimaUcapan" saja
        String nama = PenerimaUcapan();
        System.out.println("thank you "+nama+"\nMay The Force Be With You");
    }
}
