public class RGBToHEXConversion {

    public static void main(String[] args) {
        System.out.println(convertRGBToString(-174, 175, 12));

    }

    public static String convertRGBToString(int r, int g, int b) {
        return (intToHex(r)+intToHex(g)+intToHex(b)).toUpperCase();
    }

    public static String intToHex(int i){
        if (i < 0) i = 0;
        if (i>255) i = 255;
        return Integer.toHexString(i/16)+Integer.toHexString(i%16);

    }

}
