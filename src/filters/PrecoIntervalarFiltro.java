package filters;

import model.Produto;

public class PrecoIntervalarFiltro implements IFilterStrategy {

    private double valorMaximo;
    private double valorMinimo;

    public PrecoIntervalarFiltro(double valorMinimo, double valorMaximo) {
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
    }

    @Override
    public boolean isSelected(Produto produto) {
        return produto.getPreco() >= valorMinimo && produto.getPreco() <= valorMaximo;
    }
    
}