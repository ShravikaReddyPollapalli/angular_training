package defaultpackage;

import java.io.File;

public class FolderInfo {
	public static void printDirectory(String path) {
		File f = new File(path);
		if(!f.exists()) {
			System.out.println("the folder does not exists");
		}
		else {
			String fileName = f.getName();
			System.out.println("filename : " + fileName);
			String absPath = f.getAbsolutePath();
			System.out.println("Absolute File Path : " + absPath);
			String folderPath = path.substring(0,path.lastIndexOf("/"));
			System.out.println("folder path : " + folderPath );
			for(String s : f.list()) {
				File f1 = new File(s);
				if(f1.isDirectory()) {
					System.out.println("sub folder name : " + f1.getName());
					System.out.println("path : " + f1.getAbsolutePath());
				}
				else {
					System.out.println("sub File name : " + f1.getName());
					System.out.println("path : " + f1.getAbsolutePath());
				}
			}
		}
	}
}
