package com.collection;
//3 – ScoreCard
//Create a class ScoreCard with a main method to analyze the runs scored by batsmen of a team. The input data format is given below. The program needs to output as given below. Use a concrete class of Map to achieve the functionality.
//
//Sample Input
//-------------
//Enter Runs Scored
//Rahane-20 Rahul-30 Kohli-150 Dhoni-50 Lokesh-2
//
//
//Sample Output
//-------------
//Players who batted
//Dhoni
//Kohli
//Lokesh
//Rahane
//Rahul
//
//Scores by Players
//Dhoni : 50
//Kohli : 150
//Lokesh : 2
//Rahane : 20
//Rahul  : 30
//
//Total Score : 202
//
//Name of Highest Scorer : Kohli
//
//Runs Scored by Dhoni : 50
import java.util.HashMap;

public class ScoreCard {
	public static void main(String[] args) {
        HashMap<String,Integer> score = new HashMap<String, Integer>();
        int totalScore=0;
        score.put("Rahane",20);
        score.put("Rahul",30);
        score.put("Kohli",150);
        score.put("Dhoni",50);
        score.put("Lokesh",2);

        System.out.println("Players who batted");
        for(HashMap.Entry<String, Integer> i : score.entrySet()){
            System.out.println(i.getKey());
        }
        System.out.println();
        // Traversing through the map
        for (HashMap.Entry<String, Integer> i : score.entrySet()) {
            System.out.print(i.getKey() + ":");
            System.out.println(i.getValue());
            totalScore+=i.getValue();
        }
        System.out.println();
        System.out.println("Total score:"+totalScore);

        System.out.println();
        System.out.println("Runs Scored by Dhoni:"+score.get("Dhoni"));
    }
}
