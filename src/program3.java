//Java Regex Finder Example
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
public class program3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter regex pattern:");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter text:");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;
            while (matcher.find()) {
                System.out.println("I found the text " + matcher.group() + " starting at index " +
                        matcher.start() + " and ending at index " + matcher.end());
                found = true;
            }      //System.out.println(matcher.groupCount());
            if (found == false) {
                System.out.println("No match found.");
            }
            System.out.println("do you want to enter any pattern");
            if(sc.nextLine().equals("no"))
            {
                break;
            }
        }



        }

    }