public class Percobaan519 {
    // fungsi Tampil dengan parameter string dan int
    static void Tampil(String str, int... a){
        // isi dari fungsi Tampil
        System.out.println("String: "+str);
        System.out.println("Jumlah argumen/parameter: "+a.length);
        // perulangan
        for(int i: a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //pemanggilan fungsi tampil pertama
        //Argument, variabel tambahan untuk menjalankan fungsi Tampil, argument pertama String, ke dua 100, ke tiga 200
        Tampil("Daspro 2019", 100, 200);
        //pemanggilan fungsi tampil kedua
        Tampil("Teknologi Informasi", 1,2,3,4,5);
        // pemanggilan fungsi tampil ke tiga
        Tampil("Polinema");
    }
}
