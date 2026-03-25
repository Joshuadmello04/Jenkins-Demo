public class EqualPartition {

    public static boolean canPartition(int[][] grid){
        int sum = 0;
        int n = grid.length;
        int m = grid[0].length;

        
        for(int[] gr:grid){
            for(int i:gr){
                sum += i;
            }
        }

        if(sum%2 != 0){
            return false;
        }
        
        int hSum = 0;
        for(int i=0; i<n-1; i++){
            for(int j=0;j<m;j++){
                hSum += grid[i][j];
            }

            if(hSum*2 == sum){
                return true;
            }
        }
        hSum = 0;
        for(int i=0; i<m-1; i++){
            for(int j=0;j<n;j++){
                hSum += grid[j][i];
            }

            if(hSum*2 == sum){
                return true;
            }
        }

        
        return false;
    }
    public static void main(String[] args) {
        int[][] grid = {{1,3},{2,4}};
        canPartition(grid);
    }
}
