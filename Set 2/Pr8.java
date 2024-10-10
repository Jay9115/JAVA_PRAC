
public class Pr8 {

    static int array_count9(int arr[]) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 9};
        int[] arr2 = {1, 9, 9};
        int[] arr3 = {1, 9, 9, 3, 9};

       System.out.println("Number of 9's in array 1: "+array_count9(arr1));
       System.out.println("Number of 9's in array 2: "+array_count9(arr2));
       System.out.println("Number of 9's in array 3: "+array_count9(arr3));

        System.out.println("23DCS076 JAY PATEl");
    }
}
