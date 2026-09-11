import java.util.*;

class DigitProduct
{
    int n;
    int product = 1;

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

            product = product * digit;

            temp = temp / 10;
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Product of digits = " + product);
    }
}

class DigitProductDemo
{
    public static void main(String args[])
    {
        DigitProduct ob = new DigitProduct();
        ob.display();
    }
}
