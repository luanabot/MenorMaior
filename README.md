# MaiorMenor — Encontrando o Maior Elemento de um Array em Java

Projeto desenvolvido como exercício de programação orientada a objetos em Java.
O programa recebe um array de inteiros, percorre seus elementos e determina o maior valor contido nele.

---

## Funcionalidades

- Armazena um array nativo de inteiros (`int[]`)
- Percorre o array e encontra o maior elemento
- Estruturado com atributos privados e métodos getters
- Array gerado diretamente no `main` e passado como parâmetro para a classe

---

## Estrutura da classe

| Componente | Tipo | Descrição |
|---|---|---|
| `numeros` | `int[]` | Array nativo que armazena os valores |
| `maior` | `int` | Guarda o maior valor encontrado |
| `menor` | `int` | Guarda o menor valor encontrado |
| `MaiorMenor(int[])` | Construtor | Recebe o array e inicializa os atributos |
| `encontrarMaior()` | Método | Percorre o array e determina o maior elemento |
| `getMaior()` | Getter | Retorna o maior valor |
| `getMenor()` | Getter | Retorna o menor valor |

---

## Como executar

### Pré-requisitos
- Java 17 ou superior instalado
- IntelliJ IDEA (ou qualquer IDE Java)

### Passo a passo

1. Clone o repositório
```bash
   git clone https://github.com/seu-usuario/maiormenor.git
```

2. Abra o projeto no IntelliJ IDEA

3. Localize o arquivo `MaiorMenor.java` dentro da pasta `src`

4. Clique na seta ▶ ao lado do método `main` ou pressione `Shift + F10`

5. Veja o resultado no console:
