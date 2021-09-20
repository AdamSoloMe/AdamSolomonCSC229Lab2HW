
    import java.util.Scanner;
    public class LargestProduct {
        public static void main(String[] args) {
            System.out.println("Please enter a Size for the array");
            Scanner input=new Scanner(System.in);
            int UserInt= input.nextInt();
            System.out.println("Now,Please enter a list of integers for the array");
            int[] User_int_list=new int[UserInt];
            for (int i=0;i<User_int_list.length;i++){
                int UserValues=input.nextInt();
                User_int_list[i]=UserValues;
            }

            int Largest_value=User_int_list[0];
            int Second_Largest_value=User_int_list[1];

            if (Largest_value<Second_Largest_value){
                Largest_value=User_int_list[1];
                Second_Largest_value=User_int_list[0];
            }

            for(int i=2;i<User_int_list.length;i++) {

                if (User_int_list[i] > Largest_value) {
                    Second_Largest_value = Largest_value;
                    Largest_value = User_int_list[i];
                } else if (User_int_list[i] > Second_Largest_value) {
                    Second_Largest_value = User_int_list[i];
                }

            }
            System.out.println("The Two Largest Intergers in this sequence are "+Largest_value+" amd "+Second_Largest_value);
            System.out.println("the Maximum Product of this sequence is "+Largest_value*Second_Largest_value);
            //The reason that this solution Above is better than O(n^2) is because it returns the Maximum/Largest Product of the Given Array
            //in Linear time O(N), Where I use only a single for loop to compare The Value stored in each position within the array
            // with the Value Stored in the Following Position to determine which Two numbers are the Largest in the given array.
            //Then Once I Have Found the The Two Largest Numbers in the given Array I Multiply them Only Once to ultimately get the largest possible product of the array.
            //This is Much more time efficient than having Teo nested for loopss Because For each iteration of the For loop the Result will increase linearly until the Two Largest numbers in the given array are Found
            //and then once they are found The program will only do a single calculation to find the Product From them which would be the largest of the array.
            //While if I decided to Use Two nested For loops O(N^2) I would be taking the Value of Position I within the Array From an outer For loop
            //and then the Value of Position I+1 within the Array from a Nested/inner for loop,
            //and then I would be Multiplying them for every single iteration of the For Loops and Comparing the Product with the Previously Largest Product from the Given array
            // to determine which Product is the Largest From the array.
            //Which Would be less time efficient than my solution
            // because It would be in quadratic time or O(N^2) since for each iteration of the For loops the Result would be increasing Exponeitally
            //Until the Largest/Maximum Product of the Array is found.


        }




    }



}
