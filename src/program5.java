import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class program5 {
    public static void main(String[] args) {
//        Pattern p=Pattern.compile("0?[79][0-9]{9}");
//        Matcher m=p.matcher("07991666248");
//        Pattern p=Pattern.compile("(0|91)?[79][0-9]{9}");
//        Matcher m=p.matcher("7991666248");
        Pattern p=Pattern.compile("(0|91)?[79][0-9]{9}");
        Matcher m=p.matcher("7991666248");
        while(m.find())
        {
            System.out.println(m.matches()+ " "+m.start()+" "+m.end()+" "+m.group());
        }

    }
}
