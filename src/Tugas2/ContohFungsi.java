package Tugas2;

public class ContohFungsi {

    //method untuk menambahkan dua bilangan bulat
    public static int tambah(int a, int b) {
        return a + b;
    }

    //method untuk mengalikan dua bilangan bulat
    public static int kali(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        //memanggil method tambah dengan argumen 5 dan 3
        int hasilPenjumlahan = tambah(5,3);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        //memanggil method kali dengan argumen 4 dan 6
        int hasilPerkalian = kali(4,6);
        System.out.println("Hasil perkalian:" + hasilPerkalian);
    }
}
