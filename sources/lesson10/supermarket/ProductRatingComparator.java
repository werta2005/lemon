package lesson10.supermarket;

import java.util.Comparator;

public class ProductRatingComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getRate(), o2.getRate());
    }
}
