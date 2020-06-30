package sort;

import comparators.ProductComparator;
import model.Produto;

public class ProductInsertionSort implements ProductSortingStrategy {

    @Override
    public void sort(Produto[] produtos, ProductComparator criteria, int ini, int fim) {
        for (int i = ini; i <= fim; i++) {

            Produto x = produtos[i];
            int j = (i - 1);

            while (j >= ini) {
                    if (selectOrder(criteria.compare(x, produtos[j]))) {
                        produtos[j + 1] = produtos[j];
                        j--;
                    } else break;
            }
            produtos[j + 1] = x;
        }
    }

    @Override
    public boolean selectOrder(int num) {
        return num > 0 ? true : false;
    }

}