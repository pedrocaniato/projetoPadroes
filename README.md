Sistema de Logística - Design Patterns
Este projeto é uma implementação prática de quatro padrões de projeto (Design Patterns) do GoF (Gang of Four), utilizando um cenário de logística e entregas para demonstrar a organização e o desacoplamento de código em Java.

🛠️ Padrões Implementados
1. Singleton
Objetivo: Garantir que uma classe tenha apenas uma instância e forneça um ponto global de acesso a ela.

No projeto: A classe Database simula uma conexão com banco de dados. O construtor é privado e a instância é controlada pelo método getInstance(), evitando múltiplas conexões desnecessárias.

2. Bridge
Objetivo: Desacoplar uma abstração de sua implementação, para que as duas possam variar independentemente.

No projeto: Separamos o Tipo de Frete (Expresso) da Empresa Transportadora (DHL, FedEx). Isso permite adicionar novas empresas ou novos tipos de frete sem a necessidade de criar uma classe para cada combinação possível.

3. Factory Method
Objetivo: Definir uma interface para criar um objeto, mas deixar as subclasses decidirem qual classe instanciar.

No projeto: A classe Logistica define o método criarTransporte(). A subclasse LogisticaTerrestre implementa esse método para retornar especificamente um Caminhao.

4. Abstract Factory
Objetivo: Fornecer uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

No projeto: A VeiculoFactory garante que, ao construir um veículo, as peças sejam compatíveis. A CaminhaoFactory cria especificamente um MotorDiesel e um PneuDeCarga.

🚀 Como Executar
Certifique-se de ter o JDK 17 (ou superior) instalado.

Abra a pasta do projeto no VS Code.

Navegue até o arquivo src/main/java/com/logistica/Main.java.

Clique em Run ou pressione F5.

📂 Estrutura de Pastas
Plaintext
src/main/java/com/logistica/
├── Main.java                 # Ponto de entrada do sistema
├── singleton/                # Implementação do Singleton
├── bridge/                   # Implementação do Bridge
├── factorymethod/            # Implementação do Factory Method
└── abstractfactory/          # Implementação do Abstract Factory
Desenvolvido para fins acadêmicos.
