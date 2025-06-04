import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Arvore {
    public No raiz;

    public Arvore(String conteudo){
        this.raiz = new No(conteudo);
    }


    public boolean vazia() {
        if(raiz == null) {
            return true;
        }
        return false;
    }



    public int contarNo(No no) {
        if (no == null) return 0;
        return 1 + contarNo(no.filhoEsquerdo) + contarNo(no.filhoDireito);
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

//    public void percorrerNivel(No no) {
//        if(no != null) {
//            System.out.println(no.conteudo);
//            percorrerNivel(no.filhoEsquerdo);
//        } else {
//            System.out.println("não há nó");
//        }
//    }

    public void percorrerNivel() {
        if(raiz == null) return;

        Queue<No> fila = new LinkedList<No>();
        fila.add(raiz);

        while(!fila.isEmpty()) {
            No no = fila.poll();
            System.out.println(no.conteudo);

            if(no.filhoEsquerdo != null) {
                fila.add(no.filhoEsquerdo);
            }
            if(no.filhoDireito != null) {
                fila.add(no.filhoDireito);
            }
        }
    }


    public void percorrerPreOrdemSemRecursividade() {
        if(raiz == null) return;
        Stack<No> pilha = new Stack<No>();
        pilha.push(raiz);

        while (!pilha.isEmpty()){
            No atual = pilha.pop();
            System.out.println(atual.conteudo);

            if(atual.filhoDireito != null) pilha.push(atual.filhoDireito);
            if(atual.filhoEsquerdo!= null) pilha.push(atual.filhoEsquerdo);
        }
    }

    public void percorrerEmOrdemSemRecursividade(No no) {
        Stack<No> pilha = new Stack<>();
        No atual = raiz;

        while (atual != null || !pilha.isEmpty()){
            while (atual != null) {
                pilha.push(atual);
                atual = atual.filhoEsquerdo;
            }
            atual = pilha.pop();
            System.out.println(atual.conteudo);
            atual = atual.filhoDireito;
        }
    }

    public void percorrerPosOrdemSemRecursividade(No no) {
        if (raiz == null) return;

        Stack<No> pilha1 = new Stack<>();
        Stack<No> pilha2 = new Stack<>();
        pilha1.push(raiz);

        while (!pilha1.isEmpty()){
            No atual = pilha1.pop();
            pilha2.push(atual);

            if (atual.filhoEsquerdo != null) pilha1.push(atual.filhoEsquerdo);
            if (atual.filhoDireito != null) pilha2.push(atual.filhoDireito);
        }

        while (!pilha2.isEmpty()){
            System.out.println(pilha2.pop().conteudo);
        }
    }


    public int contarFolhasComRecursividade(No no) {
        if (no == null) return 0;
        if (no.filhoEsquerdo == null && no.filhoDireito == null) return 1;
        return contarFolhasComRecursividade(no.filhoEsquerdo) + contarFolhasComRecursividade(no.filhoDireito);
    }

    public int contarFolhaSemRecursividade() {
        if (raiz == null) return 0;

        int contador = 0;
        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);

        while (!pilha.isEmpty()){
            No atual = pilha.pop();
            if (atual.filhoEsquerdo == null && atual.filhoDireito == null) {
                contador++;
            }
            if (atual.filhoEsquerdo != null) pilha.push(atual.filhoDireito);
            if(atual.filhoDireito != null) pilha.push(atual.filhoEsquerdo);
        }
        return contador;
    }

    public void inserir(No no) {
        if (no == null) return;
        if (no.filhoEsquerdo == null) no.filhoEsquerdo = no;
        if (no.filhoDireito == null) no.filhoDireito = no;
    }

    public void remover(No conteudo) {
        if (no == null) return;
        No aux = getConteudo
    }

    public void bucar(No no) {
        if (raiz == null) return;
        if (no.filhoEsquerdo == no)
            System.out.println(no);
        if (no.filhoDireito == no)
            System.out.println(no);
        if (raiz == no)
            System.out.println(raiz);
    }


}
