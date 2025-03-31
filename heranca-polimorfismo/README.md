# Projeto: Herança e Polimorfismo em Java

Este projeto faz parte da formação de fundamentos em Java da DIO (Digital Innovation One). O objetivo principal é explorar os conceitos de **herança**, **polimorfismo** e as novas funcionalidades do Java relacionadas a classes `sealed`, `non-sealed` e `abstract`.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **`src`**: Contém os arquivos de código-fonte Java.
  - `Employee.java`: Classe base `sealed` que define atributos e métodos comuns para todos os funcionários.
  - `Manager.java`: Subclasse `non-sealed` de `Employee`, representando um gerente.
  - `SalesMan.java`: Subclasse `non-sealed` de `Employee`, representando um vendedor.
- **`lib`**: Pasta reservada para dependências externas (não utilizada neste projeto).
- **`bin`**: Pasta onde os arquivos compilados são gerados automaticamente.

## Conceitos Aprendidos

Durante o desenvolvimento deste projeto, foram abordados os seguintes conceitos:

1. **Herança**:

   - Uso de classes base (`Employee`) e subclasses (`Manager` e `SalesMan`) para reutilizar código e modelar hierarquias.

2. **Polimorfismo**:

   - Capacidade de tratar objetos de subclasses como objetos da classe base, permitindo maior flexibilidade no código.

3. **Classes `sealed`, `non-sealed` e `abstract`**:

   - **`sealed`**: Restringe quais classes podem estender a classe base.
   - **`non-sealed`**: Permite que subclasses de uma classe `sealed` sejam estendidas livremente.
   - **`abstract`**: Define classes que não podem ser instanciadas diretamente, mas podem conter métodos abstratos e concretos.

4. **Encapsulamento**:

   - Uso de modificadores de acesso (`private`) e métodos `getter` e `setter` para proteger os dados das classes.

5. **Estrutura de Projetos em Java**:
   - Organização de arquivos em pastas (`src`, `lib`, `bin`) e uso do Visual Studio Code para compilar e executar o código.

## Como Executar o Projeto

1. Certifique-se de que o Java JDK está instalado em sua máquina.
2. Abra o projeto no Visual Studio Code.
3. Compile os arquivos Java:
   - No terminal integrado, execute: `javac -d bin src/*.java`
4. Execute a classe principal (se houver):
   - No terminal integrado, execute: `java -cp bin NomeDaClassePrincipal`

## Próximos Passos

- Implementar métodos específicos para cada subclasse (`Manager` e `SalesMan`).
- Explorar mais exemplos de polimorfismo em cenários reais.
- Adicionar testes unitários para validar o comportamento das classes.

## Conclusão

Este projeto foi uma excelente oportunidade para consolidar os fundamentos de herança e polimorfismo em Java, além de explorar as novas funcionalidades introduzidas nas versões mais recentes da linguagem. A estrutura organizada e o uso de boas práticas tornam o código mais legível e fácil de manter.

---
