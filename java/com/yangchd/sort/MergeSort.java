package com.yangchd.sort;

/**
 * @author yangchd 2018/5/29
 *
 * 归并排序
 * 1.选择相邻两个数组成一个有序序列。
 * 2.选择相邻的两个有序序列组成一个有序序列。
 * 3.重复第二步，直到全部组成一个有序序列。
 */
public class MergeSort {

    public void mergeSort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    private void mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            mergeSort(a, low, mid);
            // 右边
            mergeSort(a, mid + 1, high);
            // 左右归并
            merge(a, low, mid, high);
        }
    }

    private void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        // 左指针
        int i = low;
        // 右指针
        int j = mid + 1;
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖旧数组
        System.arraycopy(temp, 0, a, low, temp.length);
    }

}
