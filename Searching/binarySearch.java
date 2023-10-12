public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { -12, -6, -1, 3, 12, 23, 45, 76, 89, 99 };
        int target = -1;

        int ans = binary(arr, target);
        System.out.println(ans);
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = end - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
