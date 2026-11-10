# Árvore Binária de Busca em Java (`JavaTree`)

Projeto de estudo de **Estrutura de Dados** com implementação genérica de uma **Árvore Binária de Busca** (*Binary Search Tree* - BST) em Java.

## Estrutura do Projeto

Os arquivos-fonte estão localizados no diretório `src/`:

- **`Node<T extends Comparable<T>>`**: Representa um nó da árvore binária, armazenando o dado genérico (`T`) e as referências para os nós filhos da `esquerda` e da `direita`.
- **`BinarySearchTree<T extends Comparable<T>>`**: Implementa a estrutura da Árvore Binária de Busca e suas operações principais:
  - `add(T dado)`: Inserção recursiva mantendo a propriedade de ordenação da BST.
  - `buscar(T dadoBusca)`: Busca recursiva utilizando `equals` e `compareTo`.
  - `preOrder()`: Percurso em pré-ordem (Raiz, Esquerda, Direita).
  - `inOrder()`: Percurso em ordem simétrica (Esquerda, Raiz, Direita).
  - `postOrder()`: Percurso em pós-ordem (Esquerda, Direita, Raiz).
- **`App`**: Classe principal com menu interativo via console para testar as operações da árvore.

## Como Executar

Compile e execute a classe `App` a partir da pasta raiz do projeto:

```bash
javac -d bin src/*.java
java -cp bin App
```
