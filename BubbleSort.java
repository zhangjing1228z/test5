public class BubbleSort {
    
    /**
     * 冒泡排序方法
     * @param arr 待排序的整型数组
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // 每一轮将最大的元素冒泡到末尾
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换相邻元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // 如果某一轮没有发生交换，说明数组已经有序，提前结束
            if (!swapped) {
                break;
            }
        }
    }
    
    // 测试方法
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("排序前:");
        printArray(array);
        
        bubbleSort(array);
        
        System.out.println("排序后:");
        printArray(array);
    }
    
    // 打印数组的辅助方法
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
