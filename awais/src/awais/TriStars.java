package awais;

import java.util.Scanner;

public class TriStars
{
    public static void main(String args[])
    {
        int i, j,x, k=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        x = scan.nextInt();
        for(i=1; i<=x-2; i++)
        {
            for(j=2; j<(x-i); j++)
            {
                System.out.print("  ");
            }
            while(k <(2*i-1))
            {
                System.out.print("* ");
                k++;}
            k = 0;
            System.out.println();
        }
    }}
