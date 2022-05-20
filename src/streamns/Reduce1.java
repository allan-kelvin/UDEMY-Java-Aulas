/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamns;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author Allan.Kelvin.Santos
 */
public class Reduce1 {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        
        BinaryOperator<Integer> soma = (ac,n) -> ac +n;
        
        int total = nums.stream().reduce(soma).get();
        System.out.println(total);
    }
    
}
