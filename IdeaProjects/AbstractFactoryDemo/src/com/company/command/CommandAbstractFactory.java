package com.company.command;

import java.util.HashMap;

public class CommandAbstractFactory {

    private HashMap<String, CommandExecutor> ma;

    public CommandAbstractFactory(){
        ma = new HashMap<>();
        ma.put("create", new Create());
        ma.put("add", new Add());
        ma.put("exit", new Exit());

    }

    public CommandExecutor getExecutor(String val){
        return ma.get(val);
    }

}
