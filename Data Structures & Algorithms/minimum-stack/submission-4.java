class MinStack {

  Stack<Integer> s;
  Stack<Integer> ms;

  public MinStack() {
    this.s = new Stack();
    this.ms = new Stack();
    
  }

  public void push(int val) {
    s.push(val);
    if (ms.isEmpty()) {
      ms.push(val);
    } else {
      ms.push(Integer.min(val, ms.peek()));
    }
  }


  public void pop() {
    s.pop();
    ms.pop();

  }

  public int top() {
    return s.peek();
  }

  public int getMin() {
    return  ms.peek();
  }
}
