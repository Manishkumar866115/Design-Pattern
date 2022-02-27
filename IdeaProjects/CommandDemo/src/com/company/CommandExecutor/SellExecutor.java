package com.company.CommandExecutor;

import com.company.Command.Command;

public class SellExecutor implements Executor{
    @Override
    public void execute(Command command) {
        System.out.println("Selling " + command.getQuantity() + " stocks of " + command.getStock() );
    }
}
