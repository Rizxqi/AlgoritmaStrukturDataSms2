package minggu7;

public class PencariMhs {
    mahasiswa17 listMhs[] = new mahasiswa17[5];
    int idx;

    void tambah(mahasiswa17 m){
        if (idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;

        }else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for (mahasiswa17 m : listMhs) {
            if (m != null) {             
            m.tampil();
            System.out.println("-----------------");
            }
        }
    }

    public int FindSeqSearch (int cari ){
        int posisi = -1 ;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari ) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right ){
        int mid;
        if (right >= left) {
            mid =(left + right) / 2;
            if (cari == listMhs[mid].nim) {
                return mid;
            }else if (listMhs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);                
            }else{
                return FindBinarySearch(cari, mid + 1,right );
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos)
    {
        if (pos!=-1) {
            System.out.println("data : "+ x + "ditemukan pada indeks " + pos);
        } else{
            System.out.println("data " + x +" tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos )
    {
        if (pos!= -1){
            System.out.println("Nim\t : "+x);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Umur\t : " +listMhs[pos].umur);
            System.out.println("IPK\t : "+listMhs[pos].ipk);
        }else{
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }
}