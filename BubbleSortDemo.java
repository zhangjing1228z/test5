import java.util.Arrays;

/**
 * 冒泡排序示例类
 */
public class BubbleSortDemo {

    /**
     * 冒泡排序方法（升序）
     * 基本思想：相邻两个元素比较，前者大于后者则交换，
     * 每一轮把当前未排序部分的最大值"冒泡"到末尾。
     * 加入 swapped 标志位优化：若某一轮没有发生交换，说明已经有序，提前结束。
     *
     * @param arr 待排序的整型数组（原地排序）
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            // 每轮结束后，末尾的 i 个元素已经有序，无需再比较
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // 本轮没有交换，说明数组已有序，提前退出
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("排序前: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
    }
}
