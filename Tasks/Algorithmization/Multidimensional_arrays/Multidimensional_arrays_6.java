package Algorithmization.Multidimensional_arrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

public class Multidimensional_arrays_6 {
    public static void main(String[] args) {
int [] [] arr = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,0},{0,0,1,1,1,1,0,0},{0,0,0,1,1,0,0,0},{0,0,0,1,1,0,0,0},{0,0,1,1,1,1,0,0,},{0,1,1,1,1,1,1,0},{1,1,1,1,1,1,1,1}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
