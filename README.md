# Aplicação Cliente do Sistema de Controle de Passagem usando Java RMI.

## Contextualização

Sistema de Controle de Passagem realiza a consulta e marcação de voo e assento usando Java RMI.
O programa servidor controla e mantêm os voos e assentos. 
O programa cliente realiza consultas e marcações se comunicando com o servidor através de métodos remotos..
Entre o cliente e o servidor existe chamadas de métodos remotos.
- Use o repositório "rmi_controle_passagem_servidor" como o programa servidor.

### Consulta Voo

Para o programa cliente consultar é necessário chamar o método "verificarStatus" do objeto do servidor. 
Na consulta o programa cliente especifica um voo e assento para saber se estão disponíveis através do método remoto. 

O método do objeto remoto do servidor retorna:
 - 0: voo disponível
 - 1: assento indisponível
 - 2: assento inexistente
 - 3: voo inexistente
 - 4: marcação realizada

Todos os códigos dos voos se iniciam com a letra "A":
 - **"A1"**

### Marcação Voo

A marcação envolve chamar o método remoto "marcarVoo" e enviar o código do voo e assento ao servidor e este marcar como indisponível. 

O programa servidor retorna:
 - 0: voo disponível
 - 1: assento indisponível
 - 2: assento inexistente
 - 3: voo inexistente
 - 4: marcação realizada

## Arquivos

- pom.xml - Arquivo de configuração da ferramenta de automação Maven.
- *.bat - Arquivos de lote(Batch) de console para tarefas compilar, executar, documentar, empacotar e limpar o projeto.