package com.collection;
//2 – Cricket Score Analyzer
//Create a Class ScoreAnalyzer with a private instance variable 'runsData' of type LinkedList.
//The linkedlist will store runs scored by individual players in One Day Cricket match.
//Create a constructor and initialize runsData variable.
//
//•	Create a method addRunsToList which accepts runs scored by a player as parameter and stores it in the List.
//•	Create a method calcRunRate which returns the runRate (Consider all 50 overs were played by a team).
//•	Create a method lowestRunsScored to return the lowest runs scored by a player.
//•	Create a method displayRuns to display the runs scored by all players.(use for each loop)
//
//Create class TestScoreAnalyzer with a main method. 
//•	Create an object of ScoreAnalyzer
//•	Use Scanner to get the runs scored and use addRuns method to store the runs
//•	Display the runs scored by all players
//•	Display the runrate
//•	Display the lowest runs scored
//•	Display the count of player who did batting
//
//Sample input
//Enter Runs
//20 30 150 50 2
// 
//Sample Output
//Runs Scored : 1-20 2-30 3-150 4-50 6-2
//Runrate : 5.04
//Lowest Runs : 2
//Count of player who batted: 5

import java.util.Iterator;
import java.util.LinkedList;

class ScoreAnalyzer {
	 private  LinkedList<Integer> runsData = new LinkedList<Integer>();


	    public void addRunsToList( int each_PlayerRuns ){
	         runsData.add(each_PlayerRuns);
	    }


	    public float calcRunRate(){
	         float run_rate;
	         int sum= 0;
	         int no_Of_Overs=50;
	         Iterator<Integer> i = runsData.iterator();
	         while(i.hasNext()){
	            sum = sum+i.next();
	         }
	        run_rate=sum/no_Of_Overs;
	        return run_rate;
	     }


	     public int lowestRunsScored(){
	         Iterator<Integer> i = runsData.iterator();
	         int min = i.next();
	         while(i.hasNext()){
	             if(i.next()<min){
	                 min=i.next();
	             }
	         }
	         return min;
	     }


	     public void displayRuns(){
	         System.out.println("Runs scored:");
	         for( int i:runsData){
	             System.out.println(i);
	         }
	     }

	     public int no_OF_player(){
	         int count=0;
	         Iterator<Integer> i = runsData.iterator();
	         while(i.hasNext()){
	             if(i.next()>0){
	                 count=count+1;
	             }
	         }
	         return count;
	     }
}
