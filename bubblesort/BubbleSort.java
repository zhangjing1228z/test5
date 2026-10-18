import java.util.Arrays;

/**
 * 冒泡排序（Bubble Sort）实现示例。
 */
public class BubbleSort {

    /**
     * 对整型数组进行冒泡排序（升序），原地排序。
     * 优化点：如果某一轮没有发生交换，说明已经有序，提前退出。
     *
     * @param arr 待排序数组（可为 null，null 时直接返回）
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // 标记本轮是否发生交换
            // 每轮把当前未部分的最大值"冒泡"到末尾
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换相邻两个元素
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            // 没有交换，说明已经有序，提前结束
            if (!swapped) {
                break;
            }
        }
    }

    // 简单测试
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3, 7, 6, 4, 8, 0};
        System.out.println("排序前: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
    }
}
