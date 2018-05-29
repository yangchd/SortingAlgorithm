package com.yangchd.exercise.sort;

/**
 * @author yangchd 2018/5/29
 *
 * 冒泡排序——很简单，用到的很少
 */
public class BubbleSort {

    /**
     * 从左边开始一个一个确定最小的数
     */
    public void bubbleSort1(int []a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * 将最大的数放到右边
     */
    public void bubbleSort2(int []a) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}
