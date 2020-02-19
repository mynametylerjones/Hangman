import java.util.*;
/**
 * I wasn't sure where to go from here.  If I had an idea, I would have
 * attempted to code it, but I didn't.
 */
public class Hangman
{
    static Scanner s = new Scanner(System.in);
    static String phrase = s.nextLine().toLowerCase();
    static String hello = phrase;
    static String underline = "";
    public static char guess;
    public static int control = 0;

    public static void main()
    {
        System.out.print('\u000C');
        System.out.print("Type a word or phrase that you want someone to guess.");
        System.out.println();
        for(int i = 0; i < phrase.length(); i++)
        {
            if(phrase.charAt(i) == ' ')
            {
                underline += " ";
            }
            else
            {
                underline += "_";
            }
        }
        System.out.print('\u000C');
        char[] answer = underline.toCharArray();
        System.out.println(underline);

        while(underscoreCheck(answer) && control < 6)
        {
            System.out.println("Enter a character: ");
            String guess1 = s.next();
            char guess = guess1.charAt(0);
            boolean right = false;

            for(int i = 0; i < phrase.length(); i++)
            {
                if(phrase.charAt(i) == guess)
                {
                    answer[i] = guess;
                    right = true;
                }
            }
            if(right == false)
            {
                System.out.println("If your going to play a game, make sure your good.");
                control ++;
                hangmn();
            }
            System.out.println(answer);
        }
    }

    public static boolean underscoreCheck(char[] u)
    {
        for(char c : u)
        {
            if(c == '_')
            {
                return true;
            }
        }
        return false;
    }

    public static void hangmn()
    {
        String p1 = "   ____________ \n   |          _|_ \n   |         /   \\ \n   |        |     | \n   |         \\_ _/ \n   |              \n   |                \n   | \n___|___ \n";
        String p2 = "   ____________ \n   |          _|_ \n   |         /   \\ \n   |        |     | \n   |         \\_ _/ \n   |           |  \n   |           |    \n   | \n___|___ \n";
        String p3 = "   ____________ \n   |          _|_ \n   |         /   \\ \n   |        |     | \n   |         \\_ _/ \n   |           |  \n   |           |    \n   |          / \n___|___      / \n";
        String p4 = "   ____________ \n   |          _|_ \n   |         /   \\ \n   |        |     | \n   |         \\_ _/ \n   |           |  \n   |           |    \n   |          / \\ \n___|___      /   \\ \n";
        String p5 = "   ____________ \n   |          _|_ \n   |         /   \\ \n   |        |     | \n   |         \\_ _/ \n   |          _|  \n   |         / |    \n   |          / \\ \n___|___      /   \\ \n";
        String p6 = "   ____________ \n   |          _|_ \n   |         /   \\ \n   |        |     | \n   |         \\_ _/ \n   |          _|_ \n   |         / | \\ \n   |          / \\ \n___|___      /   \\ \n";
        if(control == 1)
        {
            System.out.print(p1);
        }
        else if(control == 2)
        {
            System.out.print(p2);
        }
        else if(control == 3)
        {
            System.out.print(p3);
        }
        else if(control == 4)
        {
            System.out.print(p4);
        }
        else if(control == 5)
        {
            System.out.print(p5);
        }
        else if(control == 6)
        {
            System.out.print(p6);
            System.out.println("You loose");
            System.out.println(hello);
            System.out.print('\u000C');
        }
    }
}
