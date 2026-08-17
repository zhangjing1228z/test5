public class BubbleSort {
    
    /**
     * 冒泡排序方法
     * @param arr 待排序的整数数组
     * @return 排序后的数组
     */
    public static int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        
        int n = arr.length;
        boolean swapped;
        
        // 外层循环控制趟数
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // 内层循环进行相邻元素比较和交换
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // 如果某一趟没有发生交换，说明数组已经有序，提前结束
            if (!swapped) {
                break;
            }
        }
        
        return arr;
    }
    
    // 测试方法
    public static void main(String[] args) {
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = {5, 1, 4, 2, 8};
        int[] array3 = {1, 2, 3, 4, 5}; // 已经有序的数组
        
        System.out.println("原数组1: " + java.util.Arrays.toString(array1));
        bubbleSort(array1);
        System.out.println("排序后: " + java.util.Arrays.toString(array1));
        
        System.out.println("\n原数组2: " + java.util.Arrays.toString(array2));
        bubbleSort(array2);
        System.out.println("排序后: " + java.util.Arrays.toString(array2));
        
        System.out.println("\n原数组3: " + java.util.Arrays.toString(array3));
        bubbleSort(array3);
        System.out.println("排序后: " + java.util.Arrays.toString(array3));
    }
}
