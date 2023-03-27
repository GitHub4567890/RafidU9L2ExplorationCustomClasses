public class VeryFastClass {
    public static void main(String[] args) {
        Bakery uno = new Bakery("alphabet's ai bakery", 1, 0);
        System.out.println("Bakery Info:\nname: " + uno.getName() + "\nemployees: " + uno.getNumOfEmployees() + "\nhas baked cake: " + uno.isHasBakedCake() + "\nnum of items in stock: " + uno.getNumOfItemsInStock());
        uno.hireHuman();
        uno.bakeCake();
        System.out.println("has baked cake: " + uno.isHasBakedCake());
        System.out.println("new total employees: " + uno.getNumOfEmployees());
        System.out.println("new total num of items in stock: " + uno.getNumOfItemsInStock());

        System.out.println();

        Deli dos = new Deli("the fbi's deli", 2147483646, 0);
        System.out.println("Deli Info:\nname: " + dos.getName() + "\nemployees: " + dos.getNumOfEmployees() + "\nhas made sandwich: " + dos.isHasMadeSandwich() + "\nnum of items in stock: " + dos.getNumOfItemsInStock());
        dos.hireHuman();
        dos.makeSandwich();
        System.out.println("has made sandwich: " + dos.isHasMadeSandwich());
        System.out.println("new total employees: " + dos.getNumOfEmployees());
        System.out.println("new total num of items in stock: " + dos.getNumOfItemsInStock());
    }
}