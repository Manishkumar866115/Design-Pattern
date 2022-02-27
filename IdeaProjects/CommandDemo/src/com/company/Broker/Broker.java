package com.company.Broker;

import com.company.Command.Command;
import com.company.CommandExecutor.BuyExecutor;
import com.company.CommandExecutor.SellExecutor;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    List<Command> list = new ArrayList<>();

    public Broker(){

    }

    public void addOrder(Command command){
        list.add(command);
    }

    public void removeOrder(Command command){
        list.remove(command);
    }

    public  void executeOrders(){
        for( Command c : list){
            if( c.getOrderType() == "Buy")
                new BuyExecutor().execute(c);
            else
                new SellExecutor().execute(c);
        }
    }
}
