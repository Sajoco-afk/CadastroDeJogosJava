# 🎮 Cadastro de Jogos em Java

Projeto simples desenvolvido em **Java** com o objetivo de praticar conceitos básicos de **Programação Orientada a Objetos (POO)**, incluindo a criação e utilização de classes e objetos.

## 📚 Sobre o projeto

O programa cria diferentes objetos da classe `Jogo` e atribui informações como:

- 🎮 Nome do jogo
- 🏷️ Categoria
- 💰 Valor

Depois, as informações de cada objeto são exibidas no console.

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Prompt de Comando (CMD)

## 💻 Conceitos praticados

Neste projeto foram praticados conceitos importantes da linguagem Java:

- Criação de classes
- Criação de objetos
- Atributos
- Instanciação de objetos com `new`
- Atribuição de valores aos atributos
- Utilização de múltiplas classes
- Compilação de arquivos Java
- Execução de programas pelo terminal
- Exibição de informações no console

## 📂 Estrutura do projeto

```text
CadastroDeJogosJava
│
├── Primaryclass.java
└── Jogo.java
```

### `Primaryclass.java`

Contém o método `main`, responsável por criar os objetos `Jogo` e exibir suas informações.

### `Jogo.java`

Representa a classe `Jogo`, contendo os atributos utilizados pelos objetos:

```java
public class Jogo {

    String nome;
    String categoria;
    double valor;

}
```

## ⚙️ Como compilar o projeto

Como o projeto possui mais de uma classe, é necessário compilar os arquivos Java:

```bash
javac Primaryclass.java Jogo.java
```

Esse comando gera os arquivos compilados:

```text
Primaryclass.class
Jogo.class
```

Também é possível compilar todos os arquivos Java da pasta utilizando:

```bash
javac *.java
```

## ▶️ Como executar

Após a compilação, execute a classe principal:

```bash
java Primaryclass
```

> **Observação:** o comando `javac` é utilizado para compilar arquivos `.java`, enquanto o comando `java` executa a classe principal já compilada.

## 📝 Exemplo de funcionamento

O programa exibe informações semelhantes a estas no console:

```text
Jogo 01: Assassins Creed
Categoria: Mundo Aberto
Valor: 159.9

Jogo 02: Counter Strike
Categoria: FPS
Valor: 60.0

Jogo 03: God of War
Categoria: Ação
Valor: 300.0
```

## 🚀 Objetivo

Este projeto foi desenvolvido como exercício de estudo para compreender melhor como diferentes classes trabalham juntas em um programa Java.

## 👨‍💻 Autor

Desenvolvido por **Samuel Covalski**.

GitHub: `Sajoco-afk`

---

⭐ Projeto desenvolvido para fins de estudo e prática da linguagem Java.