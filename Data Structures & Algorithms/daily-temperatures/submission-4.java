class Solution {

public record kv(int index, int value){}

  public int[] dailyTemperatures(int[] temperatures) {

    Stack<kv> s = new Stack<>();
    int[] arr = new int[temperatures.length];

    // iterate it reverse order
    for (int i = temperatures.length - 1; i >= 0; i--) {

      var val = temperatures[i];
      // check if the existing element is greater
        while (!s.isEmpty() && s.peek().value <= val) {
          s.pop();
        }

      if (s.isEmpty()) {
        arr[i] = 0;
      } else {
        arr[i] = s.peek().index - i;
      }

      s.push(new kv(i, val));


    }
    return arr;

  }
}
