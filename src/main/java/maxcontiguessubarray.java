public class maxcontiguessubarray {
    public static void main(String[] args) {
        int[] arr={2, 1, 5, 1, 3, 2};
        int k=3;
        int left=0;
        int right=k;
        int sum=0;
        while (left<=right){
            sum=sum+arr[left]+arr[right];
            left++;
        }
    }
}
