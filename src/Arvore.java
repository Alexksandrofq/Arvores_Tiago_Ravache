public class Arvore {
    public No raiz;

    public Arvore(String conteudo){
        this.raiz = new No(conteudo);
    }

    public void inserir(String conteudo) {
        No novoNo = new No(conteudo);
        if(vazia()) {
            raiz = novoNo;
        }
    }

    public boolean vazia() {
        if(raiz == null) {
            return true;
        }
        return false;
    }



    public int contarNo() {
        int contador = 0;
        if(vazia()) {
            System.out.println("Está vazia");
        }
        while(raiz != null) {
            contador++;
        }
        return contador;
    }

    public void percorrerPreOrdem(No no) {
        if(no != null) {
            System.out.println(no.conteudo);
            percorrerPreOrdem(no.filhoEsquerdo);
            percorrerPreOrdem(no.filhoDireito);
        }
    }

    public void percorrerEmOrdem(No no) {
        if(no.filhoEsquerdo != null) {
            System.out.println(no.filhoEsquerdo);
            percorrerEmOrdem(no.filhoEsquerdo);
            percorrerEmOrdem(no.filhoDireito);

        }
    }


}
