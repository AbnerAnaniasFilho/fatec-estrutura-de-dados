import java.util.Random;

public class TesteComparacaoAlturas {

    public static void main(String[] args) {
        Random random = new Random();
        
        
        ArBinBusca arvoreComRepeticao = new ArBinBusca();
        ArBinBuscaSemRepeticao arvoreSemRepeticao = new ArBinBuscaSemRepeticao();

        int tamanhoTeste = 200;
        int limiteAleatorio = 100; 

        System.out.println("Iniciando teste de comparação (Exercício 10b)");
        System.out.println("Inserindo " + tamanhoTeste + " elementos aleatórios (0-99) em ambas as árvores...");
        
        for (int i = 0; i < tamanhoTeste; i++){
            int n = random.nextInt(limiteAleatorio); 
            arvoreComRepeticao.insere(n);
            arvoreSemRepeticao.insere(n);
        }

        System.out.println("Inserção concluída.");
        System.out.println("-------------------------------------------------");

        System.out.println("\nÁrvore COM Repetição (em-ordem):");
        System.out.println(arvoreComRepeticao);
        
        System.out.println("\nÁrvore SEM Repetição (em-ordem com contagem):");
        System.out.println(arvoreSemRepeticao);

        System.out.println("\n--- RESULTADO DA COMPARAÇÃO DE ALTURAS ---");
        System.out.println("Altura da Árvore COM Repetição: " + arvoreComRepeticao.alturaAr());
        System.out.println("Altura da Árvore SEM Repetição: " + arvoreSemRepeticao.alturaAr());
        System.out.println("-------------------------------------------------");
        System.out.println("Conclusão: A árvore sem repetição tende a ser significativamente mais baixa (mais balanceada),");
        System.out.println("pois valores repetidos não aumentam a profundidade da árvore.");
    }
}
