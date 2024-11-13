public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine _oldCoffeeMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
        _oldCoffeeMachine = oldCoffeeMachine;
    }
   
    @Override
    public void chooseFirstSelection() {
        _oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        _oldCoffeeMachine.selectB();
    }

}
