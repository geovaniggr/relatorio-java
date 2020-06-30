package formatters;

import decorators.ItalicHTMLDecorator;
import model.Produto;

public class ItalicFormatter implements HTMLFormatter {

    @Override
    public Produto decorate(Produto produto) {
        return new ItalicHTMLDecorator(produto);
    }
    
}