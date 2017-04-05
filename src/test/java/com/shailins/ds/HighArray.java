package com.shailins.ds;

/**
 * Created by chandrad on 4/4/17.
 */
public class HighArray {

    private long[] a ;
    private int nElems ;


    public HighArray(int max) {
        a = new long[max];
        nElems = 0 ;
    }

    public boolean found(long searchKey){
        int i ;
        for (i=0;i<nElems;i++)
            if (a[i]==searchKey)
                break;



            if (i == nElems)
            {  System.out.println("can not find : " + searchKey);
                return false;}
        else
                return  true;

    }

    public void insert(long value){

        a[nElems] = value;
        nElems++ ;
    }

    public boolean delete(long value){

        int i ;
        for (i=0;i<nElems;i++)
            if (a[i]==value)
                break;

        if (i == nElems)
        {      System.out.println("can not find : " + value);
            return false;}
        else
        {
            for (int j=0;j<nElems;j++)
                a[i] = a[i+1];
                nElems--;
                return true ;
        }
    }

    public void display()
    {
        for (int i=0;i<nElems;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println('\n');
    }


}
