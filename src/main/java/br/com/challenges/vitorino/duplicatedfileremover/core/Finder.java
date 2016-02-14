package br.com.challenges.vitorino.duplicatedfileremover.core;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Finder {

	public Set<File> find(Set<File> files) throws IOException {
		Set<Long> sizes = new HashSet<Long>();
		Set<File> duplicated = new HashSet<File>();
		for(File file : files){
			if (sizes.contains(file.length())) {
				duplicated.add(file);
			}
			sizes.add(file.length());
		}
		return duplicated;
	}

}
