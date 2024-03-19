public class mahasiswaArray {
    public String namaMahasiwa;
    public int nimMahasiswa;
    public String jenisKelamin;
    public double ipkMahasiswa;

    public mahasiswaArray(String nama, int nim, String jenisKelamin, double ipk){
        namaMahasiwa = nama ;
        nimMahasiswa = nim ;
        this.jenisKelamin= jenisKelamin;
        ipkMahasiswa = ipk;
    }

    public String inputNama(){
        return namaMahasiwa;
    }
     public int inputNim(){
        return nimMahasiswa;
    }
     public String inputJenisKelamin(){
        return jenisKelamin;
    }
     public double inputIpk(){
        return ipkMahasiswa;
    }

}