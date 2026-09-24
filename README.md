# Estrutura de Dados — FATEC

Implementações de estruturas de dados desenvolvidas ao longo do curso de Análise e Desenvolvimento de Sistemas na FATEC — vetores, pilhas, filas, listas e árvores binárias, em Java, com alguns exemplos em C para ilustrar conceitos de memória.

## Estrutura do repositório

1. `vetor/` — Vetores e complexidade
    - Implementação própria de vetor (`NossoVetor`) e testes de ordenação com medição de tempo
    - `vetor.c`: exemplo em C mostrando o layout de memória de um array
    - `graficos.xlsx`: dados de comparação de crescimento entre complexidade logarítmica, linear e quadrática

2. `pilha/` — Pilhas com vetor
    - `Pilha.java` e exercícios de recursão (fatorial, Fibonacci, impressão recursiva)

3. `pilha_ligada/` — Pilhas com lista ligada

4. `fila_ligada_produtos/` — Fila ligada aplicada a um cenário de almoxarifado (cadastro e atendimento de produtos)

5. `lista_ligada/` — Lista ligada simples
    - Inclui um exemplo em C (`vetor.c`) para comparação de ponteiros/memória

6. `lista_com_ultimo/` — Lista ligada com referência ao último elemento (otimização de inserção no fim)

7. `lista_dupla_generica/` — Lista duplamente ligada genérica (uso de generics do Java)

8. `arvore_binaria/` — Árvores binárias de busca
    - Versões com e sem repetição de valores, nó com contagem de ocorrências, comparação de alturas entre as duas implementações

## Como executar

Cada pasta é um exercício independente, com sua própria classe de teste (`Teste*.java`). Compile e execute com:

```bash
javac NomeDoArquivo.java
java NomeDaClasse
```

Alguns exercícios usam generics (`lista_dupla_generica`) ou `package` — confira o topo do arquivo antes de compilar.
