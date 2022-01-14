import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Create a regular expression that accepts a gmail id check weather the intered gmail id or valid or not....
*/
 class program4 extends Exception {
    program4()
    {
        System.out.println("gamil is not valid");
    }
}
//+[\.][a-z]{2,3}
class check
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        //System.out.println("Ente the regex..");
        Pattern p=Pattern.compile("[a-z A-Z 0-9 _ \\.\\-]+[@][a-z A-Z 0-9]+([\\.][a-z A-Z 0-9]{2,3})+");// it will valid any type of gmail
        //Pattern p=Pattern.compile("[a-z A-Z 0-9 _ \\.\\-]+[@][a-z]+([\\.][a-z]{2,3})+"); this is also valid for any type of gmail
       System.out.println("Enter the target string");
        Matcher m=p.matcher(readme.nextLine());
        try {
            if (m.matches() == true) {
                System.out.println("gmail successfully matched ");
            }
            else
            {
                throw new program4();
            }
        }
        catch (program4 e)
        {
            e.printStackTrace();
            System.out.println(" now  program is narmally  terminated");
        }
    }

}
