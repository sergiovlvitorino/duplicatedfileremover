package br.com.challenges.vitorino.duplicatedfileremover.core;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import br.com.challenges.vitorino.duplicatedfileremover.fileutils.Reader;
import br.com.challenges.vitorino.duplicatedfileremover.fileutils.Remover;

public class Core {
	
	private Reader reader;
	private Finder finder;
	private Remover remover;
	
	public Core() {
		this.reader = new Reader();
		this.finder = new Finder();
		this.remover = new Remover();
	}

	public boolean execute(String inputPathname) throws IOException{
		Set<File> allFiles = reader.readFolder(inputPathname);
		Set<File> duplicatedFiles = finder.find(allFiles);
		if (duplicatedFiles.isEmpty()) {
			return false;
		}
		return remover.remove(duplicatedFiles);
	}

	
	
}
