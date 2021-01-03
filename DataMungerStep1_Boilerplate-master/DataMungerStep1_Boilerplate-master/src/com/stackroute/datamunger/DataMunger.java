package com.stackroute.datamunger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*There are total 5 DataMungertest files:
 * 
 * 1)DataMungerTestTask1.java file is for testing following 3 methods
 * a)getSplitStrings()  b) getFileName()  c) getBaseQuery()
 * 
 * Once you implement the above 3 methods,run DataMungerTestTask1.java
 * 
 * 2)DataMungerTestTask2.java file is for testing following 3 methods
 * a)getFields() b) getConditionsPartQuery() c) getConditions()
 * 
 * Once you implement the above 3 methods,run DataMungerTestTask2.java
 * 
 * 3)DataMungerTestTask3.java file is for testing following 2 methods
 * a)getLogicalOperators() b) getOrderByFields()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask3.java
 * 
 * 4)DataMungerTestTask4.java file is for testing following 2 methods
 * a)getGroupByFields()  b) getAggregateFunctions()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask4.java
 * 
 * Once you implement all the methods run DataMungerTest.java.This test case consist of all
 * the test cases together.
 */

public class DataMunger {

	public String[] getSplitStrings(String queryString) {
		String temp_string =queryString;
        String query = temp_string.toLowerCase();
		return query.split("\\s");
	}

	/*
	 * Extract the name of the file from the query. File name can be found after a
	 * space after "from" clause. Note: ----- CSV file can contain a field that
	 * contains from as a part of the column name. For eg: from_date,from_hrs etc.
	 * 
	 * Please consider this while extracting the file name in this method.
	 */

	public String getFileName(String queryString) {
		String[] words = queryString.split("from");
		String file = words[1].trim();
		String[] files= file.split("\\s");
		return files[0].trim();
	}

	/*
	 * This method is used to extract the baseQuery from the query string. BaseQuery
	 * contains from the beginning of the query till the where clause
	 * 
	 * Note: ------- 1. The query might not contain where clause but contain order
	 * by or group by clause 2. The query might not contain where, order by or group
	 * by clause 3. The query might not contain where, but can contain both group by
	 * and order by clause
	 */
	
	public String getBaseQuery(String queryString) {
		String temp_str= queryString;

		if(queryString.contains(" where ")) {
			String[] words = queryString.split("where");
			String file = words[0].trim();
			return file;
		}

		else
		{
			if(queryString.contains(" order ")) {
				String[] words = queryString.split(" order by ");
				String file = words[0].trim();
				return file;
			}
			if(queryString.contains(" group ")) {
				String[] words = queryString.split(" group by ");
				String file = words[0].trim();
				return file;
			}
			return temp_str.toLowerCase();
		}
	}

	/*
	 * This method will extract the fields to be selected from the query string. The
	 * query string can have multiple fields separated by comma. The extracted
	 * fields will be stored in a String array which is to be printed in console as
	 * well as to be returned by the method
	 * 
	 * Note: 1. The field name or value in the condition can contain keywords
	 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The field
	 * name can contain '*'
	 * 
	 */
	
	public String[] getFields(String queryString) {
		String[] split_from = queryString.split("from");
		String sub_str1 =split_from[0].trim();
		String[] split_select = sub_str1.split("select");
		String sub_str2 = split_select[1].trim();
		if(sub_str2=="*")
			return split_select;
		String[] res = sub_str2.split(",");
		return  res;
	}

	/*
	 * This method is used to extract the conditions part from the query string. The
	 * conditions part contains starting from where keyword till the next keyword,
	 * which is either group by or order by clause. In case of absence of both group
	 * by and order by clause, it will contain till the end of the query string.
	 * Note:  1. The field name or value in the condition can contain keywords
	 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The query
	 * might not contain where clause at all.
	 */
	
	public String getConditionsPartQuery(String queryString) {
		if(!queryString.contains("where"))
		{
			String res=getFileName(queryString);
			
			if(res.contains("order"))
			{
				String[] order_split =res.split("order");
				String str = order_split[0].trim();
				return str.toLowerCase();
			}
			else if(res.contains("group"))
			{
				String[] group_split =res.split("group");
				String str = group_split[0].trim();
				return str.toLowerCase();
			}
		}
		else{

			String[] where_split = queryString.split("where");
			String res = where_split[1].trim();
			if(res.contains("order"))
			{
				String[] order_split =res.split("order");
				String str = order_split[0].trim();
				return str.toLowerCase();
			}
			else if(res.contains("group"))
			{
				String[] group_split =res.split("group");
				String str = group_split[0].trim();
				return str.toLowerCase();
			}
			return res.toLowerCase();
		}
		return null;
	}

