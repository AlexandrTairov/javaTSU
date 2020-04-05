class Fibonacci {

    private int[]fib_arr;
    private int n;

    Fibonacci(int n) {
        this.n = n;
        fib_arr = new int[n];
        fib_arr[0] = 0;
        fib_arr[1] = 1;
        for (int i = 2; i < n; ++i) {
            fib_arr[i] = fib_arr[i - 1] + fib_arr[i - 2];
        }
    }

    int[] getter() {
        return fib_arr;
    }

    @Override
    public boolean equals(Object o) {
        System.out.print("Equals: ");
        if (o == this) return true;
        if (!(o instanceof Fibonacci)) return false;
        Fibonacci f = (Fibonacci) o;
        return f.n == n;
    }
}
