
public class Smallest {

    public static int fun(int arr[], int n, int mini, int idx) {
        if (idx == n) {
            return mini;
        }
        if (arr[idx] < arr[mini]) {
            mini = idx;

        }
        mini = fun(arr, n, mini, idx + 1);

        return mini;

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 3, 4, 5};
        int n = arr.length;
        int res = fun(arr, n, 0, 0);
        System.out.println(res);

    }
}
