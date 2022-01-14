//Q Write a regular expression to represent all names start with N|n  and ends with j|J
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class program8 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[N n][a-z A-Z ]+[j J]");
        Matcher m=p.matcher("neeraj");
        System.out.println(m.matches());
    }
}