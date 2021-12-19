/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sokjago;

import java.util.Random;

/**
 *
 * @author Akmal Haziq
 */
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random r = new Random();
    int player1 = 0;
    int player2 = 0;
    
    for(int i=0; i<2; i++){
            System.out.println("Round" + (i+1));
            int dice = r.nextInt(6) + 1;
            player1 += dice;
            System.out.println("Player 1 rolled" + dice);
            dice = r.nextInt(6) + 1;
            player2 += dice;
            System.out.println("Player 2 rolled" + dice);
            System.out.println("");
}

    if(player1 == player2){
        System.out.println("DRAW!");
    }
    else if(player1 > player2){
        System.out.println("Player 1 wins");
    }
    else if(player2 > player1){
        System.out.println("Player 2 wins");
    }
  }
}
    

