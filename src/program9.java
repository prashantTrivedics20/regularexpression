import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Q. Write a program to check whether the given no is a valid mobile number or not?
// The mobile no is entered by the command line argument
public class program9 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[0-9]{10}");
        Matcher m=p.matcher(args[0]);
        System.out.println(m.matches());

    }
}
