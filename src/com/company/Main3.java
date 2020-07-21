package com.company;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-21
 * Time:9:37
 * 一万年太久，只争朝夕，加油
 */
public class Main3 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,2,4,5,6};
        //奇数排在偶数后面
        //遇到奇数保存它的下标
        //遇到偶数先保存起来，将前面的偶数往后移动，再把这个奇数插入前面空出来的位置
        reSort(arr);
    }

    private static void reSort(int[] arr) {
        int k=0;
        for(int i=0;i<arr.length;i++){
            //遇到偶数保存下来
            if((arr[i]&1)==1){
                //说明是奇数,保存下来
                int temp=arr[i];
                int j=i;
                //将偶数移动到后面
                while(j>k){
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[k++]=temp;

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
