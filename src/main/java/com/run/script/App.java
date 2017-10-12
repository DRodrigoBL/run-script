package com.run.script;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.zeroturnaround.exec.ProcessExecutor;
import org.zeroturnaround.exec.ProcessResult;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws TimeoutException, InterruptedException, IOException
    {
        System.out.println( "##### Command Executor #####" );
        
        int exit = new ProcessExecutor().command("java", "-version")
                .execute().getExitValue();
        
        System.out.println("Exit code: "+exit);
        
        String output = new ProcessExecutor().command("java", "-version")
                .readOutput(true).execute()
                .outputUTF8(); 
        
        System.out.println(output);
        
        
        ProcessExecutor process = new ProcessExecutor().command("java", "-version").readOutput(true);
        
        ProcessResult result = process.execute();
        
        int exitValue = result.getExitValue();
        String outputString = result.outputUTF8();
        
        System.out.println("exitValue: " + exitValue);
        System.out.println("outputString_ " + outputString);
    }
}
