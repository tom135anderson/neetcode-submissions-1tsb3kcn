
// the trick is, when minimum value is found backup the current minimum in the stack, when pop if the current minimum gets pop'ed, pop again to 
// retrieve the minimum value back again

class MinStack {

  Stack<Integer> s;
  int mv = 0;

  public MinStack() {
    this.s = new Stack();
    this.mv = Integer.MAX_VALUE;

  }

  public void push(int val) {
    if (val <= mv) {
      // since new minimum is found, backup the minimum in the stack
      s.push(mv);
      mv = val;

    }
    s.push(val);
  }

  public void pop() {
    if (s.pop() == mv) {
      mv = s.pop();
    }

  }

  public int top() {
    return s.peek();
  }

  public int getMin() {
    return this.mv;
  }
}
