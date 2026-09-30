class Solution {
    public boolean checkPerfectNumber(int num) {
        int og = num;
        int sum =0;
        if(num==1){
            return false;
        }
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                if((num/i)!=i && (num/i)!=num){
                    sum+=(num/i);
                }
            }
        }
        if(sum==og){
            return true;
        }
        else{
            return false;
        }
    }
}