### Problematização

Considere que a sua equipe está sendo contratada por uma indústria com a finalidade de realizar, de forma econômica, a compra de contratos de energia para os próximos _n_ meses (1, 2, ..., _n_ ). No mercado, atuam _m_ fornecedores de energia (1, 2, ..., _m_ ) que oferecem contratos com diferentes horizontes de tempo e preços diversos. A sua equipe está encarregada em definir, dentre os contratos ofertados no mercado, um subconjunto que atenda de forma econômica a demanda de energia da indústria no período integral de _n_ meses, sabendo que é possível manter contratos com diferentes fornecedores, **ainda que se pague uma taxa** **_t_** **, paga à companhia de distribuição de energia, a cada mudança de fornecedor**. Considere ainda que o consumo da empresa não varia ao longo dos meses. Assim, um contrato pode ser caracterizado por um fornecedor, um mês de início do fornecimento, um mês de fim do fornecimento e o valor do contrato. Como exemplo, o contrato <1; 1; 5; 10.0> refere-se a um contrato do fornecedor 1 que se compromete a fornecer energia durante os meses de 1 a 5 com um valor total de $10,0. Para um mesmo fornecedor, os contratos seguem as regras de formação de preço:


a) Um contrato referente ao período completo do mês _i_ ao mês _j_ jamais possui valor inferior ao valor de
um contrato cuja abrangência está contida entre o período do mês _i_ ao mês _j_. Por exemplo, o contrato
<1; 1; 3; 108.0> tem obrigatoriamente valor maior ou igual ao valor dos contratos: \
<1; 1; 1; 10.0>; ou  \
<1; 1; 2; 105.0>; ou \
<1; 2; 3; 102.0>.

b) Um contrato referente ao período completo do mês _i_ ao mês _j_ jamais possui valor superior à soma dos
valores de contratos que, em conjunto, perfazem o mesmo período do mês _i_ ao mês _j_. Por exemplo, o
contrato <1; 1; 3; 108.0> tem obrigatoriamente valor menor ou igual aos valores dos contratos: \
<1; 1; 1; 10.0> + <1; 2; 2; 100.0> + <1; 3; 3; 10.0>, cujo valor total é $120; ou \
<1; 1; 1; 10.0> + <1; 2; 3; 102.0>, cujo valor total é $112; ou \
<1; 1; 2; 105.0> + <1; 3; 3; 10.0>, cujo valor total é $115.

#### Entrada de Dados

O arquivo de entrada (.txt) descreve uma instância do problema. A primeira linha do arquivo
contém um inteiro indicando a quantidade _n_ de meses de contratação de energia, um inteiro indicando a
quantidade _m_ de fornecedores de energia, e **um valor contínuo indicando o valor da taxa** **_t_** **de mudança
de fornecedor**. A seguir, cada linha do arquivo refere-se aos dados de um contrato diferente, indicando o
fornecedor, o mês de início do fornecimento, o mês de fim do fornecimento e o valor do contrato
(separados por um espaço simples). A seguir, apresenta-se um exemplo de entrada de dados. Na
avaliação, o arquivo de entrada pode conter uma instância de grande porte ( _n_ ≤ 120 e _m_ ≤ 100).

Exemplo de Entrada de Dados

3 2 30.0\
1 1 1 10.0\
1 2 2 100.0\
1 3 3 10.0\
1 1 2 105.0\
1 2 3 102.0\
1 1 3 108.0\
2 1 1 80.0\
2 2 2 20.0\
2 3 3 50.0\
2 1 2 95.0\
2 2 3 60.0\
2 1 3 115.


Exemplos de Soluções Viáveis (não necessariamente econômicas)
<1; 1; 3; 108.0> com custo total de $108; \
<1; 1; 1; 10.0> e <2; 2; 3; 60.0> com custo total de $100 = $10 + **$30** + $60; \
<1; 1; 1; 10.0>, <2; 2; 2; 20.0> e <1; 3; 3; 10.0> com custo total de $100 = $10 + **$30** + $20 + **$30** + $10;

#### Atividades

Atividades da 2a entrega:
a) Realizar a leitura do arquivo de entrada, armazenando os dados dos contratos (0,5 ponto):
1. Em um vetor de objetos do tipo contrato; e
2. Em uma matriz, indexada pelo fornecedor, pelo mês de início e pelo mês de fim do contrato, onde
    cada elemento armazena o valor do contrato respectivo.
    
b) Explicar qual das duas maneiras de armazenamento dos dados é mais eficiente, em relação ao consumo
de memória, tanto em termos assintóticos quanto em termos de valores absolutos. (0,5 ponto)

c) Implementar o método de ordenação _Insertion Sort_ para ordenar o vetor de objetos do tipo contrato.
Criar um _clone_ do vetor e aplicar o método de ordenação, exibindo ao final o tempo total de execução da
ordenação. (1,0 ponto)

d) Apresentar a complexidade da função descrita no item anterior, fazendo uso de notação assintótica e
tendo como parâmetros somente a quantidade _n_ de meses e a quantidade _m_ de fornecedores. (0,5 ponto)

e) Implementar o método de ordenação _Mergesort_ para ordenar o vetor de objetos do tipo contrato. Criar
um _clone_ do vetor e aplicar o método de ordenação, exibindo ao final o tempo total de execução da
ordenação. (1,0 ponto)

f) Apresentar a complexidade da função descrita no item anterior, fazendo uso de notação assintótica e
tendo como parâmetros somente a quantidade _n_ de meses e a quantidade _m_ de fornecedores. (0,5 ponto)

g) Implementar o método de ordenação _Heapsort_ para ordenar o vetor de objetos do tipo contrato. Criar
um _clone_ do vetor e aplicar o método de ordenação, exibindo ao final o tempo total de execução da
ordenação. (1,0 ponto)

h) Apresentar a complexidade da função descrita no item anterior, fazendo uso de notação assintótica e
tendo como parâmetros somente a quantidade _n_ de meses e a quantidade _m_ de fornecedores. (0,5 ponto)

i) Implementar o método de ordenação _Quicksort_ para ordenar o vetor de objetos do tipo contrato. Criar
um _clone_ do vetor e aplicar o método de ordenação, exibindo ao final o tempo total de execução da
ordenação. (1,0 ponto)

j) Apresentar a complexidade da função descrita no item anterior, fazendo uso de notação assintótica e
tendo como parâmetros somente a quantidade _n_ de meses e a quantidade _m_ de fornecedores. (0,5 ponto)

k) Baseando-se nas ideias dos algoritmos apresentados, criar um método de ordenação que, entretanto,
explore as regras de formação de preços de contratos de um fornecedor (expressas na matriz de
contratos), para realizar a ordenação dos contratos pelo valor. (2,0 pontos)

l) Apresentar a complexidade da função descrita no item anterior, fazendo uso de notação assintótica e
tendo como parâmetros somente a quantidade _n_ de meses e a quantidade _m_ de fornecedores. (1,0 ponto)
