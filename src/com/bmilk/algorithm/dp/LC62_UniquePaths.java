package com.bmilk.algorithm.dp;

public class LC62_UniquePaths {
    public static void main(String[] args) {
        LC62_UniquePaths service = new LC62_UniquePaths();
        int i = service.uniquePaths(3, 7);
        System.out.println(i);
    }

    public int uniquePaths(int m, int n) {
        if( m==1 || n ==1) return 1;

        int[][] dp = new int[m][n];

        for(int i=0; i<m;i++){
            dp[i][0] = 1;
        }
        for(int i=0; i<n;i++){
            dp[0][i] = 1;
        }
        for (int i=1;i<m;i++){
            for (int j=1; j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
