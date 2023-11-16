/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7
{
    // define your constants after this comment

    private static String generate(int num, char ch){
        String result="";
        for(int count=0; count < num; count ++){
            result += ch;
        }
        return result;
    }
    public static String leftRightTriangle(int height)
    {
        String str = "";
        for(int tri = 1; tri  <= height; tri ++){
            str += generate(tri, '*') +"\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        int righttri = height-1;
        for(int tri = 1; tri  <= height; tri ++){
            str += generate(righttri, ' ') + generate(tri, '*') +"\n";
            righttri -= 1;
        }
        return str;
    }

    public static String circle(int radius)
    {
        String str = "";

        for(int rad = radius-1; rad>= -radius+1; rad --){
            int x = (int)Math.sqrt(radius * radius-rad*rad);
            str += generate(radius - x , ' ') + generate(2 * x, '*') +"\n";

        }
        return str;
    }
}
