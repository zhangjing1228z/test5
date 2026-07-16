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
            
            // 如果一趟下来没有发生交换，说明已经有序，提前结束
            if (!swapped) {
                break;
            }
        }
        
        return arr;
    }
    
    /**
     * 打印数组方法
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    /**
     * 主方法 - 测试示例
     */
    public static void main(String[] args) {
        // 测试用例1
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("原始数组: ");
        printArray(arr1);
        
        bubbleSort(arr1);
        
        System.out.println("排序后数组: ");
        printArray(arr1);
        
        // 测试用例2
        int[] arr2 = {5, 2, 8, 1, 9, 3};
        System.out.println("\n原始数组: ");
        printArray(arr2);
        
        bubbleSort(arr2);
        
        System.out.println("排序后数组: ");
        printArray(arr2);
        
        // 测试用例3 - 已排序数组
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("\n原始数组: ");
        printArray(arr3);
        
        bubbleSort(arr3);
        
        System.out.println("排序后数组: ");
        printArray(arr3);
    }
}
