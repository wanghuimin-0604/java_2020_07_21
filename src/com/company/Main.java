package com.company;

public class Main {
    public static void main(String[] args) {
	int[][] arr=new int[][]{{1,2,3,4},{2,3,4,5},{3,4,5,6}};
	int toFind=3;
	System.out.println(getNum(arr, toFind));
    }

    private static int getNum(int[][] arr, int toFind) {

        //查找的过程就是排除的过程：每一次和数组右上角的数字进行比较
        //因为这个数字比较特殊，它是这一行中最大的，这一列中最小的
        //我们每次可以排除一行，一列
        //先判断这个数组是不是为空
        if(arr==null){
            return -1;
        }
        int i=0;
        int j=arr[0].length-1;

        while(i<arr.length&&j>=0){
            if(toFind<arr[i][j]){
                //如果小于的话，就排除这一列
                j--;
            }else if(toFind>arr[i][j]){
                i++;
                //排除这一行
            }else{
                //等于的话，就找到了
                return arr[i][j];
            }
        }
        //如果遍历完之后还是没有找到，那么就返回-1
        return -1;
    }
}
