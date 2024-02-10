package com.jay.leetCode.easy.Sorting;

public class AverageSalaryExcludingMinMax {
    public static void main(String[] args) {

        int [] arr = {4000,3000,1000,2000};
        System.out.println(average(arr));

    }
    public static double average(int[] salary) {
        //Insetion Sort
        for(int i = 0; i<salary.length-1; i++){
            for (int j = i+1; j > 0; j--) {
                if (salary[j]< salary[j-1]) {
                    int temp = salary[j];
                    salary[j] = salary[j-1];
                    salary[j-1] = temp;
                }else {
                    break;
                }
            }
        }

        //Main Login
        int n = salary.length-2;
        double sum = 0;
        for(int i = 1;i<salary.length-1;i++){
            sum = sum+salary[i];
        }
        double ans = (sum)/n;
        return ans;


    }
}
