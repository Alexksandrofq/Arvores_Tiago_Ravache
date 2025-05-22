//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore("A");
        arvore.raiz.filhoEsquerdo =  new No("B");
        arvore.raiz.filhoDireito =  new No("C");

        No no = new No("D");


    }
}