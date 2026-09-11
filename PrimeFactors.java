import java.util.*;

class PrimeFactors
{
    int n;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        n = conin.nextInt();
    }

    void display()
    {
        getData();

        int temp = n;

        System.out.print("Prime Factors: ");

        for(int i = 2; i <= temp; i++)
        {
            while(temp % i == 0)
            {
                System.out.print(i + " ");
                temp = temp / i;
            }
        }
    }
}

class PrimeFactorsDemo
{
    public static void main(String args[])
    {
        PrimeFactors ob = new PrimeFactors();
        ob.display();
    }
}
