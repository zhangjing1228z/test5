import java.util.Arrays;

public class BubbleSort {

    /**
     * 冒泡排序：反复比较相邻元素，将较大的元素向后"冒泡"。
     * 时间复杂度：O(n^2)，最好情况（已有序）O(n)；空间复杂度：O(1)；稳定排序。
     *
     * @param arr 待排序的整型数组（原地排序）
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // 优化标志：本轮没有交换说明已经有序
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换相邻两个元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
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
