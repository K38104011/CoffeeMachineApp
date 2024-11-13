public class App {
    public static void main(String[] args) throws Exception {
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(oldCoffeeMachine);
        adapter.chooseFirstSelection();
        adapter.chooseSecondSelection();
    }
}
