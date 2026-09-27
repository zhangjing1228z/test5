import java.util.Arrays;

/**
 * 冒泡排序示例
 */
public class BubbleSort {

    /**
     * 冒泡排序方法（升序）
     * 基本思想：重复地比较相邻两个元素，如果顺序错误就交换它们，
     * 每一轮会把当前未排序部分的最大值"冒泡"到末尾。
     *
     * 时间复杂度：最优 O(n)（已有序，提前退出），最坏/平均 O(n^2)
     * 空间复杂度：O(1)，原地排序
     * 稳定性：稳定排序
     *
     * @param arr 待排序数组（null 或空数组时直接返回）
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int n = arr.length;
        // 外层：每完成一轮，末尾就多一个已排好的元素
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // 优化标志：本轮若没有发生交换，说明已经有序

            // 内层：比较相邻元素，把最大值交换到 arr[n-1-i] 处
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // 提前退出：已经有序，无需继续
            if (!swapped) {
                break;
            }
        }
    }

    // 测试
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("排序前: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
    }
}
