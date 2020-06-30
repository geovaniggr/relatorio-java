package sort;

import comparators.ProductComparator;
import model.Produto;

public class ProductQuickSort implements ProductSortingStrategy {

    @Override
    public void sort(Produto[] produtos, ProductComparator criteria, int ini, int fim) {
        if (ini < fim) {

            int q = particiona(produtos, criteria, ini, fim);

            sort(produtos, criteria, ini, q);
            sort(produtos, criteria, q + 1, fim);
        }
    }

    private int particiona(Produto[] produtos, ProductComparator criteria, int ini, int fim) {

        Produto x = produtos[ini];
        int i = (ini - 1);
        int j = (fim + 1);
        
        while (true) {
            boolean verify;
            do {
                j--;
                verify = criteria.compare(produtos[j], x) == 0 ? false : !selectOrder(criteria.compare(produtos[j],x));
            } while(verify);

            do {
                i++;
            } while(selectOrder(criteria.compare(produtos[i], x)));

            if (i < j) {
                Produto temp = produtos[i];
                produtos[i] = produtos[j];
                produtos[j] = temp;
            } else
                return j;
        }
    }

    @Override
    public boolean selectOrder(int num) {
        return num == 0 ? false : num < 0 ? false : true;
    }
}