import java.util.Scanner;
public class UcapanTerimakasih_19 {
    // Fungsi dari PenerimaUcapan 
    public static String PenerimaUcapan(){
        // Deklarasi Scan
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        // deklarasi variabel untuk nilai inputan
        String namaOrang = sc.nextLine();
        // mengembalikan nilai inputan, yaitu nama orang
        //jika dihapus program error, karena fungsi bukan void
        return namaOrang;
    }
    // Fungsi UcapanTerimakasih
    public static void UcapanTerimakasih(){
        // bukan merupakan argument, hanya pemanggilan fungsi "PenerimaUcapan"
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    
    public static void main(String[] args){
        UcapanTerimakasih();
    }
}
