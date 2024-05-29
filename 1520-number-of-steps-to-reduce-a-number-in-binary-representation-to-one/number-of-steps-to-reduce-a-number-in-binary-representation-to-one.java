import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        BigInteger n = new BigInteger(s, 2);
        int c = 0;
        
        while (!n.equals(BigInteger.ONE)) {
            if (n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                n = n.divide(BigInteger.TWO);
            } else {
                n = n.add(BigInteger.ONE);
            }
            c++;
        }
        
        return c;
    }
}
