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

---

## Exemplo de uso

```java
int[] valores = {3, 17, -5, 42, 8, 1};

MaiorMenor mm = new MaiorMenor(valores);
mm.encontrarMaior();

System.out.println("Maior elemento: " + mm.getMaior()); // 42
```

---

## Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento com atributos `private`
- Array nativo em Java (`int[]`)
- Construtores com passagem de parâmetros
- Métodos getters
- Estrutura de repetição `for-each`
- Uso de `Integer.MIN_VALUE` para inicialização segura de comparações

---
