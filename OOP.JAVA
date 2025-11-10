interface ICalculator {
    void add(int a, int b);
    void subtract(int a, int b);
}

class Calculator implements ICalculator {
    
    public void add(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public void subtract(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }
}

