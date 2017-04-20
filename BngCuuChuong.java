/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bngcuuchuong;

import java.util.Scanner;

/**
 *
 * @author NTComputer
 */
public class BngCuuChuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.println("Hien ra bang cuu chuong khi nhap mot so nguyen tu ban phim");
        System.out.println("Nhap vao so nguyen tư 1 den 10: ");
        Scanner ban_phim = new Scanner( System.in );
        n= ban_phim.nextByte();
        for(int i=1;i<=10;i++)
        {
            System.out.println("" + n +" x "+ i + " = " +n*i);
        }
        
        // TODO code application logic here
    }
    
    
}
