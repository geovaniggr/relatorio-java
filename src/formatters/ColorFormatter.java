package formatters;

import decorators.ColorHTMLDecorator;
import model.Produto;

public class ColorFormatter implements HTMLFormatter {

    private String color;

    public ColorFormatter(final String color) {
        this.color = color;
    }

    @Override
    public Produto decorate(final Produto produto) {
        return new ColorHTMLDecorator(produto, color);
    }
    
}