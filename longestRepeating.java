public class longestRepeating {
    public static char maxRepeating(String str){
        int n=str.length();
        int maxCount=0;
        int currCount=1;
        char res=str.charAt(0);
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                currCount++;
            }else{
                if(currCount>maxCount){
                    maxCount=currCount;
                    res=str.charAt(i-1);
                }
                currCount=1;
            }
        }
        if(currCount>maxCount){
            maxCount=currCount;
            res=str.charAt(n-1);
        }
        return res;
    }
    public static void main(String[] args){
        String str="aaaabbcbbbb";
        System.out.println(maxRepeating(str));
    }
}
