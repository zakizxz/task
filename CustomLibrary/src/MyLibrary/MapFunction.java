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
public interface MapFunction {
    
    int map(int input);
    
    String map(String input);

    int filterOdd(int input);
    
    int reduce_sum(ArrayList<Object> input);
    
    int reduce_multiply(ArrayList<Object> input);
    
}
