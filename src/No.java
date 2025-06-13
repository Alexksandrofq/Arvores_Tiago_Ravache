import java.awt.*;

enum Color{
    RED, BLACK,
}
public class No {
    int chave;
    Color color;
    No esquerdo, direito, pai;

    No (int chave) {
        this.chave = chave;
        this.color = Color.RED;
        this.esquerdo = null;
        this.direito = null;
        this.pai = null;
    }


}
