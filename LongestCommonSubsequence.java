
public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String s1 = "abcdf";
        String s2 = "dbcafg";
        lcs(s1,s2);
    }
    public static void lcs(String s1, String s2){
        int row = s1.length()+1;
        int col = s2.length()+1;
        int table[][] = new int[row][col];
        for(int i=0;i<col;i++){
            table[0][i]=0;
        }
        for(int i=0;i<row;i++){
            table[i][0]=0;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(s2.charAt(j-1)==s1.charAt(i-1)){
                    table[i][j]=table[i-1][j-1]+1;
                }else{
                    table[i][j]=Math.max(table[i][j-1],
                            table[i-1][j]);
                }
            }
        }
        System.out.println("Length of LCS is "+table[row-1][col-1]);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(table[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
}
