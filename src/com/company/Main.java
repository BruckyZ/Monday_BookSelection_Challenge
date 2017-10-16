package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {


        Scanner scan = new Scanner(System.in);
        int size = 25;
        int counter = 0;

        String Description;
        String Quit = "";
        String Tittle[] = new String[size];
        String Authour[] = new String[size];
        String Descriptions[] = new String[size];

        while (!Quit.equalsIgnoreCase("Quit"))// This mean until the client says Quit then continue aswking for tittle, but if you sayQuit then go to the for loop and give the output result. So the while loop continue until you says Quit.
        {
            System.out.print("Enter a Book Tittle: ");
            Tittle[counter] = scan.nextLine();

            System.out.print("Enter a Book Authour: ");
            Authour[counter] = scan.nextLine();

            System.out.print("Enter a Book Descriptions: ");
            Descriptions[counter] = scan.nextLine();

            System.out.print("Do you want to continue Yes/Quit: ");
            Quit=scan.nextLine();
            counter++;
        }

        for (int i=0; i< counter; i++) // counter-1 is to avoid the println result

        {
            System.out.print("The tittle of the book is: " + Tittle[i]); //Note if you said system.out.PRINT only then it will print in one line but println will print downwards..
            System.out.print("    ");
            System.out.print("The tittle of the Authour is: " + Authour[i]);
            System.out.print("    ");
            System.out.print("The tittle of the Descriptions is: " + Descriptions[i]);

        }
    }
}

