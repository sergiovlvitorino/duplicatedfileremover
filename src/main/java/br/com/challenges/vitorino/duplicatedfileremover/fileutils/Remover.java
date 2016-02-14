package br.com.challenges.vitorino.duplicatedfileremover.fileutils;

import java.io.File;
import java.util.Set;

public class Remover {

	public boolean remove(Set<File> duplicatedFiles) {
		for(File file : duplicatedFiles){
			if (!file.delete()) {
				throw new RuntimeException(file.getName() + " Not Removed");
			}
			System.out.println(file.getName() + " Removed");
		}
		return true;
	}

}
