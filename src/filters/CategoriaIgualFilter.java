package filters;

import model.Produto;

public class CategoriaIgualFilter implements IFilterStrategy {

    private String nome;

    public CategoriaIgualFilter(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean isSelected(Produto produto) {
        return produto.getCategoria().equalsIgnoreCase(nome);
    }
    
}