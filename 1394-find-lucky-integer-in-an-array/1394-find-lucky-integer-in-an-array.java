class Solution {
    public int findLucky(int[] arr){
        int res=-1;
        int n =arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                   count++;
                }
            }
            if(count==arr[i]){
                res=Math.max(res,arr[i]);
            }
        }
        return res;
    }
}