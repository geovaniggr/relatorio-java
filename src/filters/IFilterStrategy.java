package filters;

import model.Produto;

public interface IFilterStrategy {
   public boolean isSelected(Produto produto); 
}