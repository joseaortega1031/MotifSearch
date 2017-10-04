/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motifsearch;
import java.util.*;
/**
 *
 * @author Joey
 */
public class MotifSearch {
    /**
     * @param args the command line arguments
     */
    public ArrayList<String> combinationMaker(){
        char[] dnaString= {'A','C','T','G'};
        ArrayList<String> string1= new ArrayList<String>();  
        for(char a: tang){
            for(char b : tang){
                for(char c: tang){
                    for(char d : tang){
                         String somethingBig = (a+""+b+""+c+""+d);
                         string1.add(somethingBig);                                               
                    }
                }
            }
        }
        return string1;
    }  
    
    public static void main(String[] args) {
        MotifSearch hello = new MotifSearch();
        hello.combinationMaker();
        ArrayList<String> hi = hello.combinationMaker();
        System.out.println("List of all the combinations:\n"+hi);       
        System.out.println("Total combination size: "+hi.size());       
        ArrayList<String> answers= new ArrayList<String>();
        ArrayList<String> answers1= new ArrayList<String>();
        ArrayList<String> answers2= new ArrayList<String>();
        ArrayList<String> answers3= new ArrayList<String>();      
        //"AAAAAAAAAA"
        String input1= "ACTGACGCAG";
        ArrayList<String> in1 = new ArrayList<String>();        
        int start=0;
        for(int i=0; i<7;i++){
            String newt=input1.substring(start,start+4);
            start=start+1;
            in1.add(newt);
        }
        start=0;
        ArrayList<String> in2 = new ArrayList<String>();
        String input2= "TCACAACGGG";
         for(int i=0; i<7;i++){
            String yellow=input2.substring(start,start+4);
            start=start+1;
            in2.add(yellow);
        }
         start=0;
         ArrayList<String> in3 = new ArrayList<String>();
        String input3="GAGTCCAGTT";
         for(int i=0; i<7;i++){
            String red=input3.substring(start,start+4);
            start=start+1;
            in3.add(red);
        }
        int counter=0;
        for(int i=0;i<hi.size();i++){
            for(int j=0;j<in1.size();j++){
                if(hi.get(i).charAt(0) == in1.get(j).charAt(0)){
                    counter++;
                }
                if(hi.get(i).charAt(1)==in1.get(j).charAt(1)){
                    counter++;
                }
                if(hi.get(i).charAt(2)==in1.get(j).charAt(2)){
                    counter++;
                }
                if(hi.get(i).charAt(3)==in1.get(j).charAt(3)){
                    counter++;
                }
                if(counter>=3){
                    if(!answers1.contains(hi.get(i))){
                        answers1.add(hi.get(i)); 
                    }
                }
                counter=0;
                }
        }
        for(int i=0;i<hi.size();i++){
            for(int j=0;j<in2.size();j++){
                if(hi.get(i).charAt(0) == in2.get(j).charAt(0)){
                    counter++;
                }
                if(hi.get(i).charAt(1)==in2.get(j).charAt(1)){
                    counter++;
                }
                if(hi.get(i).charAt(2)==in2.get(j).charAt(2)){
                    counter++;
                }
                if(hi.get(i).charAt(3)==in2.get(j).charAt(3)){
                    counter++;
                }
                if(counter>=3){
                    if(!answers2.contains(hi.get(i))){
                        answers2.add(hi.get(i)); 
                    }
                }
                counter=0;
                }
        }
        for(int i=0;i<hi.size();i++){
            for(int j=0;j<in1.size();j++){
                if(hi.get(i).charAt(0) == in3.get(j).charAt(0)){
                    counter++;
                }
                if(hi.get(i).charAt(1)==in3.get(j).charAt(1)){
                    counter++;
                }
                if(hi.get(i).charAt(2)==in3.get(j).charAt(2)){
                    counter++;
                }
                if(hi.get(i).charAt(3)==in3.get(j).charAt(3)){
                    counter++;
                }
                if(counter>=3){
                    if(!answers3.contains(hi.get(i))){
                        answers3.add(hi.get(i)); 
                    }
                }
                counter=0;
                }
        }
        for(String index: answers1){
            if(answers2.contains(index)){
                if(answers3.contains(index)){
                    if(!answers.contains(index)){
                        answers.add(index);
                    }
                }
            }
        }
        System.out.println("The set of substrings in Input 1: "+in1);
        System.out.println("The set of substrings in Input 3: "+in2);
        System.out.println("The set of substrings in Input 3: "+in3);
        System.out.println("Combinations that match in Input 1:\n"+answers1);
        System.out.println("Combination size : "+ answers1.size());
        System.out.println("Combinations that match in Input 2:\n"+answers2);
        System.out.println("Combination size : "+ answers2.size());
        System.out.println("Combinations that match in Input 3:\n"+answers3);
        System.out.println("Combination size : "+ answers3.size());
        System.out.println("The answers that match in all three inputs are: " +answers);
    }
   
}
