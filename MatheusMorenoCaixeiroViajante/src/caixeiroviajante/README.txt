Engenharia da Computação
Matéria: Projeto e Analise de Algoritmos
Aluno: Matheus Henrique Moreno da Silva
Prof: Douglas Donizeti de Castilho Braz
Trabalho 3, Resolução do Problema do Caixeiro Viajante(Travelling Salesman Problem), em Java 
com resolução por "tentativa e erro" e uma solução utilizando algoritmo genetico.
Para a solucao de tentatica e erro, foi abordado as seguintes soluções:
    Uma abordagem de Backtracking com algumas otimizações.
Temos o metodo "escolherInicioHeuristico":
    onde foi implementado a heuristica de escolher o nó inicial com base na menor soma de pesos de arestas de saida;
    calculando a soma de pesos das arestas de saida e escolhendo o vértice com a menor soma.

Temos o metodo "backTracking":
    onde foi implementado o algoritmo de Backtracking para encontrar o caminho minimo;
    verificando se todas as cidades foram visitadas, se as mesmas foram visitadas, 
    atualiza o custo total e imprime o caminho se for menor que o custo atual, atraves de umas busca recursiva.
Temos o metodo "updateCostAndPrintPath":
    onde atualiza o custo total e imprime o caminho se o novo custo for menor que o custo atual.
Temos o metodo "calculateMinRemainingCost":
    onde calcula o custo mínimo restante com base nos vértices ainda não visitados.
Temos o metodo "updatePathAndRecurse":
    onde apenas atualiza o caminho e continua a busca recursiva.
Temos o metodo generateMemoKey":
    *tabela de memoização: uma tabela de cache para evitar ter que recalcular o valor de uma função mais de uma vez.
    onde gera uma chave unica para a tabela de memoização com base no caminho atual.
Temos uma Tabela de Memoização ("memoTable"), para armazenar resultados intermediarios e evitar o recalculo de soluções ja visitadas.

Temos a variavel maxDepth para definir o limite máximo de profundidade durante a execucao do algoritmo de backTracking,
utilizando para otimizar a limite da busca de caminhos promissores e evitar a exploração desnecessária de ramos.
