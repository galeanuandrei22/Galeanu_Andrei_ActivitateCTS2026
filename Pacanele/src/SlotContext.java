public class SlotContext {
  private SlotMachineState readyState;
  private SlotMachineState spinningState;
  private SlotMachineState currentState;
  private SlotGameTemplate game;

  public SlotContext() {
      readyState = new ReadyState(this);
      spinningState = new SpinningState(this);
      currentState = readyState;
      game = new Septari();
  }

  public void setState(SlotMachineState state) {
      this.currentState = state;
  }

  public SlotMachineState getReadyState() {
      return readyState;
  }

  public SlotMachineState getSpinningState() {
      return spinningState;
  }

  public void insertCoin() {
      currentState.insertCoin();
  }

  public void pressSpin() {
      currentState.pressSpin();
      if(currentState == spinningState) {
          game.play();
          setState(readyState);
      }
  }
}
