package com.collection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class States {
	
	public static LinkedHashSet<String> stateSet =  new LinkedHashSet<String>(); 
	public static void main(String[] args) {

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("E:\\states.txt"));
			out.write("Karnataka");
			out.write("Punjab");
			out.write("\nTelangana");
			out.write("\nMaharashtra");
			out.write("\nTamilNadu");
			out.write("\nUttar Pradesh");
			out.write("\nPunjab");
			out.write("\nKarnataka");
			out.write("\nKerala");
			out.write("\nDelhi");
			out.close();
			System.out.println("File created successfully");

			BufferedReader bReader = new BufferedReader(new FileReader("E:\\states.txt"));
			String currentLine = bReader.readLine();
			while (currentLine != null) {

				addToSet(currentLine);
				currentLine=bReader.readLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		totalNumState();
		displayStartWithK();
		sortSet();
		removeDelhi();
		sortSet();;
	}
	public static void addToSet(String state) {
		stateSet.add(state);
	}


	public static void totalNumState() {
		System.out.println(stateSet.size());
	}

	public static void sortSet() {
		TreeSet<String> set = new TreeSet<>();
		for(String a: stateSet) {
			set.add(a);
		}
		System.out.println(set);
	}

	public static void removeDelhi()
	{
		stateSet.remove("Delhi");
		System.out.println("Now Deleted Delhi........ New Set Here");
	}

	public static void displayStartWithK() {
		for (String s : stateSet)
		{
			if (s.charAt(0) == 'K') {
				System.out.println(s);
			}
		}

	}
}
