/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

List<String> list = new ArrayList<String>();
list.add("b");
list.add("a");
list.add("c");
Collections.sort(list);
System.out.println(list.get(0));


 ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(36);
        nums.add(73);
        nums.add(40);
        nums.add(1);
        
        Collections.sort(nums);
        System.out.println(nums);
        
        Scanner scanner = new Scanner(System.in);
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            //your code goes here
            nums.add(num);
        }
        
        //your code goes here
        System.out.println(Collections.max(nums));

        System.out.println(Collections.min(nums));
    
    }
    }


