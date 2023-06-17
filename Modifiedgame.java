import java.util.*;
public class Modifiedgame {
    public static void main(String[] args)
    {
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
class Guesser
{
    int guessNum;
    int guessingNumber()
    {
        System.out.println("Guesser! Kindly Guess the number from 1 to 10");
        Scanner scan=new Scanner(System.in);
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Player
{
    int guessNum;
    int guessingNumber()
    {
        System.out.println(num);
        if(num>=1 && num<=5)
        {
        System.out.println("Player! Kindly Guess the number from 1 to 5");
        }
        else
        {
        System.out.println("Player! Kindly Guess the number from 5 to 10");
        }
        Scanner sc=new  Scanner(System.in);
        int  pguessNum=sc.nextInt();
        return pguessNum;
    }
}
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    public void collectNumFromGuesser()
    {
     Guesser g =new Guesser();
     numFromGuesser=g.guessingNumber();
    }
    public void collectNumFromPlayer()
    {
     Player p1=new Player();
     Player p2=new Player();
     Player p3=new Player();
     numFromPlayer1=p1.guessingNumber();
     numFromPlayer2=p2.guessingNumber();
     numFromPlayer3=p3.guessingNumber();
    }
    void compare()
       {
        if(numFromGuesser==numFromPlayer1)
        {
            if((numFromGuesser==numFromPlayer2)&& (numFromGuesser==numFromPlayer3))
            {
                System.out.println("Game tied all threee players guessed correctly");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
             System.out.println("Player 1 and Player 2 won the game");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
            System.out.println("Player 1 and Player 3 won the game");
            }
            else
            {
            System.out.println("Player 1 won the match");  
            }
    }
        else if(numFromGuesser==numFromPlayer2)
        {
            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 2 and Player 3 won the match"); 
            }
            else 
            {
                System.out.println("Player 2 won the match"); 
            }
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 3 won the match");
        }
        else 
        {
            System.out.println("Game lost!! Try again");
        }
        }
}
