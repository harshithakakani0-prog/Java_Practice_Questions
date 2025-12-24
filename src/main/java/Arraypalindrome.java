public class Arraypalindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,2};
        int left=0;
        int right=arr.length-1;
        boolean ispalindrom=true;
        while(left<=right){
            if(arr[left]!=arr[right]){
                ispalindrom=false;
                break;
            }
            left++;
            right--;
        }
        if(ispalindrom){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
