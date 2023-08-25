# [Lab Project] Simulando Uma Conta Bancária Através Do Terminal/Console

## Descrição do Projeto

1. Criar um projeto Java com o nome "ContaBanco", que receberá dados via terminal contendo as características de conta, conforme atributos indicados na tabela abaixo.

2. Dentro do projeto, criar a classe "ContaTerminal.java" para realizar toda a codificação do programa.

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48

3. Permita que os dados sejam inseridos via terminal, sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

```
[Programa] "Por favor, digite o número de agência: "
[Usuário] "1021" (ENTER)
```

4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem: 

```
Olá, [nomeCliente]! Obrigado por criar uma conta em nosso banco. Sua agência é [numeroAgencia], conta [numeroConta] e seu saldo de R$[saldo] já está disponível para saque.
```

##### . Os campos que contém [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.