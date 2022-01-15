package com.company.command;

public class Exit implements CommandExecutor{
    @Override
    public void execute() {
        System.out.println("Executing exit command...");
    }
}
