package com.run.script;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.zeroturnaround.exec.ProcessExecutor;
import org.zeroturnaround.exec.ProcessResult;

public class BashExecutor {

	public static void main(String[] args) throws TimeoutException, InterruptedException, IOException {
		String script11 = "/home/karla/Documents/rfiles/scripts/Scripts/A/11.sh";
		String script12 = "/home/karla/Documents/rfiles/scripts/Scripts/A/12.sh";
		String script13 = "/home/karla/Documents/rfiles/scripts/Scripts/A/13.sh";

		ProcessExecutor process11 = new ProcessExecutor().command(script11).readOutput(true);

		ProcessResult result11 = process11.execute();

		int exitValue11 = result11.getExitValue();
		String outputString11 = result11.outputUTF8();

		System.out.println("exitValue11: " + exitValue11);
		System.out.println("outputString11: " + outputString11);

		ProcessExecutor process12 = new ProcessExecutor().command(script12).readOutput(true);

		ProcessResult result12 = process12.execute();

		int exitValue12 = result12.getExitValue();
		String outputString12 = result12.outputUTF8();

		System.out.println("exitValue12: " + exitValue12);
		System.out.println("outputString12 " + outputString12);

		ProcessExecutor process13 = new ProcessExecutor().command(script13).readOutput(true);

		ProcessResult result13 = process13.execute();

		int exitValue13 = result13.getExitValue();
		String outputString13 = result13.outputUTF8();

		System.out.println("exitValue: " + exitValue13);
		System.out.println("outputString13 " + outputString13);
	}

}
