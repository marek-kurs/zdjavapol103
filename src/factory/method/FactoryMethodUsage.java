package factory.method;//package pl.sdacademy.factorymethod;

import java.util.Scanner;

public class FactoryMethodUsage {

    public static void main(String[] args) {
//        final String type = args[0];
        String type = new Scanner(System.in).nextLine();
        GameFactory gameFactory;
        if (type.equals("PC")) {
            gameFactory = new ValorantGameCreator();
        } else if (type.equals("Board")){
            gameFactory = new MonopolyGameCreator();
        } else {
            throw new RuntimeException("unknown game type");
        }

        Game createdGame = gameFactory.create();
        System.out.println("Created game " + createdGame);
    }
}