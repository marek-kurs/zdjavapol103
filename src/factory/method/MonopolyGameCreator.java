package factory.method;//package pl.sdacademy.factorymethod;

public class MonopolyGameCreator implements GameFactory {
    @Override
    public Game create() {
        return new BoardGame("Monopoly", "Family factory.method.Game", 4);
    }
}