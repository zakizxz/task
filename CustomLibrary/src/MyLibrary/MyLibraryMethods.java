/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibrary;

import java.util.ArrayList;

/**
 *
 * @author as
 */
public class MyLibraryMethods implements MapFunction{
    
        public static ArrayList map_method(MapFunction f,ArrayList<Object> arr ){
        ArrayList<Object> output_arr = new ArrayList<>();
        
        if(arr.get(0) instanceof Integer){
            for(int i = 0; i<arr.size(); i++){
                output_arr.add(f.map(Integer.parseInt(arr.get(i).toString()))); 
            }
       
        }
        if(arr.get(0) instanceof String){
            for(int i = 0; i<arr.size(); i++){
                output_arr.add(f.map((arr.get(i).toString()))); 
            }
        }
        return output_arr; 
    }

    @Override
    public int map(int input) {
        return input * input;
    }

    @Override
    public String map(String input) {
        return input+input;
    }
    
    
}
