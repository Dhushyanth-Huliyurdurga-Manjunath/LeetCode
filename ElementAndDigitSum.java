class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for(int i: nums){
            elementSum += i;
            if(i >= 10){
                // digitSum+= sumOfDigits(i);
                while(i >= 10){
                    digitSum += i % 10;
                    i = i/10;
                }
                digitSum += i;
            }
            else
                digitSum += i;
        }
        return Math.abs(digitSum - elementSum);
    }
    // public int sumOfDigits(int n){
    //     int sum = 0;
    //     if(n >= 10){
    //         sum += n % 10;
    //         sum += sumOfDigits(n/10);
    //         return sum;
    //     }
    //     sum += n;
    //     return sum;
    // }
}