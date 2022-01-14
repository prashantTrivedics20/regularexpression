//Q. Write a regular expression to represent all names end with J | j
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class program7 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[a-z A-Z ]+[j J]");
        Matcher m=p.matcher("neeraj");
        System.out.println(m.matches());
    }
}
