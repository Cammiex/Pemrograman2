package PRAK203_2110817310012_AqilRahmatullah;
//Pada baris ini terdapat kesalahan penulisan nama kelas yang harusnya Pegawai namun yang tertulis adalah Employee
//public class Employee {
public class Pegawai {
    public String nama;
    //Pada baris ini terdapat salah penulisan tipe data, karena tipe data char ini hanya untuk satu karakter saja dan tidak sesuai dengan nilai variabel yang dibutuhkan.
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
    return nama;
    }
    public String getAsal() {
    return asal;
    }
    //Pada baris ini terjadi error karena tidak adanya pendeklarasian variabel j pada baris baris sebelumnya
    //public void setJabatan() {
    public void setJabatan(String j) {
    this.jabatan = j;
    }
}

