
package longestincreasingsubsequence;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int a[] = {6,4,1,2,5,3,8,0};
        lisDynamic(a);
    }
    public static void lisDynamic(int a[]){
        int lis[] = new int[a.length];
        int trace[] = new int[a.length];
        int index=-1;
        for (int i = 0; i < a.length; i++) {
            lis[i]=1;
            trace[i]=-1;
        }
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]<a[j] && lis[i]+1>lis[j]){
                    lis[j]=lis[i]+1;
                    trace[j] = i;
                }
            }
        }
        int max=lis[0];
        for (int i = 1; i < lis.length; i++) {
            if(lis[i]>max){
                max = lis[i];
                index = i;
            }
        }
        System.out.println("Lenth of lis is: "+max);
        System.out.println("Sequence is: ");
        traceSequence(index,a,trace);
        System.out.print(a[index]);
    }
    public static void traceSequence(int index, int a[], 
            int trace[]){
        if(trace[index]==-1) 
            return;
        index = trace[index];
        traceSequence(index,a,trace);
        System.out.print(a[index]+" ");
    }
}

