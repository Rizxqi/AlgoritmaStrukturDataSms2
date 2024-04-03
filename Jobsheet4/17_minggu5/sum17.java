public class sum17 {
    public int elemen;
    public double keuntungan[][];
    public double total[];
    
    sum17(int jmlPerusahaan , int numMonths){
        this.elemen = jmlPerusahaan ;
        this.keuntungan = new double[jmlPerusahaan][numMonths];
        this.total = new double[jmlPerusahaan];
    }
    double totalBF17(double arr[]){
        double total = 0 ;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total; 
    }
    
    double totalDC17(double arr [], int l, int r){
        if (l==r) 
            return arr[l];
        else if (l<r){
         int mid = (l+r)/2;
         double lsum=totalDC17(arr, l, mid-1);
         double rsum=totalDC17(arr, mid+1, r);
         return lsum+rsum+arr[mid];
        }

    double totalKeuntunganBF() {
        for (int i = 0; i < total.length; i++) {
            total[i] = totalBF17(keuntungan[i]);
        }
        return totalBF17(total);
    }

    double totalKeuntunganDC(int l, int r) {
        for (int i = 0; i < total.length; i++) {
            total[i] = totalDC17(keuntungan[i], l, r);
        }
        return totalDC17(total, l, r);
    }
    
}


//     return 0;
// }
// public int elemen;
// public double keuntungan[][];
// public double total;

// sum17(int elemen){
//     this.elemen = elemen ;
//     this.keuntungan = new double[elemen];
//     this.total = 0;
// }