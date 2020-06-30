package filters;

import model.Produto;

public class EstoqueMenorIgualFilter implements IFilterStrategy {

    private double valor;

    public EstoqueMenorIgualFilter(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean isSelected(Produto produto) {
        return produto.getPreco() <= valor;
    }
    
}