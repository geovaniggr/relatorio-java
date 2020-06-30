package decorators;

import model.Produto;

public class BoldHTMLDecorator extends ProductDecorator {

    public BoldHTMLDecorator(Produto produto) {
        super(produto);
    }

    @Override
    public void setQtdEstoque(int qtdEstoque) {
        base.setQtdEstoque(qtdEstoque);
    }

    @Override
    public void setPreco(double preco) {
        base.setPreco(preco);

    }

    @Override
    public int getId() {
        return base.getId();
    }

    @Override
    public String getDescricao() {
        return base.getDescricao();
    }

    @Override
    public String getCategoria() {
        return base.getCategoria();
    }

    @Override
    public int getQtdEstoque() {
        return base.getQtdEstoque();
    }

    @Override
    public double getPreco() {
        return base.getPreco();
    }

    @Override
    public String formataParaImpressao() {
        return "<b>" + super.formataParaImpressao() + "</b>";
    }

}