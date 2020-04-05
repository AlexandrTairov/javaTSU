class PascalTriangle {

    private int rows;

    PascalTriangle(int rows) {
        this.rows = rows;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.format("%"+(rows -i)*2+"s","");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d",number);
                number = number * (i - j) / (j + 1);

            }
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        System.out.print("Equals: ");
        if (o == this) return true;
        if (!(o instanceof PascalTriangle)) return false;
        PascalTriangle t = (PascalTriangle) o;
        return t.rows == rows;
    }

}