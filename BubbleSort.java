public class BubbleSort {
    
    /**
     * 冒泡排序方法
     * @param arr 待排序的整型数组
     * @return 排序后的数组
     */
    public static int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // 每一轮将最大的元素"冒泡"到末尾
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换相邻元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // 如果这一轮没有发生交换，说明数组已经有序
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
        int[] array3 = {1, 2, 3, 4, 5}; // 已经有序
        
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
