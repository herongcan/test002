package com.vincent.sort;

/**
 * created by Administrator on 2018/5/6.
 */
public class TestBubble {
    public static void main(String[] args) {
        int[] arrs = {1,3,2,6,4};
        myBubbleSort(arrs);
        for (int j = 0; j<arrs.length;j++) {
            System.out.println(arrs[j]);
        }
    }

    private static void myBubbleSort(int[] arrs){

        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");
        System.out.println("hello4");
        //外层控制冒泡索引 4--3--2--1
        for (int i = arrs.length-1;i>0;i--) {
            for (int j = 0; j<i;j++) {
                if (arrs[j]>arrs[j+1]){
                    int temp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = temp;
                }
            }

        }
    }
}
