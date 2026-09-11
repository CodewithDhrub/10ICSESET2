import java.util.*;

class LCM
{
    int a, b;
    int lcm;

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
        int max;

        if(a > b)
            max = a;
        else
            max = b;

        lcm = max;

        while(true)
        {
            if(lcm % a == 0 && lcm % b == 0)
                break;

            lcm++;
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("LCM = " + lcm);
    }
}

class LCMDemo
{
    public static void main(String args[])
    {
        LCM ob = new LCM();
        ob.display();
    }
}
