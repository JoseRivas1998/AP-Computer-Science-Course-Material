package example1;

// Final in this context means that no class can extend it.
public final class OrderedPair {

    // This class is immutable, meaning in order to change data, a new object must be created.
    private final double x;
    private final double y;

    public OrderedPair(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result;
        /* If the other object is null or is not of type ordered pair, then they cannot be equal.
         * Note the order here, the null check must come first, because obj.getClass() would throw
         * a NullPointerException if obj is null.
         * Because of short circuit evaluation, if obj == null is true, the second part of the or does not
         * get evaluated, so obj.getClass() is only ever checked if obj == null is false (meaning the obj is not null)
         */
        if(obj == null || obj.getClass() != this.getClass()) {
            result = false;
        } else {
            // Cast the reference to ordered pair
            OrderedPair orderedPair = (OrderedPair) obj;
            /*
             * Note we do not use the == operator with doubles. This is not for the same reason we don't use it for
             * objects, however. We do this because doubles may have rounding differences. For example, if
             * d1 = 1.0 / 3.0 and d2 = 1.0 / 3.0
             * The actual values in memory may differ, d1 could be 0.3333333 and d2 could be 0.3333334
             * This is because floating point arithmetic is meant to be fast, not accurate.
             * Using Double.compare() prevents this from being an issue. So here are the possible values for Double.compare()
             * Double.compare(a, b) < 0: a < b
             * Double.compare(a, b) = 0: a = b
             * Double.compare(a, b) > 0: a > b
             */
            result = Double.compare(this.x, orderedPair.x) == 0 && Double.compare(this.y, orderedPair.y) == 0;
        }
        return result;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
