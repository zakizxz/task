/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        public static ArrayList filter_method(MapFunction f,ArrayList<Object> arr ){
        ArrayList<Object> output_arr = new ArrayList<>();
        
        if(arr.get(0) instanceof Integer){
            for(int i = 0; i<arr.size(); i++){
               int odd_even = f.filterOdd(Integer.parseInt(arr.get(i).toString()));
                    if(odd_even == 0){
                    }
                    else{
                        output_arr.add(odd_even); 
                    }
                    
            }
       
        }
        return output_arr; 
    }
        public static float reduce_method(MapFunction fun,ArrayList<Object> arr,ArrayList<Object> arr1,String operator  ){
        float result = 0;
        ArrayList<Object> merged_arr = new ArrayList<>();
        
        for(int i=0; i<arr.size(); i++){
            merged_arr.add(arr.get(i)); 
        }
        for(int j=0; j<arr1.size(); j++){
            merged_arr.add(arr.get(j));
        }
        
//            for(int x =0; x<merged_arr.size(); x++){
                if(operator =="+"){
                
                result = fun.reduce_sum(merged_arr);
                }
                if(operator =="-"){
                }
                if(operator=="*"){
                    result = fun.reduce_multiply(merged_arr); 
                }
                if(operator=="/"){}
                
//            }
        
        
//        int size_of_1 = arr.size();
//        int size_of_2 = arr1.size();
//        int enabled = 0;
//        
//        if(size_of_1 >size_of_2){
//            for(int i=0; i<size_of_1; i++){
//                arr.add(arr1.get(i));
//            }
//           enabled = 0;
//        }
//        else if(size_of_2 >size_of_1){
//            for(int i=0; i<size_of_2; i++){
//                arr1.add(arr.get(i));
//            }
//            enabled = 1;
//            
//        }
//        else if(size_of_2 == size_of_1) {
//            for(int i=0; i<size_of_2; i++){
//                arr1.add(arr.get(i));
//            }
//            enabled = 0;
////            return arr1;
//        }
//        if(enabled ==0){
////            Use arr1 as it hasboth arrays concatenated
//            reduce_calculation(f,arr1,operator);
//        }
//        if(enabled ==1){
////            Use arr as it hasboth arrays concatenated
//            reduce_calculation(f,arr,operator);
//        }
        return result;
    }
      

    
        
// Interfaces Overriding Below        
        
    @Override
    public int map(int input) {
        return input * input;
    }

    @Override
    public String map(String input) {
        return input+input;
    }
    
    @Override
    public int filterOdd(int input){
        
        if(input% 2 != 0)
         return input;
        else return 0;
         }

    @Override
    public int reduce_sum(ArrayList<Object> input) {
        int sum_result=0;
        for(int i=0; i<input.size(); i++){
            sum_result= sum_result+ (int)input.get(i); 
        }
        return sum_result;
    }

    @Override
    public int reduce_multiply(ArrayList<Object> input) {
        int product_result=1;
        for(int i=0; i<input.size(); i++){
            product_result= product_result* (int)input.get(i); 
        }
        return product_result;
    }
    
}
