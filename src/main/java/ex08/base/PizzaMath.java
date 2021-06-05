package ex08.base;

public class PizzaMath {

    private int people;
    private int slices;
    private int pizzas;
    private int totalSlices;

    public PizzaMath (int people, int slices, int pizzas){
        this.people = people;
        this.slices = slices;
        this.pizzas = pizzas;
        this.totalSlices = pizzas * slices;
    }

    public void dividePizza(){
        int myPizza = (totalSlices) / people;
        if(myPizza != 1){
            System.out.printf("Each person gets %d pieces of pizza.%n", myPizza);
        }else{
            System.out.printf("Each person gets %d piece of pizza.", myPizza);
        }
    }

    public void leftoverPizza(){
        int leftover = (totalSlices) % people;
        if(leftover != 1){
            System.out.printf("There are %d leftover pieces.%n", leftover);
        }else{
            System.out.printf("There is %d leftover piece.%n", leftover);
        }
    }

    public void summary(){
        System.out.printf("%d people with %d pizzas (%d slices)%n", people, pizzas, totalSlices);
    }
}
