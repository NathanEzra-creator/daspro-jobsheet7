import java.util.Scanner;

public class Bioskop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket = 0;
        double totalHarga = 0;
        int hargaPerTiket = 50000;
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            int jumlahTiket = sc.nextInt();
            
            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan angka positif.");
                continue; 
            }
            
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            
            double hargaBayar = (jumlahTiket * hargaPerTiket) - (jumlahTiket * hargaPerTiket * diskon);
            totalTiket += jumlahTiket;
            totalHarga += hargaBayar;
        }
        
        System.out.println("Total tiket terjual hari ini: " + totalTiket);
        System.out.println("Total pendapatan hari ini: Rp " + totalHarga);
    }
}
