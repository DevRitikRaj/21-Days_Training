
public class PeakElement {

    public static int  Search(int arr[]) {
       
        int left = 0, end = arr.length-1;
        while (left < end) {
          int  mid = left + (end - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                end = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[]={1};
        int res=Search(arr);
        System.out.println(res);

    }
}
