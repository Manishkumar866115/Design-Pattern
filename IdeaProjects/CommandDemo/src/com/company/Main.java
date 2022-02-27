package com.company;

import com.company.Broker.Broker;
import com.company.Command.Command;

public class Main {

    public static void main(String[] args) {

        Broker broker = new Broker();
        broker.addOrder(new Command("HUL", 10, "Buy"));
        broker.addOrder(new Command("ICICI", 20, "Buy"));
        broker.addOrder(new Command("HDFC", 15, "Buy"));
        broker.executeOrders();
    }
}
