public class DuaDimensi {
    public static void main(String[] args) {
        int[][] nilai ={
                {80, 90, 75},
                {85, 95, 80},
                {70, 60, 75}};

        int[][] matrix = new int[3][4];
        matrix[0][1] = 2;
        matrix[2][2] = 9;
        System.out.println(matrix[2][2]);
        System.out.println(matrix[0][0]);
    }
}
