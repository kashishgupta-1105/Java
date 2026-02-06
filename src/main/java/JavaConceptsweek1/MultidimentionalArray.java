package JavaConceptsweek1.JavaProblems;

public class MultidimentionalArray {
    static void main() {
        int a[][] = {{1, 2, 3}, {4, 5, 2}, {8, 3, 2}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                System.out.print(a[i][j] + " ");

        }

    }

}
