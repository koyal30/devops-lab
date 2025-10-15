import java.util.*;

class FahrenheittoCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        System.out.println("Enter Temperature in Fahrenheit:" + temp);
        temp = (((temp - 32) * 5) / 9);
        System.out.println("Temperature in celcius:" + temp);

        sc.close();

    }

}