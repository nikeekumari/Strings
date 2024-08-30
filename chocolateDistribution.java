import java.util.Arrays;
public class chocolateDistribution {
    public static int chocolate(int arr[],int m){
        if(arr.length==0|| m==0){
            return 0;
        }
        Arrays.sort(arr);
        if(arr.length-1<m){
            return -1;
        }
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int nextWindow=i+m-1;
            if(nextWindow>=arr.length)
            break;
            int diff=arr[nextWindow]-arr[i];
            min_diff=Math.min(min_diff,diff);
        }
        return min_diff;
    }
    public static void main(String[] args){
        int arr[]={3,4,1,9,56,7,9,12};
        int m=5;
        int result=chocolate(arr,m);
        if(result!=-1){
            System.out.println("Min diff is" +" " + result );
        }else{
            System.out.println("Invalid input");
        }
        }
    }

