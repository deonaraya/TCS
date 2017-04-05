package com.shailins.ds;

/**
 * Created by chandrad on 4/5/17.
 */
public class HighArrayApp {


    public static void main(String[] args){

        HighArray array = new HighArray(100);

        array.insert(21);
        array.insert(12);
        array.insert(13);
        array.insert(2);
        array.insert(332);

        array.display();

        array.delete(12);

        array.display();


    }
}
