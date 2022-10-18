package PRAK201_2110817310012_AqilRahmatullah;
/**
 *
 * @author INSPIRON N4050
 */
//Membuat Class
public class Mangga {
    String namaMangga;
    double berat;
    int harga;
    int jumlahBeli;
    double totalBerat;
    int totalHarga;
    
    
    Mangga(String nama, double beratMangga, int jumlahBeliMangga, int hargaMangga){
        this.namaMangga = nama;
        this.berat = beratMangga;
        this.harga = hargaMangga;
        this.jumlahBeli = jumlahBeliMangga;
        this.totalBerat = beratMangga * jumlahBeliMangga;
        this.totalHarga = hargaMangga * jumlahBeliMangga;
        
        System.out.println("Nama Mangga : " + this.namaMangga);
        System.out.println("Berat : " + this.berat + " kg");
        System.out.println("Jumlah Beli : " + this.jumlahBeli);
        System.out.println("Total Berat : " + this.totalBerat + " kg");
        System.out.println("Total Harga : Rp. " + this.totalHarga);
        System.out.println("");
    }

}