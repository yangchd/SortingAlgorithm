package com.yangchd.sort;

/**
 * @author yangchd  2018/5/29.
 *
 * 选择排序
 * 1.遍历整个序列，将最小的数放在最前面。
 * 2.遍历剩下的序列，将最小的数放在最前面。
 * 3.重复第二步，直到只剩下一个数。
 */
public class SelectSort {

    public void selectSort(int[] a) {
        int min,index;
        for (int i = 0; i < a.length; i++) {
            min = a[i];
            index = i;
            for (int j = i + 1; j < a.length; j++) {
                if(min > a[j]){
                    min = a[j];
                    index = j;
                }
            }
            // 交换位置
            a[index] = a[i];
            a[i] = min;
        }
    }
}
