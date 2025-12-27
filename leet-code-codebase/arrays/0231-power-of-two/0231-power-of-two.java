class Solution {
    public boolean isPowerOfTwo(int num) {
        if (num == 1){
            return true;
        } else {
            while(num > 0) {
                if (num % 2 == 0) {
                    if (num == 2) {
                        return true;
                    }
                    num = num / 2;
                } else {
                    return false;
                }
            }
            return false;
        }
}
}