package awais;

import java.util.Scanner;

public class StarsL
{
    public static void main(String args[])
    {
        int m,i,l=3, j=1,x, k=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        x = scan.nextInt();
        for (i=1; i<x-2;i++)
        {
            for(j=0;j<2*i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
            while(k <(2*i))
            {
                System.out.print("*");
                k++;}
            System.out.println();
            k = 0;}

            while (l>x-i && l<x+1 )
            {
                System.out.print("*");
           l++;
            while ( l>=x &&l<2*x) {
            	System.out.println();
            	System.out.print("*");
            
            }}
            
                       
             
    
}}
            
        
