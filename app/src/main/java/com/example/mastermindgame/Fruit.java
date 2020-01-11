package com.example.mastermindgame;

public final class Fruit {
    private final int fruitCouleur;
    private boolean isverifier;

    Fruit(final int fruit) {
        fruitCouleur = fruit;
        isverifier = true;
    }

    public int getFruitCouleur() {
        return fruitCouleur;
    }

    public boolean isVerifier() {
        return isverifier;
    }

    public void setVerifier(boolean verifier) {
        this.isverifier = verifier;
    }


}
