public class ArBinBuscaSemRepeticao {

    private NoContagem raiz;
    
    public boolean estaVazia(){
        return raiz == null;
    } 

    public void insere(int info){
        if (estaVazia()){
            raiz = new NoContagem(info);
        } else {
            insereRec(info, raiz);
        }
    }

    private void insereRec(int info, NoContagem atual){
        
        if (info == atual.getInfo()) {
            atual.incrementaContagem(); 
        
        } else if (info > atual.getInfo()){ 
            if (atual.getDireito() == null){
                atual.setDireito(new NoContagem(info));
            } else {
                insereRec(info, atual.getDireito());
            }
        
        } else { 
            if (atual.getEsquerda() == null){
                atual.setEsquerda(new NoContagem(info));
            } else {
                insereRec(info, atual.getEsquerda());
            }
        }
    }

    @Override
    public String toString(){
        if (estaVazia()) return "Arvore (sem repeticao) vazia";
        return toStringRec(raiz);
    }

    private String toStringRec(NoContagem atual){
        if (atual == null) return ""; 

        String s = "";
        s += toStringRec(atual.getEsquerda());
        s += atual.toString() + " "; 
        s += toStringRec(atual.getDireito());
        return s;
    }

    public int alturaAr(){
        if (estaVazia() || (raiz.getEsquerda() == null && raiz.getDireito() == null)){
            return 0;
        }
        return alturaArRec(raiz);
    }

    private int alturaArRec(NoContagem atual){
        if (atual == null || (atual.getDireito() == null && atual.getEsquerda() == null)) return 0;

        int alturaEsq = alturaArRec(atual.getEsquerda());
        int alturaDir = alturaArRec(atual.getDireito());
        return alturaDir > alturaEsq ? alturaDir+1 : alturaEsq+1;
    }
}