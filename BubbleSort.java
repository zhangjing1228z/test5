public class BubbleSort {
    /**
     * 冒泡排序方法：将整型数组按升序排列
     * 原理：重复遍历数组，比较相邻元素，若顺序错误则交换，
     * 每一轮遍历都会把当前未排序部分的最大值"冒泡"到末尾。
     *
     * @param arr 待排序的整数数组
     * @return 排序后的数组（原地排序，返回同一引用）
     */
    public static int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // 最后 i 个元素已经有序，不需要再比较
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换相邻元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // 如果这一趟没有发生交换，说明数组已经有序
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
    
    // 测试方法
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("排序前:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("排序后:");
        printArray(arr);
    }
    
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
