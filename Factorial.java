import java.util.*;

class Factorial
{
    int n;
    long fact = 1;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        n = conin.nextInt();
    }

    void calculate()
    {
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Factorial = " + fact);
    }
}

class FactorialDemo
{
    public static void main(String args[])
    {
        Factorial ob = new Factorial();
        ob.display();
    }
}
