import decorators.BoldHTMLDecorator;
import decorators.ColorHTMLDecorator;
import decorators.ItalicHTMLDecorator;
import decorators.UnderlineDecorator;
import model.Produto;
import model.ProdutoPadrao;

public class PatternsExample {

    public static void main(String[] args) {

        Produto p = new ProdutoPadrao(1, "League of Legends", "Game", 500, 120);

        Produto decorado = 
        new UnderlineDecorator(
            new BoldHTMLDecorator(
                new ItalicHTMLDecorator(
                    new ColorHTMLDecorator(
                        p, "red")
                )
            )
        );
        /**
         * <span style='text-decoration: underline'>
         *  <b>
         *     <i>
         *          <span style='color: red'> 
         *              League of Legends, Game, R$ 120,00, 500 unidade(s) em estoque
        *           </span>
             </i>
             </b>
        </span>
         */

        System.out.println(decorado.formataParaImpressao());


    }
    
}