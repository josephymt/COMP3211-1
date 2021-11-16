import java.util.Arrays;
import java.util.Scanner;

import controller.GAME_CONTROLLER;

public class Application {
	
   
    public static String command;



    public static void main(String[] args){
    	
    	
    	
    	
        // Initialize and utilize the system
    	System.out.println("\n" +
                "░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗\n" +
                "░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝\n" +
                "░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░\n" +
                "░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░\n" +
                "░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗\n" +
                "░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝");

        boolean started = true;

        
        //create game controller
    	GAME_CONTROLLER gc = new GAME_CONTROLLER();
   
        //keep looping if user input invalid input
        while(started) {
        
            System.out.println("");
            System.out.println("Select the commands below (Type the number): ");
            System.out.println("1.New game");
            System.out.println("2.Load game");
            System.out.println("3.How to play");
            System.out.println("0.Exit Monopoly");
            System.out.println("");

           
            //create scanner, get user input 
            Scanner scanner = new Scanner(System.in);
            
            command = scanner.nextLine();
            
      
            
            //functions
            switch (command){
                
            	//"0.Exit Monopoly"
                case "0":
 
                	System.exit(0);
                    
                    break;

                    
                //"1.New game"
                case "1":
                   
                	     
                	
                	int numOfPlayer = 0;
              
                	
                	boolean flagForCase2 = true;
                	//keep looping if user input invalid number
                    while(flagForCase2) {
                    	     	
                    	
                    	
                    	System.out.println("Enter the number of players (2 to 6): \n");
                    	
                    	
                    	
                    	try {
                         	
                    		//get user input and close scanner 
                    		numOfPlayer = scanner.nextInt();
                            
                    		
                    		
                    		
                             
           	
                    		//if input is not between 2 to 6, tell user and keep asking input
                    		if( (numOfPlayer > 6) || (numOfPlayer < 2)) {
                    		
                    		
                    			throw new ArithmeticException("Input should be number 2 to 6, try again...\n");
                    		
                    		
                    		}
                    	
                    	}
                    	
                    	//if input is not integer, keep looping
                        catch (Exception e) {
                            
                       	 System.out.println("Input should be number 2 to 6, try again...\n");
                       	 scanner.nextLine();
                       	 continue;
                            
                        }
                    	
                    	
                    	//input is valid, break loop
                    	break;
                    	
                    }  
                    
                    
                    
                    gc.gameStart(numOfPlayer);
                    started = false;
                    break;

                    
                    
                //"2.Load game"
                case "2":


                  
                    break;


                //"3.How to play"
                case "3":


                    break;
                    
                    
                //validation
                default:
                	
                	System.out.println("Wrong input, try again...\n");	
                	

            }
            
        }


    }


}

