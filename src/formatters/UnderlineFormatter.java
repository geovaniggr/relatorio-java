package formatters;

import decorators.UnderlineDecorator;
import model.Produto;

public class UnderlineFormatter implements HTMLFormatter {

    @Override
    public Produto decorate(Produto produto) {
        return new UnderlineDecorator(produto);
    }
    
}