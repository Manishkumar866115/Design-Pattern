package com.company.CommandExecutor;

import com.company.Command.Command;

public class BuyExecutor implements Executor{
    @Override
    public void execute(Command command) {
        System.out.println("Buying " + command.getQuantity() + " stocks of " + command.getStock() );
    }
}
