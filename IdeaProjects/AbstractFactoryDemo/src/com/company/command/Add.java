package com.company.command;

public class Add implements CommandExecutor{
    @Override
    public void execute() {
        System.out.println("Executing add command...");
    }
}
