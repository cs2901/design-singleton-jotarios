package com.utec.design.patterns;

public class ChocolateBoiler {
    //Singleton
    private static ChocolateBoiler instance = null;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (isEmpty() && isBoiled()) {
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && isBoiled()) {
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
            System.out.println("Se creó el objeto por primera vez");
        }

        return instance;
    }
}
