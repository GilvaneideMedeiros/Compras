<h1 align="center"># Projeto Simples de Simulação de Compras com Cartão de Crédito</h1>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Este é um projeto simples em Java que simula a funcionalidade básica de um sistema de compras usando um cartão de crédito. Ele permite ao usuário definir um limite para o cartão, realizar compras e acompanhar o saldo e o histórico de transações.

---

## 🚀 Funcionalidades

* **Definição de Limite:** O usuário pode definir o limite inicial do cartão de crédito.
* **Registro de Compras:** Adiciona compras com descrição e valor ao cartão.
* **Verificação de Saldo:** Automaticamente verifica se há saldo suficiente antes de cada compra.
* **Histórico de Compras:** Lista todas as compras realizadas no cartão.
* **Ordenação de Compras:** As compras são listadas em ordem crescente de valor.
* **Atualização de Saldo:** O saldo do cartão é atualizado após cada transação bem-sucedida.

---

## ⚙️ Como Usar

Para executar este projeto, você precisará ter o **Java Development Kit (JDK)** instalado em sua máquina.

1.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/GilvaneideMedeiros/Compras.git](https://github.com/GilvaneideMedeiros/Compras.git)
    ```

2.  **Navegue até o Diretório do Projeto:**
    ```bash
    cd Compras
    ```

3.  **Compile as Classes Java:**
    ```bash
    javac src/*.java
    ```

4.  **Execute o Programa Principal:**
    ```bash
    java src/Principal.java
    ```

    Siga as instruções no console para interagir com a simulação de compras.

---

## 💻 Estrutura do Código

O projeto é composto por três classes principais:

* `Principal.java`: Contém o método `main`, responsável pela interação com o usuário, definição do limite do cartão e orquestração das operações de compra e exibição do histórico.
* `CartaoDeCredito.java`: Representa o cartão de crédito, gerenciando seu limite, saldo e a lista de compras realizadas. Possui a lógica para `lançar` (registrar) uma compra.
* `Compra.java`: Representa uma única transação de compra, contendo a descrição do item e seu valor. Implementa a interface `Comparable` para permitir a ordenação das compras por valor.

---

## Exemplo de Interação

Digite o limite do cartão:
1000
Digite o nome do produto:
Tenis
Digite o valor do produto:
300
Compra realizada com sucesso!
Saldo atual: 700.0

Deseja realizar outra compra?
1 - Sim
0 - Não
1
Digite o nome do produto:
Camisa
Digite o valor do produto:
150
Compra realizada com sucesso!
Saldo atual: 550.0

Deseja realizar outra compra? 1 - Sim 0 - Não 0
Compras realizadas:

Camisa - R150.0Tenis−R300.0
Saldo do cartão: 550.0


---

## ✒️ Autor

* **Gilvaneide Medeiros** - [Perfil no GitHub](https://github.com/GilvaneideMedeiros)

---

## 🤝 Contribuições

Contribuições são bem-vindas! Se você tiver sugestões ou melhorias, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.
