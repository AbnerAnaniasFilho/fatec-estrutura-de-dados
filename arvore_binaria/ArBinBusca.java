public class ArBinBusca{

    private No raiz;
    //construtor padão
    
    public boolean estaVazia(){
        return raiz == null;
    } 


    public void insere(int info){
        No novo = new No(info);
        if (estaVazia()){
            raiz = novo;
        } else {
            insereRec(novo, raiz);
        }
    }

    private void insereRec(No novo, No atual){
            if (novo.getInfo() > atual.getInfo()){ 
                if (atual.getDireito() == null){
                    atual.setDireito(novo);
                } else {
                    insereRec(novo, atual.getDireito());
                }
            }
            else {
                if (atual.getEsquerda() == null){
                    atual.setEsquerda(novo);
                } else {
                    insereRec(novo, atual.getEsquerda());
                }

            }
    }

   
    @Override
    public String toString(){
        if (estaVazia()) return "Arvore vazia";
        return toStringRec(raiz);
    }

    private String toStringRec(No atual){
        if (atual == null) return ""; 
        String s = "";
        s += toStringRec(atual.getEsquerda());
        s += atual.getInfo() + " ";
        s += toStringRec(atual.getDireito());
        return s;
    }

    
    public int alturaAr(){
        if (estaVazia() || (raiz.getEsquerda() == null && raiz.getDireito() == null)){
            return 0;
        }
        return alturaArRec(raiz);
    }

    private int alturaArRec(No atual){
        if (atual == null || (atual.getDireito() == null && atual.getEsquerda() == null)) return 0;

        int alturaEsq = alturaArRec(atual.getEsquerda());
        int alturaDir = alturaArRec(atual.getDireito());
        return alturaDir > alturaEsq ? alturaDir+1 : alturaEsq+1;
    }

    
    public int contaNo(){
        if (estaVazia()){
            return 0;
        }
        return contaNoRec(raiz);
    }

    private int contaNoRec(No atual){
        if (atual == null){
            return 0;
        }
        return contaNoRec(atual.getEsquerda()) + 1 + contaNoRec(atual.getDireito());
    }

    
    public boolean busca(int x){
        if (estaVazia()) {return false;}
        return buscaRec(x, raiz);
    }

    private boolean buscaRec(int x, No atual){
        if(atual == null) return false;
        
        
        if(x == atual.getInfo()) return true; 

        
        if(x > atual.getInfo()) {
            return buscaRec(x, atual.getDireito());
        } else {
            return buscaRec(x, atual.getEsquerda());
        }
    }

    public int maior(){
        if(estaVazia()) throw new RuntimeException("Arvore Vazia");
        No atual = raiz;
        while (atual.getDireito() != null) {
            atual = atual.getDireito();
        }
        return atual.getInfo();
    }

    public int contaOcorrencias(int x) {
        return contaOcorrenciasRec(x, raiz);
    }

    private int contaOcorrenciasRec(int x, No atual) {
        if (atual == null) return 0;

        if (x == atual.getInfo()) {
            return 1 + contaOcorrenciasRec(x, atual.getEsquerda());
        } 
        
        if (x > atual.getInfo()) {
            return contaOcorrenciasRec(x, atual.getDireito());
        } else { 
            return contaOcorrenciasRec(x, atual.getEsquerda());
        }
    }

    public int contaFolhas() {
        return contaFolhasRec(raiz);
    }

    private int contaFolhasRec(No atual) {
        if (atual == null) return 0;

        if (atual.getEsquerda() == null && atual.getDireito() == null) {
            return 1;
        }

        return contaFolhasRec(atual.getEsquerda()) + contaFolhasRec(atual.getDireito());
    }

    public int menor() {
        if (estaVazia()) throw new RuntimeException("Arvore Vazia");
        No atual = raiz;
        while (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }
        return atual.getInfo();
    }

    public int somaElementos() {
        return somaElementosRec(raiz);
    }

    private int somaElementosRec(No atual) {
        if (atual == null) return 0;

        return somaElementosRec(atual.getEsquerda()) + atual.getInfo() + somaElementosRec(atual.getDireito());
    }

    public String percursoPreOrdem() {
        return percursoPreOrdemRec(raiz);
    }

    private String percursoPreOrdemRec(No atual) {
        if (atual == null) return "";
        
        String s = "";
        s += atual.getInfo() + " "; 
        s += percursoPreOrdemRec(atual.getEsquerda()); 
        s += percursoPreOrdemRec(atual.getDireito());
        return s;
    }


    public String percursoPosOrdem() {
        return percursoPosOrdemRec(raiz);
    }

    private String percursoPosOrdemRec(No atual) {
        if (atual == null) return "";
        
        String s = "";
        s += percursoPosOrdemRec(atual.getEsquerda()); 
        s += percursoPosOrdemRec(atual.getDireito()); 
        s += atual.getInfo() + " "; 
        return s;
    }
}