/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.easyproblem;

/**
 *
 * @author Islam Mohamed
 */
import java.util.*;

public class EasyProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte n,sum=0;
        byte[] arr = new byte[105];
        n = scan.nextByte();
        for (byte i = 0; i < n; i++) {
            arr[i] = scan.nextByte();
            if(arr[i]>=1){
                sum++;
            }
        }
        if(sum>0){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }

    }
}
