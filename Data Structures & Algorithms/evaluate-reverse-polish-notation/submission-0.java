class Solution {
public int evalRPN(String[] tokens) {

    var opr = List.of("+", "-", "*", "/");
    Stack<Integer> stack = new Stack<>();
    for (String s : tokens) {
      if (!stack.isEmpty() && opr.contains(s)) {
        doOp(stack, s);
      } else {
        var no = getNumber(s);
        stack.push(no);
      }
    }
    System.out.println("len: " + stack.size());
    return stack.peek();

  }


  private Integer getNumber(String s) {
    try {
      return Integer.parseInt(s);
    } catch (Exception e) {
      System.out.println(e);
      throw new RuntimeException("why");
    }
  }

  private void doOp(Stack<Integer> stack, String s) {
    var b = stack.pop();
    var a = stack.pop();
    switch (s) {
      case "+" -> stack.push(a + b);
      case "-" -> stack.push(a - b);
      case "*" -> stack.push(a * b);
      case "/" -> stack.push(a / b);
    }
}
}
