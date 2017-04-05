package com.shailin.practice.tests;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by chandrad on 3/31/17.
 */
public class DsAlgo {


    public void minSum(int[] arr){

        int l = arr.length;
        Arrays.sort(arr);

        int[] aux1 = new int[l/2];
        int[] aux2 = new int[l/2];

        for (int i = 0 ; i < ((l/2));i++)
        {
            aux1[i] = arr[2*i];
            aux2[i] = arr[2*i + 1];
        }

        for (int a :aux1
             ) {
            System.out.println(a);
        }
        for (int b :aux2
                ) {
            System.out.println(b);
        }
    }

    @Test
    public void testb(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        minSum(arr);
    }


    public void sumint(String str){

        str = str.replaceAll("[^-?0-9]+", " ");

        System.out.println(str);
        System.out.println(Arrays.asList(str.trim().split(" ")));


//        int len = str.length();
//        int unitCnt = 1;
//        int num = 0;
//        List<Character> list = new ArrayList();
//
//
//        char[] ch = str.toCharArray();
//
//        for (int i = 0; i<ch.length;i++){
//
//            if (ch[i] >= 48 && ch[i] <= 57){
//             //   System.out.println(ch[i]);
//                list.add(ch[i]);
//            }
//        }
//
//        for (char c :list
//             ) {
//            System.out.println(c);
//        }


//        for ( int a : str.toCharArray()) {
//
//            if (Character.isDigit(a)){
//                System.out.println(Character.getNumericValue(a)) ;
//            }
//        }


//        for (int i = 0 ; i < len ; i++){
//
//           // System.out.println(str.charAt(i) -'0' - 4);
//
//           if(str.charAt(i) >= 48 && str.charAt(i) <= 57);
//                System.out.println(str.charAt(i));
//             //   list.add((int) str.charAt(i));
//
//
//        }

    }

    @Test
    public void testa(){
        sumint("abc234de-34v45gf6");
    }

    public void bubblesort(int[] arr){


        for (int i = 0; i < arr.length; i++){

            for (int j = i + 1; j < arr.length; j++){

                if (arr[i] > arr[j] ){
                    System.out.println(i + "and" + j);

                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];

                }
            }
        }

        for ( int a : arr) {
            System.out.print(a + " " );
        }

    }

    public void swap3(int x , int y){

       int temp = x ;
        x = y ;
        y = temp ;

        System.out.println("After swap the numbers are : " +  x + ":" +   y );

    }

    public void swap(int x , int y){

        x = x + y ;
        y = x - y ;
        x = x - y ;

        System.out.println("After swap the numbers are : " +  x + ":" +   y );

    }


    boolean isPalindrome(String str) {
        int n = str.length();
        for( int i = 0; i < n/2; i++ )
            if (str.charAt(i) != str.charAt(n-i-1)) return false;
        return true;
    }

    @Test
    public void someTest() {

        int[] d = new int[]{2,2,4,5,6,7,1};

        bubblesort(d) ;

//        String numStr = "abc234de34fgt3";
//
//        int j = 0;
//        int[] sum = new int[numStr.length()];
//        int num;
//        int unitCnt = 1;
//        Set sets = null;
//        for (int i = 0; i < numStr.length(); i++) {
//
//            sets = null;
//            if (numStr.charAt(i) > '0' && numStr.charAt(i) < '9') {
//                System.out.println(numStr.charAt(i));
//                sets = new HashSet();
//                sets.add(numStr.charAt(i));

//            }
      //  }
 //       System.out.println(sets);
    }








    public boolean isPrime(int n ){

        int divisor = 2 ;

        while (divisor < n){

            if (n%divisor==0)
               return false;
                divisor++;
        }

        return true;

    }

    @Test
    public void check(){

      System.out.println(isPalindrome("qwewq")) ;
   //     System.out.println(isPrime(71));
   //     getAllPrime(223);

    }

    public void getAllPrime(int n){

        int i = 2;
        while (i <= n){
            if (isPrime(i))
                System.out.println( i + " is a prime number");
            i++;
        }
    }
}
