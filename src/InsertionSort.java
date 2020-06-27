public class InsertionSort implements SortingStrategy {

    @Override
    public void sort(int ini, int fim) {
        for (int i = ini; i <= fim; i++) {

            Produto x = produtos[i];
            int j = (i - 1);

            while (j >= ini) {

                if (criterio == CRIT_DESC_CRESC) {

                    if (x.getDescricao().compareToIgnoreCase(produtos[j].getDescricao()) < 0) {

                        produtos[j + 1] = produtos[j];
                        j--;
                    } else
                        break;
                } else if (criterio == CRIT_PRECO_CRESC) {

                    if (x.getPreco() < produtos[j].getPreco()) {

                        produtos[j + 1] = produtos[j];
                        j--;
                    } else
                        break;
                } else if (criterio == CRIT_ESTOQUE_CRESC) {

                    if (x.getQtdEstoque() < produtos[j].getQtdEstoque()) {

                        produtos[j + 1] = produtos[j];
                        j--;
                    } else
                        break;
                } else
                    throw new RuntimeException("Criterio invalido!");
            }

            produtos[j + 1] = x;
        }
    }

}