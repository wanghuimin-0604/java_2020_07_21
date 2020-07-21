package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-21
 * Time:8:41
 * 一万年太久，只争朝夕，加油
 */
public class Main2 {
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,5,1,2};
        //找旋转数组中最小的数字
        //二分查找：每次让最左边的数字和中间的数字进行比较，如果left<mid，说明前半段是非递减的，那么最小的数字再后半段
        //如果left>mid，说明要找的最小的数字在前半段
        //每次缩小查找的范围
        System.out.println(toFind(arr));

    }

    private static int toFind(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(left<right){
            if(right-left==1){
                mid=right;
                break;
            }
            if(arr[left]==arr[right]&&arr[left]==arr[mid]){
                int result=arr[left];
                for(int i=left+1;i<right;i++){
                    if(result>arr[i]){
                        result=arr[i];
                    }
                }
                return result;
            }
            mid=(left+right)>>1;
            if(arr[left]>=arr[mid]){
                right=mid;
            }else{
                left=mid;
            }
        }
        return arr[right];
    }
}
