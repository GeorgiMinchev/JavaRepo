import java.util.Random;
import java.util.Scanner;


public class Random5HandCard {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int numberOfHands = scn.nextInt();
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A"};
        String[] faces = {"♣", "♦", "♥", "♠" };
        Random rnd = new Random();
        for(int i = 0;i<numberOfHands;i++){
                        System.out.printf("%s%s %s%s %s%s %s%s %s%s%n",cards[rnd.nextInt(13)],faces[rnd.nextInt(4)],cards[rnd.nextInt(13)],faces[rnd.nextInt(4)],cards[rnd.nextInt(13)],faces[rnd.nextInt(4)],cards[rnd.nextInt(13)],faces[rnd.nextInt(4)],cards[rnd.nextInt(13)],faces[rnd.nextInt(4)]);
        }
	}

}
