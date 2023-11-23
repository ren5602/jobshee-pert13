public class Terimakasih_19v2 {
    // fungsi UcapanTerimaKasih 
    public static void UcapanTerimaKasih(){
        // isi dari fungsi UcapanTerimaKasih
        System.out.println("Thank you being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything");
    }
    // fungsi UcapanTambahan
    public static void UcapanTambahan(String ucapan){ // "String ucapan" merupakan parameter
        // isi dari fungsi UcapanTambahan
        System.out.println(ucapan);
    }
    public static void main(String[] args){
        // pemanggilan fungsi UcapanTerimakasih
        UcapanTerimaKasih();
        // Argument, variabel tambahan untuk menjalankan fungsi UcapanTambahan
        String ucapan = "Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
        // Pemanggilan fungsi UcapanTambahan
        UcapanTambahan(ucapan);
    }
}