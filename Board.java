/**
 * Write a description of class Checkers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    public static String[][] board = new String[8][8];
    public static boolean john = true;
    public static String w = "◻️";
    public static String b = "◼️";
    public static String l = "⚫";
    public static String f = "⚪";
   
    public static void main(String[] args)
    {
        System.out.println(" ");
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                if(john){
                    board[i][j] = (w);
                    john = false;
                }
                else
                {
                    board[i][j] = (b);
                    john = true;
                }
               
            }
           
            john = !john;
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                if(john){
                    board[i][j] = (w);
                    john = false;
                }
                else
                {
                    board[i][j] = (f);
                    john = true;
                }
               
            }
           
            john = !john;
        }
        for(int i = 5; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                if(john){
                    board[i][j] = (w);
                    john = false;
                }
                else
                {
                    board[i][j] = (l);
                    john = true;
                }
               
            }
           
            john = !john;
        }
        printBoard();
    }
    public static void printBoard(){
        System.out.println(" --------------------------------------------------");
        for (int i = 0; i < 8; i++){
            System.out.print(" | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println(" -------------------------------------------------");
        }
    }
}