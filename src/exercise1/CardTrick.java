package exercise1;
import static exercise1.math.random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner Card = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card card = new card();
        
        int k = 0;
        int m = 0;
        
        

        for (int i = 0; i < magicHand.length; i++) {
            
            
            k=random(14);
            card.setValue(k);
            
            m=random(3);
            card.setSuit(Card.Suits[m]);
            
            
        }
        // I'm Done 
        System.out.print("Hello below you can enter your cards" );
        System.out.println("Enter 11 for jack, 12 for queen, 13 for king, 14 for ace: ");
        int m = input.nextInt();
        System.out.println("Enter 1-10 for hearts,spades,diamonds and clubs: ");
        int k = input.nextInt();
        
        
        
         while(magicHand >= c){
             System.out.print("Keep trying");
             System.out.print("Keep trying");
	     System.out.print("Keep trying");
         
         }
        
    }

   private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        
        System.out.println("My name is William, But you can call me Will ");
        System.out.println();
        
        System.out.println("My carerr ambitions:");
        System.out.println("Become a Web devloper");
        System.out.println("Start my own buisness");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Playing Video Games");
        System.out.println("Working on cars");
        
        
    
    }
    }

    

      class math {

        static int random(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public math() {
        }
    }
