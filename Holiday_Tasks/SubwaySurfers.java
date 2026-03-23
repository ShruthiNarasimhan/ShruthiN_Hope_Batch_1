import java.util.*;
public class SubwaySurfers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boostCount = 3;
        Random random = new Random();
        String name=new String();
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Welcome to Subway Surfers, " + name + "!");
        System.out.println("You are running through the subway, dodging obstacles and collecting coins.");
        System.out.println("******Moves******\n1. Change Lane\n2. Jump\n3. Slide\n4. Collect Coin\n5. Double Tap\n6. Use Power-Up\n7. Boost\n8. Over\n******************");
        System.out.println("Enter your move:");
        String move = sc.nextLine();
        while(!move.equalsIgnoreCase("Over"))
        {
            switch(move.toLowerCase())
            {
                case "change lane":
                    System.out.println("Enter the Lane(Right,Left,Middle):"); 
                    String lane = sc.nextLine();
                    System.out.println("You have changed to the " + lane + " lane.");
                    break;
                case "jump":
                    System.out.println("You have jumped over an obstacle.");
                    break;
                case "slide":
                    System.out.println("You have slid under an obstacle.");
                    break;
                case "collect coin":
                    System.out.println("You have collected a coin.");
                    break;
                case "double tap":
                    System.out.println("You have activated a Skateboard.");
                    break;
                case "use power-up":
                    System.out.println("Enter the Power-Up(Super Sneakers, Coin Magnet, Jetpack):");
                    String powerUp = sc.nextLine();
                    System.out.println("You have used the " + powerUp + " power-up.");
                    break;
                case "boost":
                    if (boostCount > 0) {
                        System.out.println("You have activated a Boost.");
                        boostCount--;
                    } else {
                        System.out.println("You have no more boosts available.");
                    }
                    break;
                case "over":
                    System.out.println("Game Over! Thanks for playing, " + name + "!");
                    break;
                default:
                    System.out.println("Invalid move. Please try again."); 
                }
            
            System.out.println("Enter your move:");
            move = sc.nextLine();
        }
    System.out.print("Score: " );
    if(boostCount == 3){
        System.out.println();
    }
    else {
        System.out.println(random.nextInt(100000) * boostCount);
    }
    System.out.println("Coins Collected: " + (int)(random.nextInt(1000)));
    System.out.println("Well done, " + name + "! You have completed the game.");
    }
    
}
