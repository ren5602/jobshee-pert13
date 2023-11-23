import java.util.Scanner;
public class UcapanTerimakasih_19v2 {
    // Deklarasi Scanner global
    static Scanner sc = new Scanner(System.in);
    // Fungsi dari PenerimaUcapan 
    public static String PenerimaUcapan(){
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        // deklarasi variabel untuk nilai inputan
        String namaOrang = sc.nextLine();
        // mengembalikan nilai inputan, yaitu nama orang
        //jika dihapus program error, karena fungsi bukan void
        return namaOrang;
    }
    // Fungsi UcapanTerimakasih
    public static String UcapanTerimakasih(){
        // bukan merupakan argument, hanya pemanggilan fungsi "PenerimaUcapan"
        String nama = PenerimaUcapan();
        return nama;
    }
    // Fungsi UcapanTambahan
    public static void UcapanTambahan(String ucapan){
        System.out.println("masukkan ucapan tambahan: ");
        // input nilai dari ucapanTambahan
        String uTambahan = sc.nextLine();
        // isi dari fungsi UcapanTambahan
        System.out.println("Thank you "+ucapan+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything."+uTambahan);
    }
    public static void main(String[] args){
        // pemanggilan fungsi UcapanTambahan, didalam ucapantambahan memanggil fungsi UcapanTerimakasih()
        UcapanTambahan(UcapanTerimakasih());
    }
}
