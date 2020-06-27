public enum InsertionSortCriteria implements ProductCompare{

    DESCRIPTION_CRESC {
        public boolean compare(Produto p1, Produto p2 ){
            return p1.getDescricao().compareToIgnoreCase(p2.getDescricao()) < 0 ;
        }
    },
    PRECO_CRESC {
        @Override
        public boolean compare(Produto p1, Produto p2) {
            return p1.getPreco() < p2.getPreco();
        }
    },
    ESTOQUE_CRESC {
        @Override
        public boolean compare(Produto p1, Produto p2) {
            return p1.getQtdEstoque() < p2.getQtdEstoque();
        }
    },
}