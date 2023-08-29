public class spiral_Matrix {
    public static void main(String[] args){
        int[][] matrix = {
                          {1,3,7,9,10,11},
                          {6,10,12,13,20,21},
                          {9,25,29,20,32,41},
                          {15,55,59,63,68,70},
                          {40,70,79,81,95,105}
                        };

        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m-1;
        int bottom = n - 1; int top = 0;
        
        while(left<= right && top <= bottom){

            for(int i = left; i <= right; i ++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for(int i = top; i <= bottom ; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if(top<= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }

        }
    }
}
