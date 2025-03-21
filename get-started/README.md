# Projeto Java - Formação Fundamentos DIO

Este repositório contém exemplos e exercícios desenvolvidos durante a formação de Fundamentos em Java da DIO. Cada aula está representada por uma classe no pacote `br.com.dio.aulas`, com os conceitos aprendidos resumidos abaixo.

---

## 📂 Estrutura do Projeto

- **`src`**: Contém os arquivos de código-fonte.
- **`bin`**: Contém os arquivos compilados.
- **`lib`**: Pasta para dependências externas (se necessário).

---

## 📚 Aulas e Conceitos Aprendidos

### 1. **`PadroesDeDesenvConceitos`**
- Introdução ao Java.
- Como comentar o código.
- Uso de `Scanner` para entrada de dados.
- Declaração de constantes com `final`.

---

### 2. **`KeyordsAndPrimitiveTypes`**
- Palavras-chave do Java.
- Tipos primitivos:
  - `byte`, `short`, `int`, `long`
  - `float`, `double`
  - `char`, `boolean`

---

### 3. **`TrabalhandoComOpAritmeticos`**
- Operadores aritméticos:
  - Soma (`+`), Subtração (`-`), Divisão (`/`), Multiplicação (`*`).
- Operações matemáticas:
  - Raiz quadrada (`Math.sqrt`).
  - Potência (`Math.pow`).
- Incremento (`++`) e divisão inteira.

---

### 4. **`TrabalhandoComOpDeAtribuicaoAndLogicos`**
- Operadores de atribuição (`=`).
- Operadores lógicos:
  - Igualdade (`==`), Maior ou igual (`>=`), OU lógico (`||`), E lógico (`&&`).
- Uso de condições para verificar permissões (ex.: dirigir).

---

### 5. **`TrabalhandoOpBitWise`**
- Operadores bit a bit:
  - AND (`&`), OR (`|`), XOR (`^`), NOT (`~`).
  - Deslocamento à esquerda (`<<`) e à direita (`>>`).
- Manipulação de bits para operações de baixo nível.

---

## 🚀 Como Executar o Projeto

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Compile os arquivos Java:
   ```bash
   javac -d bin src/br/com/dio/aulas/*.java
