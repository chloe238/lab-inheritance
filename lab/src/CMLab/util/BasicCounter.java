package CMLab.util;

public class BasicCounter implements Counter{
  
  int count;
  int start;

  public BasicCounter(int start){
    this.count = start;
    this.start = start;
    System.err.println("BasicCounter(" + start + ")");
  }

  /**
   * Count something.
   *
   * @exception Exception
   *   When the count gets too large.
   */
  public void increment() throws Exception{
    if(this.count >= Integer.MAX_VALUE){
      throw new Exception("Count is too large.");
    }//if
    this.count++;
  }

  /**
   * Reset the counter.
   */
  public void reset(){
    this.count = this.start;
  }

  /**
   * Get the value of the counter.
   */
  public int get(){
    return this.count;
  }

  public String toString(){
    return "[" + this.count + "]";
  }
}
