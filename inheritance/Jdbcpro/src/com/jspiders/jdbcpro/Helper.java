package com.jspiders.jdbcpro;

public class Helper {
public static Operations getOperations()
{
	Operations operations=new OperationsImpl();
	return operations;
}
}
