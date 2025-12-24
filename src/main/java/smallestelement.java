public class smallestelement {
    public static void main(String[] args) {
            int[] arr={4, 3, 2, 5, 1};
            int count=0;
            int right=arr[arr.length-1];
            count++;
            for(int i=arr.length-2;i>=0;i--){
                if(right>arr[i]){
                    count++;
                }
                right=Math.min(right,arr[i]);
            }
            System.out.println(count);
    }
}
