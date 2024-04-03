public class akar17 {
        public int number;
        public int squareRoot;

        Numbers(int number) {
            this.number = number;
        }
        
        Numbers(){
        }
    
        public int squareRootBF(int n) {
            int root = 0;
            int i = 1;
            while (i <= n) {
                root = i;
                if (root == n / root) {
                    squareRoot = root;
                    break;
                }
                i++;
            }

            if (squareRoot == 0) {
                squareRoot = n/root;
            }
            return squareRoot;
        }
        
        public static int squareRootDC(int n) {
            int low = 1;
            int high = n;
            int mid = 0;
            while (low <= high) {
                mid = low + (high - low) / 2;
                int square = mid * mid;
                if (square == n) { // Check if the square of mid is equal to n
                    return mid;
                } else if (square < n) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return mid; // Return the closest integer to the square root
        }
        

        // public int squareRootDC(int n) {
        //     int mid = 0 ;
        //     return squareRootDC(n, low, high);
        // }
    

        // private int squareRootDC(int n, int low, int high) {
        //     int mid = 0;
        //     if (low <= high) {
        //         mid = low + (high - low) / 2;
        //     }
        //     if (n == mid * mid) {
        //         return mid;
        //     }
        //     if (n > mid * mid) {
        //         return squareRootDC(n, mid + 1, high);
        //     }
        //     if (n < mid * mid) {
        //         return squareRootDC(n, low, mid - 1);
        //     }
        //     return mid;
        //}
    }