# Projeto Relógio - BRLClock e USClock

Este é um projeto Java que implementa um sistema de relógios com suporte para diferentes fusos horários e formatos, incluindo o formato brasileiro (BRLClock) e o formato americano (USClock). O projeto utiliza conceitos avançados de Java, como classes seladas (_sealed classes_), _pattern matching_ para `switch` e herança.

## Estrutura do Projeto

O projeto segue a seguinte estrutura de pastas:

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Funcionalidades

- **BRLClock**: Relógio no formato brasileiro (24 horas).
- **USClock**: Relógio no formato americano (12 horas com AM/PM).
- Conversão entre os formatos de relógio.
- Validação de valores de hora, minuto e segundo.

## Tecnologias Utilizadas

- **Java 17**: O projeto utiliza recursos modernos do Java, como:
  - _Sealed Classes_: Para restringir a herança da classe `Clock`.
  - _Pattern Matching_ para `switch`: Para manipular diferentes tipos de relógios.
- **Visual Studio Code**: IDE utilizada para desenvolvimento.

## Como Executar

1. Certifique-se de que você tem o Java 17 ou superior instalado.
2. Clone este repositório ou baixe os arquivos do projeto.
3. Compile o projeto:
   ```sh
   javac -d bin src/*.java
   ```
4. Execute o projeto:
   ```sh
   java -cp bin App
   ```

## Exemplo de Saída

Ao executar o projeto, você verá a seguinte saída no console:

```
BRL Clock: 24:00:00
```

## Explicação do Código

### Classe `Clock`

A classe `Clock` é uma classe abstrata selada (_sealed_), que define os campos e métodos básicos para os relógios. Ela possui métodos para definir e obter valores de hora, minuto e segundo, além de um método abstrato `convert` para conversão entre formatos.

### Classe `BRLClock`

A classe `BRLClock` herda de `Clock` e implementa o método `convert` para converter um relógio no formato americano (`USClock`) para o formato brasileiro (24 horas).

### Classe `USClock`

A classe `USClock` herda de `Clock` e implementa o método `convert` para converter um relógio no formato brasileiro (`BRLClock`) para o formato americano (12 horas com AM/PM).

### Classe `App`

A classe `App` é o ponto de entrada do programa. Ela cria uma instância de `BRLClock`, define valores de hora, minuto e segundo, e exibe o horário no console.

## Contribuição

Sinta-se à vontade para contribuir com melhorias para este projeto. Para isso:

1. Faça um _fork_ do repositório.
2. Crie uma nova _branch_ para suas alterações:
   ```sh
   git checkout -b minha-feature
   ```
3. Faça um _commit_ das suas alterações:
   ```sh
   git commit -m "Minha nova feature"
   ```
4. Envie suas alterações:
   ```sh
   git push origin minha-feature
   ```
5. Abra um _pull request_.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

Desenvolvido com 💻 e ☕ por [Seu Nome].
