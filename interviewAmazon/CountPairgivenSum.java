package com.jay.interviewAmazon;

public class CountPairgivenSum {
    public static void main(String[] args) {
        int arr[] = {48 ,24 ,99 ,51 ,33 ,39 ,29 ,83 ,74 ,72 ,22 ,46, 40, 51,67, 37, 78, 76, 26, 28, 76 ,25 ,10 ,65, 64 ,47 ,34 ,88 ,26 ,49 ,86 ,73 ,73 ,36 ,75 ,5 ,26 ,4 ,39 ,99 ,27 ,12 ,97 ,67 ,63 ,15 ,3 ,92 ,90};
        int sum = 50;
        System.out.println(countpair(arr,sum));
    }
    static int countpair(int arr[], int sum){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if ((arr[i] + arr[j]) == sum){
                    count++;
                }
            }
        }
        return count;
    }
}
