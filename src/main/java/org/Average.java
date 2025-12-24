package org;

public class Average {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            }
        double average=sum/ arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>average){
                System.out.println(arr[i]);
                }
            }
        }
    }

