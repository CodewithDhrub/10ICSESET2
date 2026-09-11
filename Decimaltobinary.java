import java.util.*;

class DecimalBinary
{
    int n;
    int binary = 0;
    int place = 1;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter a decimal number: ");
        n = conin.nextInt();
    }

    void calculate()
    {
        int temp = n;

        while(temp > 0)
        {
            int rem = temp % 2;

            binary = binary + rem * place;

            place = place * 10;

            temp = temp / 2;
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Binary = " + binary);
    }
}

class DecimalBinaryDemo
{
    public static void main(String args[])
    {
        DecimalBinary ob = new DecimalBinary();
        ob.display();
    }
}