	/*
	 * This method will extract condition(s) from the query string. The query can
	 * contain one or multiple conditions. In case of multiple conditions, the
	 * conditions will be separated by AND/OR keywords. for eg: Input: select
	 * city,winner,player_match from ipl.csv where season > 2014 and city
	 * ='Bangalore'
	 * 
	 * This method will return a string array ["season > 2014","city ='bangalore'"]
	 * and print the array
	 * 
	 * Note: ----- 1. The field name or value in the condition can contain keywords
	 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The query
	 * might not contain where clause at all.
	 */

	public String[] getConditions(String queryString) {

		queryString = queryString.toLowerCase();
		int pos = queryString.indexOf("where");
		if (pos == -1)
		{
			return null;
		}
		String [] arr = queryString.split("where");
		String res = arr[1].trim();
		String [] str = new String[1];
		str[0]=res.trim();
		String split_order_or_group = str[0];
		String[] result = split_order_or_group.split("group by | order by");
		String temp=result[0].trim();

		String[] final_result=temp.split(" and | or ");

		return final_result;
	}

	/*
	 * This method will extract logical operators(AND/OR) from the query string. The
	 * extracted logical operators will be stored in a String array which will be
	 * returned by the method and the same will be printed Note:  1. AND/OR
	 * keyword will exist in the query only if where conditions exists and it
	 * contains multiple conditions. 2. AND/OR can exist as a substring in the
	 * conditions as well. For eg: name='Alexander',color='Red' etc. Please consider
	 * these as well when extracting the logical operators.
	 * 
	 */

	public String[] getLogicalOperators(String queryString) {

		if(queryString.contains(" where "))
		{
			String[] str = queryString.split("\\s");
			String res = "";
			for(int i=0;i<str.length;i++)
			{
				String temp = str[i].trim();

				if(temp.equals("or")==true || temp.equals("and")==true)
					res=res+" "+temp;
			}

			if(res.length()<5)
			{
				String[] result = new String[1];
				result[0] = res.trim();
				return result;
			}
			else {

				String[] result = res.trim().split("\\s");
				return result;
			}
		}

		return null;
	}

	/*
	 * This method extracts the order by fields from the query string. Note: 
	 * 1. The query string can contain more than one order by fields. 2. The query
	 * string might not contain order by clause at all. 3. The field names,condition
	 * values might contain "order" as a substring. For eg:order_number,job_order
	 * Consider this while extracting the order by fields
	 */

	public String[] getOrderByFields(String queryString) {

		if(queryString.contains(" order by ")) {
			String[] order_split = queryString.split(" order by ");
			String res = "" + order_split[1].trim();
			String[] result = new String[1];
			result[0] = res.trim();
			return result;
		}
		return null;
	}
	/*
	 * This method extracts the group by fields from the query string. Note:
	 * 1. The query string can contain more than one group by fields. 2. The query
	 * string might not contain group by clause at all. 3. The field names,condition
	 * values might contain "group" as a substring. For eg: newsgroup_name
	 * 
	 * Consider this while extracting the group by fields
	 */

	public String[] getGroupByFields(String queryString) {
		if(queryString.contains(" group by ")) {
			String[] group_split = queryString.split(" group by ");
			String res = "" + group_split[1].trim();
			String[] result = new String[1];
			result[0] = res.trim();
			return result;
		}
		  return null;
	}

	/*
	 * This method extracts the aggregate functions from the query string. Note:
	 *  1. aggregate functions will start with "sum"/"count"/"min"/"max"/"avg"
	 * followed by "(" 2. The field names might
	 * contain"sum"/"count"/"min"/"max"/"avg" as a substring. For eg:
	 * account_number,consumed_qty,nominee_name
	 * 
	 * Consider this while extracting the aggregate functions
	 */

	public String[] getAggregateFunctions(String queryString) {
		if(queryString.contains("count") || queryString.contains("sum") || queryString.contains("min") || queryString.contains("max")
				|| queryString.contains("avg"))
		{
			ArrayList<String> list = new ArrayList<String>();
			String[] str = queryString.split(" ");
			String[] res = str[1].trim().split(",");
			for (int i=0;i < res.length;i++) {
				if (res[i].contains("(")) {
					list.add(res[i]);

				}
			}
			return list.toArray(new String[list.size()]);

		}
		return null;

	}


}

