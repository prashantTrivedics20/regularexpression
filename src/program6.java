//Q Write a regular expression to represent all names start with N | n  with any length
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class program6 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[N n][a-z A-Z ]+");
        Matcher m=p.matcher("neeraj khanna sir");
        System.out.println(m.matches());
    }
}
