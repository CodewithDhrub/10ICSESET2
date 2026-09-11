import java.util.*;

class DigitSum
{
    int n;
    int sum = 0;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        n = conin.nextInt();
    }

    void calculate()
    {
        int temp = n;

        while(temp > 0)
        {
            int digit = temp % 10;

            sum = sum + digit;

            temp = temp / 10;
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Sum of digits = " + sum);
    }
}

class DigitSumDemo
{
    public static void main(String args[])
    {
        DigitSum ob = new DigitSum();
        ob.display();
    }
}
