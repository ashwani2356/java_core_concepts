package Array;

import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {

//        int arr[]=new int[4];

//        int arr[]; //declaration
//        arr=new int[4]; //creation
//        // initialization
//        arr[0]=101;
//        arr[1]=102;
//        arr[2]=103;
//        int arr[]={101,102,103};
        // retrieve
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr.length);

//        int brr[]=new int[4];
//        brr[0]=12;
//        brr[1]=13;
//        brr[2]=14;
//        brr[3]=15;
//        for(int i=0;i< brr.length;i++){
//            System.out.println(brr[i]);
//            for(int result : brr){
//                System.out.println(result);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();

        System.out.println("your elements are");
        for(int i=0;i<size;i++)
            System.out.println(arr[i]+" ");
        }
    }

