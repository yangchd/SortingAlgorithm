# Sorting Algorithm ![Language](https://img.shields.io/badge/language-java-orange.svg) 

#### 一、稳定性

- 稳定：冒泡排序、直接插入排序、归并排序和基数排序

- 不稳定：选择排序、快速排序、希尔排序、堆排序

#### 二、排序算法的选择

1. 数据规模较小

- 待排序列基本序的情况下，可以选择直接插入排序；

- 对稳定性不作要求宜用简单选择排序，对稳定性有要求宜用插入或冒泡

2. 数据规模不是很大

- 完全可以用内存空间，序列杂乱无序，对稳定性没有要求，快速排序，此时要付出log（N）的额外空间。

- 序列本身可能有序，对稳定性有要求，空间允许下，宜用归并排序

3. 数据规模很大

- 对稳定性有求，则可考虑归并排序。

- 对稳定性没要求，宜用堆排序

4. 序列初始基本有序（正序），

- 宜用直接插入，冒泡

#### 三、复杂度

| 排序算法 | 最好时间 | 最差时间 | 平均时间复杂度 | 空间复杂度 | 稳定度 |
|---|---|---|---|---|---|
|直接插入排序|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n^2))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n^2))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(1))|稳定|
|希尔排序|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n^2))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(nlog_2n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(1))|不稳定|
|直接选择排序|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n^2))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n^2))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n^2))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(1))|不稳定|
|堆排序|![](http://chart.googleapis.com/chart?cht=tx&chl=O(nlog_2n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(nlog_2n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(nlog_2n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(1))|不稳定|
|冒泡排序|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n^2))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n^2))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(1))|稳定|
|快速排序|![](http://chart.googleapis.com/chart?cht=tx&chl=O(nlog_2n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n^2))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(nlog_2n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(log_2n)) ~ ![](http://chart.googleapis.com/chart?cht=tx&chl=O(n))|不稳定|
|归并排序|![](http://chart.googleapis.com/chart?cht=tx&chl=O(nlog_2n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(nlog_2n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(nlog_2n))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n))|稳定|
|基数排序|O(d(n+r))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(d(n+r)))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(d(n+r)))|![](http://chart.googleapis.com/chart?cht=tx&chl=O(n+r))|稳定|

