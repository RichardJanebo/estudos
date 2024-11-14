package teste09.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        ArrayList<String> grid = new ArrayList<>();
        grid.add(" >>h   ");
        grid.add(" ^    v");
        grid.add(" ^<<<< ");

        String[] splitxt = null;

        ArrayList<ArrayList<Integer>> arrayDoisD = new ArrayList<>();

        for (int y = 0; y < grid.size(); y++) {
            splitxt = grid.get(y).split("");
            arrayDoisD.add(new ArrayList<>());
            for(int x = 0; x < splitxt.length;x++){
                
                if(splitxt[x].equals("h")){
                    System.out.println(y + " " + x);
                }
                arrayDoisD.get(y).add(x);
               
              
                
            }
           
        }
        System.out.println(arrayDoisD);
        
        // System.out.println(arrayDoisD);

    }

    // public static ArrayList<ArrayList<Integer>> buscarCalda(int x , int y){

    // }


       
}