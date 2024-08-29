public class longestSubstring {
    public static int longestUniqueSubString(String str){
        if(str.length()==0)
        return 0;
        if(str.length()==1)
        return 1;
        int maxLength=0;
        boolean[] visited=new boolean[256];
        int left=0,right=0;
        while(right<str.length()){
            if(visited[str.charAt(right)]){
                while(visited[str.charAt(right)]){
                    visited[str.charAt(right)]=false;
                    left++;
                }
            }
            visited[str.charAt(right)]=true;
maxLength=Math.max(maxLength,(right-left+1));
right++;
        }
        return maxLength;
        }
        public static void main(String[] args){
            String str="ABCDEFGABEF";
            System.out.println("The input string is"+ "  "+ str);
            int len=longestUniqueSubString(str);
            System.out.println("The longest of the longest"+"non-repeating character"+"Substring is"+"  " +len);
        }    }

