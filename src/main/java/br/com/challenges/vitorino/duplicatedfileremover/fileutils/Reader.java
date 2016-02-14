package br.com.challenges.vitorino.duplicatedfileremover.fileutils;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Reader {

	public Set<File> readFolder(String inputPathname){
		File folder = new File(inputPathname);
		Set<File> files = new HashSet<File>();
		for(File file : folder.listFiles()){
			if (!file.isDirectory()) {
				files.add(file);
			}
		}
		return files;
	}
	
}
