package week2;

public class DuplicatesInArray {
    static void main() {
        int a[] = {2,3,3,2,1,6,7,1};


        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j])
                    System.out.print("Duplicate Element in the array: " + a[i] + " ");
            }
        }
    }
}
