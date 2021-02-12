package game;

import game.objects.GameObjects;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private GameObjects[] obj = {new Rock(), new Paper(), new Scissors()};

    public void run() {
        System.out.println("game started");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score=0;
        String[] result ={"lost","equal","win"};
       for (int i=0; i<3; i++){

           System.out.println("please enter your number of obj\n0-rock\n1-paper\n2-scissors");
           System.out.println(">>");
           int objectIndex = scanner.nextInt();
           System.out.println();
           GameObjects object1 = obj[random.nextInt(obj.length)];
           GameObjects object2=obj[objectIndex];

           System.out.println("you chose "+object2);
           System.out.println("computer chose "+object1);
           int indexOfResult=object2.compareTo(object1)+1;
           System.err.println(result[indexOfResult]);

           score+= object2.compareTo(object1);
       }
   String winer= (score>0)?"You win, your score is "+score:(score<0)?"you loose, your score is"+score:"no one wins today, you are equal, score:"+score;

       System.err.println(winer);
scanner.close();
    }
}
//game is done
