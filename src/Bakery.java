public class Bakery extends Store {
    private boolean hasBakedCake;

    public Bakery(String name, int numOfEmployees, int stock) {
        super(name, numOfEmployees, stock);
    }

    public boolean isHasBakedCake() {
        return hasBakedCake;
    }

    public void bakeCake() {
        hasBakedCake = true;
        addNumOfItemsInStock();
        System.out.println("oui oui oui");
    }
}
