import java.util.*;

class BinaryDecimal
{
    int n;
    int decimal = 0;
    int power = 0;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter a binary number: ");
        n = conin.nextInt();
    }

    void calculate()
    {
        int temp = n;

        while(temp > 0)
        {
            int digit = temp % 10;

            decimal = decimal + digit * (int)Math.pow(2, power);

            power++;

            temp = temp / 10;
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Decimal = " + decimal);
    }
}

class BinaryDecimalDemo
{
    public static void main(String args[])
    {
        BinaryDecimal ob = new BinaryDecimal();
        ob.display();
    }
}
