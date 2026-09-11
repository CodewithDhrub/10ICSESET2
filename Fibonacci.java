import java.util.*;

class Fibonacci
{
    int n;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter number of terms: ");
        n = conin.nextInt();
    }

    void display()
    {
        getData();

        int a = 0;
        int b = 1;
        int c;

        System.out.print("Fibonacci Series: ");

        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }
}

class FibonacciDemo
{
    public static void main(String args[])
    {
        Fibonacci ob = new Fibonacci();
        ob.display();
    }
}
