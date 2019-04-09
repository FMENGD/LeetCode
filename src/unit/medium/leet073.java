package unit.medium;

public class leet073 {
    public static void setZeroes(int[][] matrix) {
        Boolean flag = false;
        int R = matrix.length;
        int C = matrix[0].length;

        for(int i = 0; i < R; i++){
            if(matrix[i][0] == 0){
                flag = true;
            }

            for(int j = 1; j < C; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < R; i++){
            for(int j = 1; j < C; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j = 0; j < C; j++){
                matrix[0][j] = 0;
            }
        }
        if(flag){
            for(int i = 0; i < R; i++){
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String args[]){
        int a[][] = {{1,1,1,1},{1,0,1,1},{1,1,0,0},{0,0,0,1},{0,1,1,0}};
        setZeroes(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
