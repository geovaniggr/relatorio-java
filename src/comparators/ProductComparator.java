package comparators;

import model.Produto;

public enum ProductComparator implements ComparatorStrategy<Produto> {

    DESCRIPTION_CRESC {
        @Override
        public int compare(Produto p1, Produto p2) {
            return p1.getDescricao().compareToIgnoreCase(p2.getDescricao());
        };
   },
    PRECO_CRESC {
        @Override
        public int compare(Produto p1, Produto p2) {
            if( p1.getPreco() < p2.getPreco())
                return 1;
            if ( p1.getPreco() > p2.getPreco())
                return -1;
            return 0; 
        }
   },
    ESTOQUE_CRESC {
        @Override
        public int compare(Produto p1, Produto p2) {
            if (p1.getQtdEstoque() < p2.getQtdEstoque())
                return 1;
            if (p1.getQtdEstoque() > p2.getQtdEstoque())
                return -1;
            return 0;
        };

   },
    DESCRICAO_DECRESC {
        @Override
        public int compare(Produto p1, Produto p2) {
            return p1.getDescricao().compareToIgnoreCase(p2.getDescricao());
        }
   },
    PRECO_DECRESC {
        @Override
        public int compare(Produto p1, Produto p2) {
            if(p1.getPreco() > p2.getPreco())
                return 1;
            if(p1.getPreco() < p2.getPreco())
                return -1;
            return 0;
        }
   },
    ESTOQUE_DECRESC {
        @Override
        public int compare(Produto p1, Produto p2) {
            if(p1.getQtdEstoque() > p2.getQtdEstoque())
                return 1;
            if(p1.getQtdEstoque() < p2.getQtdEstoque())
                return -1;
            return 0;
        };
   }
}