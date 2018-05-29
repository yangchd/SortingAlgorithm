package com.yangchd.exercise.sort;

/**
 * @author yangchd  2018/5/28.
 *
 * 希尔排序 又被称为缩小增量排序
 * 1.将数的个数设为n，取数k=n/2，将下标差值为k的书分为一组，构成有序序列。
 * 2.再取k=k/2 ，将下标差值为k的书分为一组，构成有序序列。
 * 3.重复第二步，直到k=1执行简单插入排序。
 */
public class ShellSort {

    /**
     * i 每组交换后面的数
     * j 每组交换前面的数
     * r 每组交换的间距
     * tmp 交换数据临时存储
     */
    public void shellSort(int[] arr) {
        int i, j, r, tmp;
        // 划组排序
        for (r = arr.length / 2; r >= 1; r = r / 2) {
            for (i = r; i < arr.length; i++) {
                tmp = arr[i];
                j = i - r;
                // 一轮排序
                while (j >= 0 && tmp < arr[j]) {
                    arr[j + r] = arr[j];
                    j -= r;
                }
                arr[j + r] = tmp;
            }
        }
    }

}
