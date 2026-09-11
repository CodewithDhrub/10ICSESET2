import java.util.*;

class HCF
{
    int a, b;
    int hcf = 1;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter first number: ");
        a = conin.nextInt();

        System.out.print("Enter second number: ");
        b = conin.nextInt();
    }

    void calculate()
    {
        int limit;

        if(a < b)
            limit = a;
        else
            limit = b;

        for(int i = 1; i <= limit; i++)
        {
            if(a % i == 0 && b % i == 0)
                hcf = i;
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("HCF = " + hcf);
    }
}

class HCFDemo
{
    public static void main(String args[])
    {
        HCF ob = new HCF();
        ob.display();
    }
}
