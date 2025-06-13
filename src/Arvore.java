import java.awt.*;
import static java.awt.Color.black;

public class Arvore {
    private No root;
    private final No NIL;

    int altura(No no){
        if (no == null)
            return 0;
        return no.altura;
    }

    public Arvore(Color no) {

        NIL =  new No(-1);
        NIL.color = Color.BLACK;
        NIL.esquerdo = NIL.direito = NIL.pai = null;
        root = null;
    }

    private void rotacaoEsquerda(No x) {
        No y = x.direito;
        x.direito = y.esquerdo;
        if (y.esquerdo != NIL) y.esquerdo.pai = x;

        y.pai = x.pai;

        if(x.pai == null) root = y;
        else if (x == x.pai.esquerdo) x.pai.esquerdo = y;
        else x.pai.direito = y;

        y.esquerdo = x;
        x.pai = y;
    }

    private void rotacaoDireita(No y) {
        No x = y.esquerdo;
        y.esquerdo = x.direito;
        if(x.direito != NIL) x.direito.pai = y;

        x.pai = y.pai;

        if(y.pai == null) root = x;
        else if (y == y.pai.direito) y.pai.direito = x;
        else y.pai.esquerdo = x;

        x.direito = y;
        y.pai = x;
    }

    public void inserir(int chave) {
        No no = new No(chave);
        no.esquerdo = no.direito = no.pai = NIL;

        No y = null;
        No x = root;

        while (x != NIL) {
            y = x;
            if (no.chave < x.chave) x = x.esquerdo;
            else x = x.direito;
        }

        no.pai = y;
        if (y == null) root = no;
        else if (no.chave < y.chave) y.esquerdo = no;
        else y.direito = no;

        no.esquerdo = NIL;
        no.direito = NIL;
        no.color = Color.RED;

        inserirFIX(no);
    }

    private void inserirFIX(No k) {
        while (k.pai != null && k.pai.color == Color.RED) {
            if (k.pai == k.pai.pai.esquerdo) {
                No u = k.pai.pai.direito;
                if (u.color == Color.RED) {
                    k.pai.color = Color.BLACK;
                    u.color = Color.BLACK;
                    k = k.pai.pai;
                } else {
                    if (k == k.pai.direito) {
                        k = k.pai;
                        rotacaoEsquerda(k);
                    }
                    k.pai.color = Color.BLACK;
                    k.pai.pai.color = Color.RED;
                    rotacaoDireita(k.pai.pai);
                }
            }
        }
    }

}
