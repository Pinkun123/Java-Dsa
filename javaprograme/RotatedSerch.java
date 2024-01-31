public class RotatedSerch {

    public static int serch(int arr[], int traget, int si, int ei) {
        // base case

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // target found
        if (arr[mid] == traget) {
            return mid;
        }

        // case 1: mid one l1 line

        if (arr[si] <= arr[mid]) {
            // case a: left part

            if (arr[si] <= traget && traget <= arr[mid]) {
                return serch(arr, traget, si, mid - 1);

            }

            // case b: right part

            else {

                return serch(arr, traget, mid + 1, ei);
            }
        }

        /// case 2: mid on l2 line

        else {
            // case c: right part
            if (arr[mid] <= traget && traget <= arr[ei]) {
                return serch(arr, traget, mid + 1, ei);

            }

            // case d: left part

            else {
                return serch(arr, traget, si, mid - 1);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        int traget = 0;

        int tdx = serch(arr, traget, 0, arr.length);
        System.out.println(tdx);
    }

}
