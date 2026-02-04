package week2;

public class RemoveDuplicates {
    static void main() {
        int[] arr = {4, 3, 2, 4, 1, 2};

        int n = arr.length;
        int newLength = 0;

        for(int i=0;i<n;i++){
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){
                //Checking if it is duplicate
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                }
            }
            // If element is not duplicate then add in arr
            if(!isDuplicate){
                arr[newLength++] = arr[i];
            }
        }
        for(int i=0;i<newLength;i++){
            System.out.print(arr[i] + " ");
        }
    }
    }
