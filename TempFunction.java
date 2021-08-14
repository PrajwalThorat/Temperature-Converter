import java.util.Scanner;

public class TempFunction{


    public static float celsiusToFahrenheit(float c) {
        float f = (float) ((1.8 * c) + 32);
        return f;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char ans;

        do
        {     
            System.out.print("Enter the Tempreture in Degree Celsius: ");
            float C = scanner.nextInt();
            float F = celsiusToFahrenheit(C);
            System.out.println("Tempreture(Celsius) = " + C + "    Tempreture(Fahrenheit)= " + F);
            System.out.print("Do you Convert Celsius to Farenheit (y/n) : ");
            ans = scanner.next().charAt(0);
            

        }while(ans == 'y' || ans == 'Y');
        System.out.println("Thank you !! ");

    }
}