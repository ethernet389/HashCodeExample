public class MyHash {
    private boolean bVal = true;
    private char cVal = 'm';
    private String sVal= "MyHash";
    private long lVal = 1234567885126312344l;
    private float fVal = 1475874256.39f;
    private double dVal = 2221234678991283471342391237312341234689726734678923769812364234781245122.89147651234d;
    private byte[] arrayVal = new byte[]{5, 5, 6, 7};

    @Override
    public int hashCode() {
        int result = 47;

        int lVal = (int)(this.lVal - (this.lVal >>> 32));
        int bVal = this.bVal ? 1 : 0;
        int cVal = this.cVal;
        int sVal = this.sVal.hashCode();
        int fVal = Float.floatToIntBits(this.fVal);
        int dVal = (int) (Double.doubleToLongBits(this.dVal) - (Double.doubleToLongBits(this.dVal) >>> 32));
        for (int i = 0; i != arrayVal.length; ++i){
            result = result * 101 + (int)arrayVal[i];
        }

        result = 101 * result + lVal;
        result = 101 * result + bVal;
        result = 101 * result + cVal;
        result = 101 * result + sVal;
        result = 101 * result + fVal;
        result = 101 * result + dVal;

        return result;
    }
}
