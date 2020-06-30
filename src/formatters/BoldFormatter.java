package formatters;

import decorators.BoldHTMLDecorator;
import model.Produto;

public class BoldFormatter implements HTMLFormatter {

    @Override
    public Produto decorate(Produto produto) {
        return new BoldHTMLDecorator(produto);
    }
    
}