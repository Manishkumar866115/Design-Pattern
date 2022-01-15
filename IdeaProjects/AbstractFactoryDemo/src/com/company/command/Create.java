package com.company.command;

public class Create implements  CommandExecutor{
    @Override
    public void execute() {
        System.out.println("Executing create command...");
    }
}
