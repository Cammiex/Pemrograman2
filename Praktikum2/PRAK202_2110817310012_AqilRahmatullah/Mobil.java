package PRAK202_2110817310012_AqilRahmatullah;
import java.text.DecimalFormat;
class Mobil {
    String merek, tahun_keluaran, pemilik;
    int kapasitas, harga;
    
    DecimalFormat formatHarga = new DecimalFormat("###,###,###");
    DecimalFormat formatPajak = new DecimalFormat("#,###,###");
    
    public void info(){
        System.out.println("Merek Mobil : " + merek );
        System.out.println("Harga : Rp. " + formatHarga.format(this.harga));
        System.out.println("Tahun keluaran : " + tahun_keluaran);
        System.out.println("Kapasitas : " + kapasitas + "cc");
    }

    public void setPemilik(String pemilik){
        this.pemilik = pemilik;
    }

    String getPemilik(){
        return this.pemilik;
    }

    String getPajak(){
        double pajak = harga * 0.02;
        return formatPajak.format(pajak);
    }
}
