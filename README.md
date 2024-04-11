# Sistema de Gerenciamento de Produtores de Leite (GPL) 🐄

Este é um sistema de gerenciamento simples para produtores de leite. Ele permite o cadastro de produtores, gado, produção de leite e gera dados sobre a receita dos produtores. Abaixo está uma visão geral do projeto, incluindo detalhes sobre os componentes da linguagem Java e como utilizá-los.

## Componentes da Linguagem Java Utilizados 🖥️

O projeto utiliza vários componentes da linguagem Java, incluindo:

- **Classes e Objetos**: O projeto é baseado em classes e objetos para representar produtores, gado e outras entidades relacionadas.

- **Métodos e Métodos Estáticos**: Métodos são usados para realizar operações específicas, como cadastrar produtores, cadastrar gado, calcular receitas, entre outros. Além disso, métodos estáticos são utilizados em classes utilitárias, como `Funcoes`, para realizar operações que não dependem de instâncias específicas da classe.

- **Estruturas de Controle (if-else e switch-case)**: As estruturas de controle são utilizadas para controlar o fluxo do programa, como na apresentação do menu de opções e na validação de entrada do usuário.

- **Arrays**: Arrays são utilizados para armazenar os produtores e o gado cadastrados no sistema.

- **Entrada e Saída de Dados (Scanner)**: A classe `Scanner` é utilizada para receber entrada de dados do usuário através do console.

## Programação Orientada a Objetos (POO) 🔄

O projeto segue os princípios da Programação Orientada a Objetos (POO), onde:

- **Encapsulamento**: Os dados das classes são encapsulados em métodos getters e setters para garantir o controle de acesso.

- **Herança**: Não há explicitamente herança neste projeto, mas conceitualmente a relação entre classes como `Produtor` e `Vaca` pode ser considerada uma forma de herança.

- **Polimorfismo**: Embora não seja utilizado explicitamente, o polimorfismo poderia ser implementado se houvesse necessidade de tratar diferentes tipos de produtores ou animais de forma genérica.

- **Abstração**: As classes e métodos são projetados de forma a abstrair detalhes desnecessários e fornecer uma interface simplificada para interação com o sistema.

## Como Utilizar 🚀

1. Compile todos os arquivos Java no mesmo diretório.

2. Execute o arquivo `Main.java` para iniciar o programa.

3. Você será apresentado com um menu de opções numeradas:

    ```
    --------------------------
    ---------- MENU ----------
    --------------------------
    
    [1] Cadastrar Produtor
    [2] Cadastrar Gado
    [3] Dados dos Produtores
    [4] Dados do Gado
    [5] Cadastrar Produção de Leite
    [6] Receita dos Produtores
    
    [0] Sair
    ```
   
4. Escolha a opção desejada digitando o número correspondente e pressione Enter.

5. Siga as instruções apresentadas no console para realizar as operações desejadas.

6. Para sair do programa, selecione a opção "0 - Sair".

## Recursos Adicionais 🔍

- Cadastro de produtores de leite.
- Cadastro de gado de leite para cada produtor.
- Cadastro da produção de leite para cada vaca de leite.
- Cálculo da receita total dos produtores com base na produção de leite.

## Aviso 📝

Este é um sistema de gerenciamento básico e pode ser expandido com mais recursos e funcionalidades, como persistência de dados em banco de dados ou cálculos mais complexos.

