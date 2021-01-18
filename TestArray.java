public class TestArray {
    public static void main(String[] args) {
        int[] testList = new int[10];
        for(int i=9; i>0; i--) {
            testList[i] = i;
        }
        System.out.println("The original array is：");
        for(int i:testList) {
            System.out.println( i +" ");
        }

        /** Reverse array */ 
        testList = reverse(testList);
        /** Bubble Sort ascending*/
        testList = bubbleSort(testList);
        /** Selection sort descending*/
        testList = selectionSort(testList);
    }

    /**  倒序 reverse */
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for(int i=0, j=result.length-1;i<arr.length;i++,j--){
            result[j]= arr[i];
        }
        System.out.println("The result of reverse array is：");
        for(int i:result){
            System.out.println(i+" ");
        }
        return result;
    } 
    /** 冒泡排序 Bubble Sorting */
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            //遍历数组里除最后一个的其他所有数，因为最后的对象没有与之可以相比较的数
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }           
            }
        }
        System.out.println("The result of bubble sort is：");
        for(int i:arr){
            System.out.println(i+" ");
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The result of selection sort is：");
        for(int i:arr){
            System.out.println(i+" ");
        }
        return arr;
    }
}
