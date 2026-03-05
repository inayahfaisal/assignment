
    import java.util.Scanner;

public class MatrixSum
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("\nMatrix you entered is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
                //Space inside quotes: This adds a space after prinitng each number. 
            }
            System.out.println();
        }

        input.close();
    }
}























