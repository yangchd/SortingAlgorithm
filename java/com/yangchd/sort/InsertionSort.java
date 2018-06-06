package com.yangchd.sort;

/**
 * @author yangchd  2018/5/28.
 *
 * 直接插入排序
 * 1.将第一个数和第二个数排序，然后构成一个有序序列
 * 2.将第三个数插入进去，构成一个新的有序序列。
 * 3.对第四个数、第五个数……直到最后一个数，重复第二步。
 */
public class InsertionSort {

    /**
     * 对输入的数组，从第二个开始比较插入
     */
    public void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {

            int insert = a[i];

            // 当前已经完成j个数
            int j = i - 1;

            // 从后往前判断，将新的数放到相应位置
            while (j >= 0 && insert < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = insert;
        }
    }
}
