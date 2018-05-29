package com.yangchd.exercise.sort;

/**
 * @author yangchd 2018/5/29
 *
 * 快速排序
 * 要求时间最快时。
 * 选择第一个数为p，小于p的数放在左边，大于p的数放在右边。
 * 递归的将p左边和右边的数都按照第一步进行，直到不能递归。
 */
public class QuickSort {
    public void quickSort(int[] a) {
        if (a.length > 0) {
            quickSort(a, 0, a.length - 1);
        }
    }

    private void quickSort(int[] a, int low, int high) {
        // 找到递归算法的出口
        if (low > high) {
            return;
        }
        // 存
        int i = low;
        int j = high;
        // key
        int key = a[low];
        // 完成一趟排序
        while (i < j) {
            // 从右往左找到第一个小于key的数
            while (i < j && a[j] > key) {
                j--;
            }
            // 从左往右找到第一个大于key的数
            while (i < j && a[i] <= key) {
                i++;
            }
            // 交换
            if (i < j) {
                int p = a[i];
                a[i] = a[j];
                a[j] = p;
            }
        }
        // 调整key的位置
        int p = a[i];
        a[i] = a[low];
        a[low] = p;
        //5, 对key左边的数快排
        quickSort(a, low, i - 1);
        //6, 对key右边的数快排
        quickSort(a, i + 1, high);
    }
}
