/**
 *
 * @author omar tamtom
 */
import java.util.Scanner;

public class Main {

    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
       
        for (int i = 1 ; i <=10 ; i++){
            int sum =  0 ; 
            int arr[] =new int [i];
            for (int j = 1,k=0; k < arr.length; j++,k++) {
                 sum+=j; //get the sum of the current loop 
                 arr[k]=j; //fill the array by the sequence of the loop 
                
            }
            int index = 0 ;//to control the index 
            while(true){
                System.out.print("S"+i+" = "+arr[index]+(index+1<arr.length?"+":" = "+sum));//if the the next index will outofbound give me the sum otherwise continue summation 
                index++;
                while(index<arr.length){
                    System.out.print(arr[index]+""+(index+1<arr.length?"+":" = "+sum));//while the index does not exceded keep summing otherwise give me the sum 
                    index++;
                }
                System.out.println("");break;
            }
            
        }//outer loop
    }
}
