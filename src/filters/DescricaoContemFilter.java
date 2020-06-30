package filters;

import model.Produto;

public class DescricaoContemFilter implements IFilterStrategy {

    private String termo;

    public DescricaoContemFilter(String termo) {
        this.termo = termo;
    }

    @Override
    public boolean isSelected(Produto produto) {
        return produto.getDescricao().contains(termo);
    }
    
}