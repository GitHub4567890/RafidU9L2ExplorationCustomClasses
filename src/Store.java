public class Store {
    private String name;
    private int numOfEmployees;
    private int numOfItemsInStock;

    public Store(String name, int numOfEmployees, int numOfItemsInStock) {
        this.name = name;
        this.numOfEmployees = numOfEmployees;
        this.numOfItemsInStock = numOfItemsInStock;
    }

    public String getName() {
        return name;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public int getNumOfItemsInStock() {
        return numOfItemsInStock;
    }

    public void addNumOfItemsInStock() {
        numOfItemsInStock++;
    }

    public void hireHuman() {
        numOfEmployees++;
        System.out.println("more labor!!");
    }


}