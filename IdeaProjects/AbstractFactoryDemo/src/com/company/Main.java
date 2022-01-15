package com.company;

import com.company.command.CommandAbstractFactory;
import com.company.command.CommandExecutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        CommandAbstractFactory caf = new CommandAbstractFactory();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        CommandExecutor exec;
        try{
            while( ( line = br.readLine()) != null){

                exec = caf.getExecutor(line.toLowerCase());
                exec.execute();
                if( line.equalsIgnoreCase("exit"))
                    return;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
