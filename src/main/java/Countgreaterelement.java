public class Countgreaterelement {
    public static void main(String[] args) {
        int[] arr={2,7,7,1};
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(max==arr[i]){
                count++;
            }
        }
        int result= arr.length-count;
        System.out.println(result);
    }
}
