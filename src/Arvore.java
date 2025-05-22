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



    public int contarNo(No no) {
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
        if(no != null) {
            percorrerEmOrdem(no.filhoEsquerdo);
            System.out.println(no.conteudo);
            percorrerEmOrdem(no.filhoDireito);

        }
    }

    public void percorrerPosOrdem(No no) {
        if(no != null) {
            percorrerPosOrdem(no.filhoEsquerdo);
            percorrerPosOrdem(no.filhoDireito);
            System.out.println(no.conteudo);
        }
    }

    public void percorrerNivel(No no) {
        if(no != null) {
            System.out.println(no.conteudo);
            percorrerNivel(no.filhoEsquerdo);
        } else {
            System.out.println("não há nó");
        }
    }


    public void percorrerPreOredemSemRecursividade(No no) {
        while(no != null) {
            percorrerPreOredemSemRecursividade(no.filhoEsquerdo);
            if(no.filhoEsquerdo != null) {
                System.out.println(no.conteudo);

            }
            no = no.filhoDireito;
        }
    }

    public void percorrerEmOrdemSemRecursividade(No no) {
        while(no != null) {
            percorrerPreOredemSemRecursividade(no.filhoEsquerdo);
            if(no.filhoEsquerdo == null) {
                System.out.println(no.conteudo);
            }
            no = no.filhoDireito;
        }
    }

    public void percorrerPosOrdemSemRecursividade(No no) {
        while(no != null) {
            percorrerPosOrdemSemRecursividade(no.filhoEsquerdo);
            if(no.filhoEsquerdo == null) {
                percorrerPosOrdemSemRecursividade(no.filhoDireito);
                if(no.filhoDireito == null) {
                    System.out.println(no.conteudo);
                }
            }
            no = no.filhoDireito;
        }
    }



}
