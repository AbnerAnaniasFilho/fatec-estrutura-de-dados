import java.util.Random;

public class TesteArvore {

    public static void main(String[] args) {
        Random random = new Random();
        ArBinBusca abb = new ArBinBusca();

        
        abb.insere(25); 

        for (int i = 1; i <= 12; i++){
            int n = random.nextInt(60);
            System.out.print(n + " ");
            abb.insere(n);
        }
        abb.insere(25);

        System.out.println("\n\n--- Árvore (Percurso Em-Ordem) ---");
        System.out.println(abb);
        System.out.println("\n--- Percursos Adicionais ---");
        System.out.println("Pre-Ordem (R-E-D): " + abb.percursoPreOrdem());
        System.out.println("Pos-Ordem (E-D-R): " + abb.percursoPosOrdem());

        System.out.println("\n--- Estatísticas da Árvore ---");
        System.out.println("Altura = " + abb.alturaAr());
        System.out.println("Quant. Nós = " + abb.contaNo());
        System.out.println("Quant. Folhas = " + abb.contaFolhas());
        System.out.println("Soma dos Elementos = " + abb.somaElementos());

        System.out.println("\n--- Elementos Min/Max ---");
        try {
            System.out.println(abb.maior() + " e o maior");
            System.out.println(abb.menor() + " e o menor");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); 
        }

        System.out.println("\n--- Testes de Busca ---");
        int valorBusca = 25;
        System.out.println(abb.busca(valorBusca) ? valorBusca + " esta na arvore" : valorBusca + " nao esta na arvore");
        System.out.println("O valor " + valorBusca + " aparece " + abb.contaOcorrencias(valorBusca) + " vez(es)");
    
        int valorBusca2 = 99;
        System.out.println(abb.busca(valorBusca2) ? valorBusca2 + " esta na arvore" : valorBusca2 + " nao esta na arvore");
        System.out.println("O valor " + valorBusca2 + " aparece " + abb.contaOcorrencias(valorBusca2) + " vez(es)");
    }
}