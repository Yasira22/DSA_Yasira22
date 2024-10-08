//  Yasira Shaikh PC
public class Lab_06 {

    //Task no 01
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i =0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }

//Task no 02
    public static void earlyStopBubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        for(int i =0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
//    Task no 03
    public static void bubbleSortByLength(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (String str : array) {
            System.out.print(str + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {5,1,3,4,6,2};
        String[] friuts = {"apple", "pie", "banana", "cat"};
        System.out.println("Simple Bubble Sort");
        bubbleSort(arr);
        System.out.println("");
        System.out.println("Early Stop Bubble Sort");
        earlyStopBubbleSort(arr);
        System.out.println("");
        System.out.println("String Bubble Sort");
        bubbleSortByLength(friuts);


    }

}