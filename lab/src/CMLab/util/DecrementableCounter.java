package CMLab.util;
public class DecrementableCounter extends BasicCounter{
  public DecrementableCounter(int start){
    super(start);
    System.err.println("DecrementableCounter(" + start + ")");
  }
  public void decrement() {
    this.count--;
  }

}
