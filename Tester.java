/* In the name of Allah                     
*  Master Name: Ali Rezaei
*  Student Name: Mostafa Khawari
*/
package DeQue;

import java.util.Scanner;

public class Tester
{
	public static void main ( String[] args )
	{
        Scanner input = new Scanner(System.in);
                
        // make an empty ArrayList
		DeQue deque = new DeQue ();
                
                System.out.print("                      << In The Name Of Allah >>\n");
                // insert data to DeQue
                String data= "";
                boolean runLoop = true;
                do{
                    printMenu();
                    // get user's selection
                    int select = input.nextInt();

                    input.nextLine();
                    System.out.println();
                    switch(select){
                        //Show the Elements of DeQue 
                        case 1:
                            deque.showDeQue();
                            break;
                        //Object at the Front of the DeQue
                        case 2:
                            System.out.println(deque.getFront());
                            break;
                        //Object at the Back of the DeQue 
                        case 3:
                            System.out.println(deque.getBack());
                            break;
                        //Number of Elements
                        case 4:
                            System.out.println("Size of DeQue: "+ deque.getSize());
                            break;
                        //DeQue is Empty ???  
                        case 5:
                            if(deque.isEmpty())
                                System.out.println("Yes, DeQue is Empty !");
                            else
                                System.out.println("No, DeQue is NOT Empty !");
                            break;
                        //Insert new Element [Front of DeQue]
                        case 6:
                            System.out.print("Enter Data: ");
                            data = input.nextLine();
                            deque.pushFront(data);
                            break;
                        //Insert new Element [Back of DeQue]
                        case 7:
                            System.out.print("Enter Data: ");
                            data = input.nextLine();
                            deque.pushBack(data);
                            break;
                        //Remove the Element [Front of DeQue] 
                        case 8:
                            deque.popFront();
                            break;
                        //Remove the Element [Back of DeQue]
                        case 9:
                            deque.popBack();
                            break;
                        //Empties the DeQue     
                        case 10:
                            deque.clear();
                            System.out.println("The DeQue cleared :) ");
                            break;
                        //Exit the programe
                        case 0:
                            System.out.println("                  *************");
                            System.out.println("                  * Good Bye! *");
                            System.out.println("                  *************");
                            runLoop = false;
                            break;
                        default:
                            System.out.println(">>> Enter Correct Number plz :)) ");
                    }
                }while(runLoop); // end do_while Loop
	}// end main method
        
        public static void printMenu() {
        System.out.println();
        System.out.println(" _________________________________________");
        System.out.println("| 1) Show DeQue                           |");
        System.out.println("| 2) Object at Front of  DeQue            |");
        System.out.println("| 3) Object at Back of  DeQue             |");
        System.out.println("| 4) Number of Elements                   |");
        System.out.println("| 5) DeQue is Empty ???                   |");
        System.out.println("| 6) Insert new Element [Front of DeQue]  |");
        System.out.println("| 7) Insert new Element [Back of DeQue]   |");
        System.out.println("| 8) Remove the Element [Front of DeQue]  |");
        System.out.println("| 9) Remove the Element [Back of DeQue]   |");
        System.out.println("| 10) Empties the DeQue                   |");
        System.out.println("| 0) Exit                                 |");
        System.out.println(" _________________________________________");
        System.out.print(">>> Please enter a number between (0) & (10): ");
    } // end printMenu method
}// end class