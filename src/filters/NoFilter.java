package filters;

import model.Produto;

public class NoFilter implements IFilterStrategy {

    @Override
    public boolean isSelected(Produto produto) {
        return true;
    }
    
}