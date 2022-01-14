import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Q. Write a program in java to check string contains special characters in java
public class program10 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[\\s \\. \\- \\@ \\# \\% \\*  ]");
        Matcher m=p.matcher("h-el%lo gla.in $@  33\n1\t3#1 e8* ");
        while(m.find())
        {
            System.out.println("start special symbol= "+m.start()+" "+"End Special symbol= "+m.end()+"symbol:- "+m.group());
        }
    }
}
