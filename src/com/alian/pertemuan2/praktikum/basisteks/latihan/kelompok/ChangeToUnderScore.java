package com.alian.pertemuan2.praktikum.basisteks.latihan.kelompok;

import java.io.*;
public class ChangeToUnderScore
{
    public ChangeToUnderScore(String sumber, String tujuan)
    {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(sumber);
        }catch(FileNotFoundException ex)
        {
            System.out.println("File Not Found");
        }

        try
        {
            char data;
            int temp;
            FileOutputStream fos;
            fos = new FileOutputStream(tujuan);
            do
            {
                temp = fis.read();
                data = (char)temp;
                if(temp != -1)
                {
                    try
                    {
                        if((char)temp == ' ')
                        {
                            data = '_';
                            fos.write(data);
                        }else
                        {
                            fos.write(data);
                        }
                    }catch(FileNotFoundException ex)
                    {
                        System.out.println("File Cannot be opened for writing");
                    }
                }
            }while(temp != -1);

        } catch(IOException ex)
        {
            System.out.println("Problem for reading of this file");
        }
    }

    public static void main(String args[]) throws IOException
    {
        System.out.println("What is the name of the source file ?");
        String sumber;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sumber = br.readLine();
        System.out.println("Enter data to write to "+sumber+"...");
        System.out.println("What is the name of the aim file ?");
        String tujuan;
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        tujuan = bd.readLine();
        System.out.println("Enter data to write to "+tujuan+"...");
        new ChangeToUnderScore(sumber,tujuan);
    }
}