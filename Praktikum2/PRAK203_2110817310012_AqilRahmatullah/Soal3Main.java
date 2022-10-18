package PRAK203_2110817310012_AqilRahmatullah;
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Pada baris ini kurang titik koma maka terjadilah error
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //Pada baris ini harusnya ada pendeklarasian umur yang bernilai 17
        p1.umur = 17;
        //Pada baris ini kita hapus kata "Pegawai" agar sesuai output yang diinginkan
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama : " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Pada baris ini ditambahkan kata " tahun" agar kalimat yang dicetak sesuai dengan soal
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur +" tahun");
    }
 }

