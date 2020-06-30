package sort;

import comparators.ProductComparator;
import model.Produto;

public interface ProductSortingStrategy {
    public void sort(Produto[] produtos, ProductComparator criteria, int ini, int fim);
    public boolean selectOrder( int num);
}