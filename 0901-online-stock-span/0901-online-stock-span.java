
import java.util.*;

class StockSpanner {
    ArrayList<Integer> span;
    Stack<Integer> s;
    ArrayList<Integer> prices;

    public StockSpanner() {
        span = new ArrayList<>();
        s = new Stack<>();
        prices = new ArrayList<>();
    }

    public int next(int price) {
        int i = prices.size();
        prices.add(price);

        int currPrice = price;

        while (!s.isEmpty() && currPrice >= prices.get(s.peek())) {
            s.pop();
        }

        int currSpan;

        if (s.isEmpty()) {
            currSpan = i + 1;
        } else {
            int prevHigh = s.peek();
            currSpan = i - prevHigh;
        }

        span.add(currSpan);
        s.push(i);

        return currSpan;
    }
}
