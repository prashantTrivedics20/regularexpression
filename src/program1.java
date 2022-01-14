import java.util.regex.Pattern;
/*Create a regular expression that accepts alphanumeric characters only.
Its length must be six characters long only.*/
public class program1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-z A-Z 0-9]{6}");
        System.out.println(p.matcher("a").matches());
        System.out.println(Pattern.matches("[a-z A-Z 0-9]","a"));// Pattern and Matcher are pre-defined class regex pacage
        // (the  sub package of the util.)

    }
}
