import java.util.Arrays;

/**
 * 冒泡排序示例
 */
public class BubbleSortDemo {

    /**
     * 冒泡排序方法（带提前退出优化）
     * 基本思想：重复比较相邻两个元素，若顺序错误则交换，
     * 每一轮会把当前未排序部分的最大值"冒泡"到末尾。
     *
     * @param arr 待排序的整数数组
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // 空数组或只有一个元素，无需排序
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // 标记本轮是否发生交换

            // 每轮结束后，末尾 i 个元素已就位，无需再比较
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换相邻元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // 如果本轮没有交换，说明数组已经有序，提前结束
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90};

        System.out.println("排序前: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
    }
}
