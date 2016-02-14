package br.com.challenges.vitorino.duplicatedfileremover;

import java.io.IOException;

import br.com.challenges.vitorino.duplicatedfileremover.core.Core;

public class DuplicatedFileRemover {

	private Core core;
	
	public DuplicatedFileRemover() {
		this.core = new Core();
	}
	
	public static void main(String[] args) {
		DuplicatedFileRemover duplicatedFileRemover = new DuplicatedFileRemover();
		try {
			if (args == null || args.length == 0) {
				throw new IllegalArgumentException("Insert the pathname as the first argument.");
			}
			duplicatedFileRemover.execute(args[0]);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	public void execute(String inputPathname) throws IOException{
		core.execute(inputPathname);
	}

}
