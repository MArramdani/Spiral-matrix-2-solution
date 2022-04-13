class Solution {
    public int[][] generateMatrix(int n) {
        int result[][]=new int[n][n];
        
        int max_top=0;
        int max_right=n-1;
        int max_bot=n-1;
        int max_left=0;
        int start=1;
        
        int j,k,l,m;
        while(start<=n*n){
            
            //top left to top right 
            for(j=max_top;j<=max_right;j++){
                result[max_top][j]=start;
                start++;
            }
            max_top++;
                  
            
            //top right to bottom right
            for( k=max_top;k<=max_bot;k++){
                result[k][max_right]=start;
                start++;
                
            }
            max_right--;
            
            //bottom right to bottom left
            for(l=max_right;l>=max_left;l--){
                result[max_bot][l]=start;
                start++;
            }
            max_bot--;
            
            //bottom left to top left
            for(m=max_right;m>=max_top;m--){
                result[m][max_left]=start;
                start++;
            }
            max_left++;
             
        }//end of while loop
        
        return result; 
    
    }//end of function
}//end of class
