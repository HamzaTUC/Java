package awais;

import java.util.Scanner;

public class Stars
{
    public static void main(String args[])
    {
        int i, j=1,x, k=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        x = scan.nextInt();
        for(i=1; i<=x; i++)
        {
            for(j=-1;j<=x-2*i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            while(k <(i))
            {
                System.out.print(" ");
                k++;}
            k = 0;
            
        }
    }}
