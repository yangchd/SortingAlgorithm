package com.yangchd.sort;

/**
 * @author yangchd 2018/5/29
 *
 * 基数排序
 * 基数排序的总体思路就是将待排序数据拆分成多个关键字进行排序，也就是说，基数排序的实质是多关键字排序
 */
public class RadixSort {

    public void radixSort(int[] num) {
        if (isEmpty(num)) {
            return;
        }
        // 获取最大的数
        int tmp = getMax(num);
        // 计算所需要的排序次数
        int loop = 0;
        while (tmp > 0) {
            tmp /= 10;
            loop++;
        }

        int count = 1, k, lsd;
        int[][] bubble = new int[10][num.length];
        int[] order = new int[10];
        tmp = 1;
        while (count <= loop) {
            // 将尾数相同的放到一个里面
            for (int aNum : num) {
                lsd = (aNum / tmp) % 10;
                bubble[lsd][order[lsd]] = aNum;
                order[lsd]++;
            }
            // 将num进行一次从新排序，然后更换排序条件
            k = 0;
            for (int i = 0; i < 10; i++) {
                if (order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        num[k++] = bubble[i][j];
                    }
                }
                order[i] = 0;
            }
            tmp *= 10;
            count++;
        }
    }
    private boolean isEmpty(int[] num) {
        return num == null || num.length == 0;
    }
    private int getMax(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }
}
