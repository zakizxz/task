/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import MyLibrary.MapFunction;
import MyLibrary.MyLibraryMethods;
import java.util.ArrayList;

/**
 *
 * @author as
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyLibraryMethods custom_lib = new MyLibraryMethods();
        
        ArrayList<Object> int_list = new ArrayList<>();
        int_list.add("aab");
        int_list.add("babb");
        int_list.add("dede");
        int_list.add("swww");
        int_list.add("aqwe");
        
         ArrayList<Object> in_list = new ArrayList<>();
        in_list.add(1);
        in_list.add(2);
        in_list.add(3);
        in_list.add(4);
        in_list.add(5);
        
        MapFunction ml = new MyLibraryMethods();
        System.out.println(custom_lib.map_method(ml,in_list));
        System.out.println(custom_lib.map_method(ml,int_list));
        
        
//        System.out.println(custom_lib.map_method(ml,int_list));
        
    }
    
}
