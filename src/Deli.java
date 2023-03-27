public class Deli extends Store {
    private boolean hasMadeSandwich;

    public Deli(String name, int numOfEmployees, int stock) {
        super(name, numOfEmployees, stock);
    }

    public boolean isHasMadeSandwich() {
        return hasMadeSandwich;
    }

    public void makeSandwich() {
        hasMadeSandwich = true;
        addNumOfItemsInStock();
        System.out.println("mama mia");
    }
}
