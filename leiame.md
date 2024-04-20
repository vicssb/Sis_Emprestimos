<img src="./imgs/gif v1.gif" min-width="400px" max-width="400px" width="400px" align="right" alt="Computador iuriCode">
<p>
  <div align="right"> 
<a href="./README.md"> <img src="./imgs/LogoUK.png" alt="Logo UK" width="30"/></a><a href="./leiame.md"> <img src="./imgs/logoBrazil.png" alt="Logo Brasil" width="30"/> </a>
</div>
  <H1><b>Java RESTful API de controle de empréstimos - SORRAB </b> </H1>


<p align="left">  
Java RESTful API criada para o Java AI Powered DIO.
<br>
</p>

<p>
  🦄 <b>Principais Tecnologias</b><br>
</p>

<p>
- **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
- **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
- **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
- **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.
</p>

<b>Diagrama de classes</b><br>
```mermaid
classDiagram
    class User {
        -String name
        -Account Account
        -Feature[] features
        -Loan loan
        -News[] news
    }
    class Account {
        -String AccountNumber
        -String AccountAgency
        -Float AccountBalance
        -Float AccountLimit
        -Integer NumberOfInstallments
    }
    class Feature {
        -String icon
        -String description
    }
    class Loan {
        -String number
        -Float limit
    }
    class News {
        -String icon
        -String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "N" Loan
    User "1" *-- "N" News
```


<p align="left">
  💌 For more information contact us: ⤵️
</p>

<p align="left">
  <a href="mailto:vicssb@gmail.com" alt="Gmail" target = "_blank">
  <img src="https://img.shields.io/badge/-Gmail-FF0000?style=flat-square&labelColor=FF0000&logo=gmail&logoColor=white&link=mailto:vicssb@gmail.com" /></a>

  <a href="https://www.linkedin.com/in/victor-sergio-silva-barros/" alt="Linkedin" target = "_blank">
  <img src="https://img.shields.io/badge/-Linkedin-0e76a8?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/victor-sergio-silva-barros/" /></a>

  <a href="https://wa.me/+5512987085327" alt="WhatsApp" target = "_blank">
  <img src="https://img.shields.io/badge/-WhatsApp-25d366?style=flat-square&labelColor=25d366&logo=whatsapp&logoColor=white&link=https://wa.me/+5512987085327"/></a>

  </p>  

<p>Please follow github and join us!
Thanks for visiting and happy coding!</p>



