public class AssignmentQuestion2 {
    public static void mergeArrays (int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < n1) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        while (j < n2) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }
    }

    static int[] reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        return b;
    }
    static int getLength(int arr[]){
        int count=0;
        for(int item:arr){
            count++;
        }
        return count;
    }
    public static void main (String[] args)
    {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = getLength(arr1);

        int[] arr2 = {8, 6, 4, 2 };
        int n2 = getLength(arr2);

        int [] rev = reverse(arr2, n2);
        int[] arr3 = new int[n1 + n2];

        mergeArrays(arr1, rev, n1, n2, arr3);

        System.out.println("Array after merging");
        for (int i = 0; i < n1 + n2; i++)
            System.out.print(arr3[i] + " ");
    }
}
