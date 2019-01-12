public class ProductTester {
    public static void main(String[] args) {

        Product testProduct = new Product("ekler", 4.22);

        Product[] products = new Product[4];
        products[0] = new Product( "ciasto", 4.56);
        products[1] = new Product( "pączek", 3.55);
        products[2] = new Product( "ekler", 4.22);
        products[3] = new Product( "mąka", 7.45);

        for (Product p:products){
            if (p.equals(testProduct)){
                System.out.println(p.toString()+ " - Ten sam produkt");
            } else System.out.println(p.toString() + " - inny produkt");
        }

    }

}
