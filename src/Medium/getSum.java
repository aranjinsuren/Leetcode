package Medium;

class getSum {
    public int Solution(int a, int b) {
        // a ^ b is the sum without the carry, will continue looping until there is no carry
        while (b != 0) {
            int temp = a & b;
            a = a ^ b;
            // b is the carry
            b = temp << 1;
        }
        return a;
    }

    // Runtime - O(1)
}   