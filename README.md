# api-teste-springboot
Este é o repositório de um teste de API em Java Springboot, criado para estudar os conceitos apresentados na matéria de Programação Orientada a Objetos do curso de Análise e Desenvolvimento de Sistemas.

## Arquiteturas de API
### REST
**Rest** significa _REpresentative Sate Transfer_, é um tipo de arquitetura de software utilizado na construção de APIs. Os principais pontos por trás de uma API REST são:
- **Separação Cliente-Servidor**: Separa as responsabilidades entre o cliente (que faz requisições) e o servidor (que processas requisições e envia respostas).


- **Stateless**: Cada requisição é independente e deve conter todas as informações e parâmetros necessários para que o servidor realize o processamento.


- **Cacheável**: As respostas das requisições podem ou não ser cacheáveis, o que significa que o cliente pode armazenar respostas e reutilizá-las em futuras requisições, reduzindo a carga do servidor.

___

### ORM
- **Object Relational Mapping** é uma técnica de desenvolvimento que permite a conversão de um objeto em uma tabela (entidade) de um banco de dados.

___

## JPA
- Para a interação com o banco de dados, estaremos utilizando o Java Persistence API, que é uma interface padrão do Java para persistência de memória.