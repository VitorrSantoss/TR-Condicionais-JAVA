# Estruturas Condicionais em Java

Este repositório contém exemplos e exercícios práticos sobre estruturas condicionais em Java, abordando os diferentes tipos de instruções de decisão, suas aplicações e boas práticas de uso.

## 📋 Sobre o Projeto

Este projeto tem como objetivo explorar as estruturas condicionais disponíveis na linguagem Java, apresentando exemplos claros e práticos que demonstram quando e como utilizar cada tipo de condicional. O material abrange desde estruturas simples como `if-else` até construções mais elaboradas como `switch-case` e operadores ternários.

## 🔀 Estruturas Condicionais Abordadas

### 1. Estrutura `if`
   - If simples
   - If-else
   - If-else-if (múltiplas condições)
   - If aninhados (nested if)

### 2. Estruturas `switch-case`
   - Switch com valores inteiros
   - Switch com strings (Java 7+)
   - Switch com enum
   - Switch expressions (Java 12+)
   - Pattern matching (Java 17+)

### 3. Operadores Condicionais
   - Operador ternário (`? :`)
   - Operadores de comparação (`==`, `!=`, `>`, `<`, `>=`, `<=`)
   - Operadores lógicos (`&&`, `||`, `!`)
   - Short-circuit evaluation

### 4. Técnicas Avançadas
   - Expressões lambda em condicionais
   - Optional e ifPresent/orElse (Java 8+)
   - Expressões condicionais com funções

## 🔧 Tecnologias Utilizadas

- Java
- JDK (Java Development Kit)
- IDE de sua preferência (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## 📂 Estrutura do Projeto

```
Condicionais-Java/
├── src/
│   ├── if_statement/
│   │   ├── SimpleIfExample.java
│   │   ├── IfElseExample.java
│   │   ├── IfElseIfExample.java
│   │   └── NestedIfExample.java
│   ├── switch_statement/
│   │   ├── BasicSwitchExample.java
│   │   ├── StringSwitchExample.java
│   │   ├── EnumSwitchExample.java
│   │   └── SwitchExpressionJava12.java
│   ├── conditional_operators/
│   │   ├── TernaryOperatorExample.java
│   │   ├── LogicalOperatorsExample.java
│   │   └── ShortCircuitExample.java
│   └── advanced/
│       ├── LambdaConditionalsExample.java
│       ├── OptionalExample.java
│       └── FunctionalConditionalsExample.java
├── exercises/
│   ├── IfExercises.java
│   ├── SwitchExercises.java
│   └── MixedConditionalsExercises.java
├── solutions/
│   ├── IfSolutions.java
│   ├── SwitchSolutions.java
│   └── MixedConditionalsSolutions.java
├── .gitignore
├── LICENSE
└── README.md
```

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/Condicionais-Java.git
   ```

2. Abra o projeto na sua IDE de preferência

3. Navegue até o exemplo ou exercício que deseja executar

4. Compile e execute o arquivo Java desejado

## 📝 Exemplos Incluídos

### Estrutura if-else
```java
// Exemplo simples de if-else
int idade = 18;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}

// Exemplo de if-else-if
int nota = 85;

if (nota >= 90) {
    System.out.println("Conceito A");
} else if (nota >= 80) {
    System.out.println("Conceito B");
} else if (nota >= 70) {
    System.out.println("Conceito C");
} else {
    System.out.println("Conceito D");
}
```

### Switch-case
```java
// Exemplo básico de switch
int diaSemana = 3;
String nomeDia;

switch (diaSemana) {
    case 1:
        nomeDia = "Domingo";
        break;
    case 2:
        nomeDia = "Segunda-feira";
        break;
    case 3:
        nomeDia = "Terça-feira";
        break;
    case 4:
        nomeDia = "Quarta-feira";
        break;
    case 5:
        nomeDia = "Quinta-feira";
        break;
    case 6:
        nomeDia = "Sexta-feira";
        break;
    case 7:
        nomeDia = "Sábado";
        break;
    default:
        nomeDia = "Dia inválido";
}

// Switch com String (Java 7+)
String fruta = "maçã";

switch (fruta) {
    case "maçã":
        System.out.println("Fruta vermelha");
        break;
    case "banana":
        System.out.println("Fruta amarela");
        break;
    default:
        System.out.println("Fruta de outra cor");
}

// Switch expression (Java 12+)
String categoria = switch (idade) {
    case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> "Criança";
    case 11, 12, 13, 14, 15, 16, 17 -> "Adolescente";
    default -> "Adulto";
};
```

### Operador Ternário
```java
// Exemplo de operador ternário
int x = 10;
int y = 20;

int maior = (x > y) ? x : y;
System.out.println("O maior valor é: " + maior);

// Ternário aninhado
String status = (idade >= 18) ? "Maior de idade" : (idade >= 16) ? "Pode votar" : "Menor de idade";
```

## 💡 Dicas e Boas Práticas

- Use `if-else` para lógica condicional simples ou quando houver poucas opções
- Prefira `switch-case` quando tiver múltiplas condições baseadas no mesmo valor
- Utilize o operador ternário para atribuições condicionais simples
- Evite aninhar muitos níveis de condicionais para manter a legibilidade
- Sempre use chaves `{}` mesmo em blocos de uma única linha
- Evite condições complexas; divida-as em variáveis booleanas com nomes descritivos
- Cuidado com os operadores de igualdade (`==` vs `.equals()`) ao comparar objetos
- Aproveite os recursos modernos do Java como switch expressions quando disponíveis
- Utilize o pattern matching em switch (Java 17+) para código mais expressivo

## 🧪 Exercícios Propostos

1. Crie um programa que verifica se um número é par ou ímpar
2. Implemente um sistema de cálculo de desconto baseado em faixas de valor
3. Desenvolva um validador de CPF usando estruturas condicionais
4. Crie um conversor de notas numéricas para conceitos (A, B, C, D, F)
5. Implemente um menu de opções usando switch-case
6. Desenvolva um algoritmo que classifica triângulos (equilátero, isósceles, escaleno)

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com novos exemplos, exercícios ou melhorias nos existentes.

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona novo exemplo de condicional'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request
