/* In the name of Allah                     
*  Master Name: Ali Rezaei
*  Student Name: Mostafa Khawari
*/
package DeQue;

import java.util.ArrayList;

public class DeQue {

    private ArrayList<String> list;
    
    //new ArrayList
    public DeQue() {
        this.list = new ArrayList<>();
    }
    
    //Print the list of DeQue
    public void showDeQue(){
        if(isEmpty())
            System.out.println("# The DeQue is Empty !");
        else{
            System.out.print("Front of DeQue >> ( ");
            for(int i=0; i<list.size(); i++){
                if(i == list.size() - 1)
                    System.out.print(list.get(i));
                else
                    System.out.print(list.get(i) + " , ");
            }
            System.out.println(" ) << Back of DeQue.");
        }
    }//end showDeQue
    
    //Print Object at the Front of the DeQue
    public String getFront() {
        String message = "";
        if (isEmpty())
            message  = "# The DeQue is Empty !";
        else 
            message = "Front of DeQue: " + list.get(0);
        
        return message;
    }//end getFront
    
    //return Object at the Back of the DeQue 
    public String getBack() {
        String message = "";
        if (isEmpty())
            message  = "# The DeQue is Empty !";
        else 
            message = "Back of DeQue: " + list.get(list.size() - 1);
        
        return message;
    }//end getBack
    
    //return size of DeQue list
    public int getSize() {
        return list.size();
    }//end getSize

    //return boolean answer 
    //DeQue list is empty or no??
    public boolean isEmpty() {
        return list.isEmpty();
    }//end isEmpty

    //Insert new Element [Front of DeQue]
    public void pushFront(String data) {
        list.add(0, data);
    }//end pushFront

    //Insert new Element [Back of DeQue]
    public void pushBack(String data) {
        list.add(list.size(), data);
    }//end pushBack

    //Remove the Element [Front of DeQue] 
    public void popFront() {
        if (isEmpty())
            System.out.println("# DeQue UnderFlow !");
        else {
            System.out.println(getFront()+ " Removed :)");
            list.remove(0);
        }
    }//end popFront

    //Remove the Element [Back of DeQue]
    public void popBack() {
        if (isEmpty())
            System.out.println("# DeQue UnderFlow !");
        else{
            System.out.println(getBack()+ " Removed :)");
            list.remove(list.size() - 1);
        }
    }//end popBack

    //Clear all of the element at DeQue list
    public void clear() {
        list = new ArrayList<>();
    }//end Clear
    
}// end class