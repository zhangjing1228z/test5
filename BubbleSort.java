public class BubbleSort {
    
    /**
     * 冒泡排序（升序）
     * 基本思想：重复地比较相邻的两个元素，如果顺序错误就交换它们，
     * 每一轮会把当前未排序部分的最大值“冒泡”到末尾。
     *
     * @param arr 待排序的整数数组（原地排序）
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        boolean swapped;

        // 外层循环控制趟数
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // 内层循环进行相邻元素比较和交换
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换相邻元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // 优化：如果一趟下来没有发生交换，说明已经有序，提前结束
            if (!swapped) {
                break;
            }
        }
    }
    
    /**
     * 打印数组方法
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    /**
     * 测试主方法
     */
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("排序前的数组:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("排序后的数组:");
        printArray(arr);
    }
}
