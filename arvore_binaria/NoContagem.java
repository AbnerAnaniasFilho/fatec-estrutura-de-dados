public class NoContagem {

    private int info;
    private int contagem; 
    private NoContagem esquerda;
    private NoContagem direito;

    public NoContagem(int info){
        this.info = info;
        this.contagem = 1; 
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }
    
    public int getContagem() {
        return contagem;
    }

    public void incrementaContagem() {
        this.contagem++;
    }

    public NoContagem getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoContagem esquerda) {
        this.esquerda = esquerda;
    }

    public NoContagem getDireito() {
        return direito;
    }

    public void setDireito(NoContagem direito) {
        this.direito = direito;
    }

    @Override
    public String toString(){
        return "[" + info + " (" + contagem + "x)]";
    }
    
}