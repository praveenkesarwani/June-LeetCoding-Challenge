//Problem: Power of Two
//there should be only 1 set bit in integer n.
//all bits except first one will be set bit in (n-1)th integer
//so their and operation would always give 0

class Solution {
    public boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0 && n > 0);
    }
}