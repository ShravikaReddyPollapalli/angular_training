package com.capgemini.project;



import lombok.extern.log4j.Log4j;

@Log4j
public class App {
	private static String msg = "Hello world";
//	private static final Logger  LOGGER  = Logger.getLogger(App.class);
    public static void main(String[] args)  {
    log.info("started");
    log.info(msg);
    log.info("Ended");
    	
    }
}




////console
//log.info(msg);
//
////to save in a file
//FileWriter fileWriter = new FileWriter("app.log");
//fileWriter.write(msg);
//fileWriter.flush();
//fileWriter.close();
//
////to save in database
//Connection con = null;
//PreparedStatement pstmt = null;
//con = DriverManager.getConnection(null);
//pstmt = con.prepareStatement(null);
//pstmt.setString(1, msg);
//pstmt.executeUpdate();