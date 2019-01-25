import java.util.*;

class AddInputs
{
  public static void main(String args[])
  {
    int x, y, z;
    
    System.out.println("Enter two integers to calculate their sum");
    Scanner scan = new Scanner(System.in);
    {
 boolean inputAccepted = false;
        while (!inputAccepted)
        {
            try
            {
                System.out.print("Please enter a number to start the program, the next two numbers after that are the ones that you are adding (Its a feature, not a bug) : ");
                Integer.valueOf(scan.nextLine());
                inputAccepted = true;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Not a valid number.");
            }
        }
        
    
    x = scan.nextInt();
    y = scan.nextInt();
    z = x + y;
    
    System.out.println("Sum of the integers =" + z);
  }
}
}