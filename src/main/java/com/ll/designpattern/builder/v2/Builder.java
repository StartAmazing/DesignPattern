package com.ll.designpattern.builder.v2;

public class Builder {

    public static void main(String[] args) {
//        new Product("xx", "xx", "x", "x", "x", "x");


        Product build = new Product.Builder().productName("XX").companyName("xx").part1("x").part2("x").part3("x").part4("x").build();
        System.out.println(build);
    }

}

class Product {
    private final String productName;
    private final String companyName;
    private final String part1;
    private final String part2;
    private final String part3;
    private final String part4;

    // ...

    public Product(String productName, String companyName, String part1, String part2, String part3, String part4) {
        this.productName = productName;
        this.companyName = companyName;
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
    }

    static class Builder {
        private String productName;
        private String companyName;
        private String part1;
        private String part2;
        private String part3;
        private String part4;

        public Builder productName(String _productName) {
            this.productName = _productName;
            return this;
        }

        public Builder companyName(String _companyName) {
            this.companyName = _companyName;
            return this;
        }

        public Builder part1(String _part1) {
            this.part1 = _part1;
            return this;
        }

        public Builder part2(String _part2) {
            this.part2 = _part2;
            return this;
        }

        public Builder part3(String _part3) {
            this.part3 = _part3;
            return this;
        }

        public Builder part4(String _part4) {
            this.part4 = _part4;
            return this;
        }

        public Product build() {
            //
            return new Product(this.productName, this.companyName, this.part1, this.part2, this.part3, this.part4);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                ", part4='" + part4 + '\'' +
                '}';
    }
}