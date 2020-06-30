package decorators;

import model.Produto;

public abstract class ProductDecorator implements Produto {

    protected Produto base;

    public ProductDecorator(Produto produto) {
        this.base = produto;
    }

    @Override
    public String formataParaImpressao() {
        return base.formataParaImpressao();
    }

}