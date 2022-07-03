package com.company;

public class CWH_29_CH6_ps {
    public static void main(String[] args) {
        // Q.1 pp
//        float [] marks= {45.7f, 67.7f, 78.9f, 56.7f, 85.6f};
//        float sum=0;
//        for (float element: marks)
//        {
//            sum = sum + element;
//        }
//        System.out.println("The value of sum is "+sum);

        // Q.2 pp
//        float [] marks= {45.7f, 67.7f, 78.9f, 56.7f, 85.6f};
//        float num= 45.7f;
//        boolean isInArray = false;
//        for (float element: marks)
//        {
//            if (num==element){
//                isInArray=true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else{
//            System.out.println("The value is not present in array");
//        }

//         Q.3 pp
//        float [] marks= {45.7f, 67.7f, 78.9f, 56.7f, 85.6f};
//        float sum=0;
//        for (float element: marks)
//        {
//            sum = sum + element;
//        }
//        System.out.println("The value of average is "+sum/marks.length);

//        Q.4 pp
//        int [][] mat1 = {{1,2,3},
//                        {4,5,6}};
//
//        int [][] mat2 = {{1,2,3},
//                        {4,5,6}};
//
//        int [][] result = {{0,0,0},
//                          {0,0,0}};
//
//        for (int i=0; i<mat1.length; i++)
//        {
//            for (int j=0; j<mat1[i].length; j++)
//            {
//                result [i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        for (int i=0; i<mat1.length; i++)
//        {
//            for (int j=0; j<mat1[i].length; j++)
//            {
//                System.out.print(result[i][j] + " ");
//                result [i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println("");
//        }

//        Q.5 pp
//        int [] arr = {1,2,3,4,6};
//        int l = arr.length;
//        int n = Math.floorDiv(arr.length,2);
//        int temp;
//        for (int i=0; i<n; i++)
//        {
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int element:arr)
//        {
//            System.out.println(element+" ");
//        }

//        Q.6 pp
//        int [] arr = {1,2,3,44,6};
//        int max=-2147483648;
//        for (int e:arr)
//        {
//            if (e>max)
//            {
//                max=e;
//            }
//        }
//        System.out.println("The value of the maximum element is: "+max);

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

//        Q.7 pp
//        int [] arr = {1,2,3,44,6};
//        int min=2147483647;
//        for (int e:arr)
//        {
//            if (e<min)
//            {
//                min=e;
//            }
//        }
//        System.out.println("The value of the minimum element is: "+min);

//        Q.8 pp
        boolean isSorted= true;
        int [] arr = {1,2,3,4,6};
        for (int i=0; i<arr.length-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                isSorted=false;
                break;
            }
        }
        if (isSorted)
        {
            System.out.println("The array is sorted");
        }
        else
        {
            System.out.println("The array is not sorted");
        }


    }
}
