# proofconcept-tcc-archidistribsys
Prova de conceito para complementar o trabalho final da minha pós graduação em arquitetura de sistemas distribuídos 

[![](https://mermaid.ink/img/eyJjb2RlIjoiZ3JhcGggVERcbkFbQ2xpZW50XSAtLSBBY2Nlc3MgZXh0ZXJuYWwgLS0-IEIoKGFwaS1nYXRld2F5LXp1dWwpKVxuQiAtLSB0b2tlbiBnZW5lcmF0ZSAtLT4gQ1thdXRoc2VydmVyLW9hdXRoMl1cbkIgLS0gdG9rZW4gY2hlY2sgLS0-IENcbkIgLS0-IEQoZGV2LWFwaSlcbkQgLS0gdG9rZW4gY2hlY2sgLS0-IEIiLCJtZXJtYWlkIjp7InRoZW1lIjoiZGVmYXVsdCIsInRoZW1lVmFyaWFibGVzIjp7ImJhY2tncm91bmQiOiJ3aGl0ZSIsInByaW1hcnlDb2xvciI6IiNFQ0VDRkYiLCJzZWNvbmRhcnlDb2xvciI6IiNmZmZmZGUiLCJ0ZXJ0aWFyeUNvbG9yIjoiaHNsKDgwLCAxMDAlLCA5Ni4yNzQ1MDk4MDM5JSkiLCJwcmltYXJ5Qm9yZGVyQ29sb3IiOiJoc2woMjQwLCA2MCUsIDg2LjI3NDUwOTgwMzklKSIsInNlY29uZGFyeUJvcmRlckNvbG9yIjoiaHNsKDYwLCA2MCUsIDgzLjUyOTQxMTc2NDclKSIsInRlcnRpYXJ5Qm9yZGVyQ29sb3IiOiJoc2woODAsIDYwJSwgODYuMjc0NTA5ODAzOSUpIiwicHJpbWFyeVRleHRDb2xvciI6IiMxMzEzMDAiLCJzZWNvbmRhcnlUZXh0Q29sb3IiOiIjMDAwMDIxIiwidGVydGlhcnlUZXh0Q29sb3IiOiJyZ2IoOS41MDAwMDAwMDAxLCA5LjUwMDAwMDAwMDEsIDkuNTAwMDAwMDAwMSkiLCJsaW5lQ29sb3IiOiIjMzMzMzMzIiwidGV4dENvbG9yIjoiIzMzMyIsIm1haW5Ca2ciOiIjRUNFQ0ZGIiwic2Vjb25kQmtnIjoiI2ZmZmZkZSIsImJvcmRlcjEiOiIjOTM3MERCIiwiYm9yZGVyMiI6IiNhYWFhMzMiLCJhcnJvd2hlYWRDb2xvciI6IiMzMzMzMzMiLCJmb250RmFtaWx5IjoiXCJ0cmVidWNoZXQgbXNcIiwgdmVyZGFuYSwgYXJpYWwiLCJmb250U2l6ZSI6IjE2cHgiLCJsYWJlbEJhY2tncm91bmQiOiIjZThlOGU4Iiwibm9kZUJrZyI6IiNFQ0VDRkYiLCJub2RlQm9yZGVyIjoiIzkzNzBEQiIsImNsdXN0ZXJCa2ciOiIjZmZmZmRlIiwiY2x1c3RlckJvcmRlciI6IiNhYWFhMzMiLCJkZWZhdWx0TGlua0NvbG9yIjoiIzMzMzMzMyIsInRpdGxlQ29sb3IiOiIjMzMzIiwiZWRnZUxhYmVsQmFja2dyb3VuZCI6IiNlOGU4ZTgiLCJhY3RvckJvcmRlciI6ImhzbCgyNTkuNjI2MTY4MjI0MywgNTkuNzc2NTM2MzEyOCUsIDg3LjkwMTk2MDc4NDMlKSIsImFjdG9yQmtnIjoiI0VDRUNGRiIsImFjdG9yVGV4dENvbG9yIjoiYmxhY2siLCJhY3RvckxpbmVDb2xvciI6ImdyZXkiLCJzaWduYWxDb2xvciI6IiMzMzMiLCJzaWduYWxUZXh0Q29sb3IiOiIjMzMzIiwibGFiZWxCb3hCa2dDb2xvciI6IiNFQ0VDRkYiLCJsYWJlbEJveEJvcmRlckNvbG9yIjoiaHNsKDI1OS42MjYxNjgyMjQzLCA1OS43NzY1MzYzMTI4JSwgODcuOTAxOTYwNzg0MyUpIiwibGFiZWxUZXh0Q29sb3IiOiJibGFjayIsImxvb3BUZXh0Q29sb3IiOiJibGFjayIsIm5vdGVCb3JkZXJDb2xvciI6IiNhYWFhMzMiLCJub3RlQmtnQ29sb3IiOiIjZmZmNWFkIiwibm90ZVRleHRDb2xvciI6ImJsYWNrIiwiYWN0aXZhdGlvbkJvcmRlckNvbG9yIjoiIzY2NiIsImFjdGl2YXRpb25Ca2dDb2xvciI6IiNmNGY0ZjQiLCJzZXF1ZW5jZU51bWJlckNvbG9yIjoid2hpdGUiLCJzZWN0aW9uQmtnQ29sb3IiOiJyZ2JhKDEwMiwgMTAyLCAyNTUsIDAuNDkpIiwiYWx0U2VjdGlvbkJrZ0NvbG9yIjoid2hpdGUiLCJzZWN0aW9uQmtnQ29sb3IyIjoiI2ZmZjQwMCIsInRhc2tCb3JkZXJDb2xvciI6IiM1MzRmYmMiLCJ0YXNrQmtnQ29sb3IiOiIjOGE5MGRkIiwidGFza1RleHRMaWdodENvbG9yIjoid2hpdGUiLCJ0YXNrVGV4dENvbG9yIjoid2hpdGUiLCJ0YXNrVGV4dERhcmtDb2xvciI6ImJsYWNrIiwidGFza1RleHRPdXRzaWRlQ29sb3IiOiJibGFjayIsInRhc2tUZXh0Q2xpY2thYmxlQ29sb3IiOiIjMDAzMTYzIiwiYWN0aXZlVGFza0JvcmRlckNvbG9yIjoiIzUzNGZiYyIsImFjdGl2ZVRhc2tCa2dDb2xvciI6IiNiZmM3ZmYiLCJncmlkQ29sb3IiOiJsaWdodGdyZXkiLCJkb25lVGFza0JrZ0NvbG9yIjoibGlnaHRncmV5IiwiZG9uZVRhc2tCb3JkZXJDb2xvciI6ImdyZXkiLCJjcml0Qm9yZGVyQ29sb3IiOiIjZmY4ODg4IiwiY3JpdEJrZ0NvbG9yIjoicmVkIiwidG9kYXlMaW5lQ29sb3IiOiJyZWQiLCJsYWJlbENvbG9yIjoiYmxhY2siLCJlcnJvckJrZ0NvbG9yIjoiIzU1MjIyMiIsImVycm9yVGV4dENvbG9yIjoiIzU1MjIyMiIsImNsYXNzVGV4dCI6IiMxMzEzMDAiLCJmaWxsVHlwZTAiOiIjRUNFQ0ZGIiwiZmlsbFR5cGUxIjoiI2ZmZmZkZSIsImZpbGxUeXBlMiI6ImhzbCgzMDQsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlMyI6ImhzbCgxMjQsIDEwMCUsIDkzLjUyOTQxMTc2NDclKSIsImZpbGxUeXBlNCI6ImhzbCgxNzYsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlNSI6ImhzbCgtNCwgMTAwJSwgOTMuNTI5NDExNzY0NyUpIiwiZmlsbFR5cGU2IjoiaHNsKDgsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlNyI6ImhzbCgxODgsIDEwMCUsIDkzLjUyOTQxMTc2NDclKSJ9fSwidXBkYXRlRWRpdG9yIjpmYWxzZX0)](https://mermaid-js.github.io/mermaid-live-editor/#/edit/eyJjb2RlIjoiZ3JhcGggVERcbkFbQ2xpZW50XSAtLSBBY2Nlc3MgZXh0ZXJuYWwgLS0-IEIoKGFwaS1nYXRld2F5LXp1dWwpKVxuQiAtLSB0b2tlbiBnZW5lcmF0ZSAtLT4gQ1thdXRoc2VydmVyLW9hdXRoMl1cbkIgLS0gdG9rZW4gY2hlY2sgLS0-IENcbkIgLS0-IEQoZGV2LWFwaSlcbkQgLS0gdG9rZW4gY2hlY2sgLS0-IEIiLCJtZXJtYWlkIjp7InRoZW1lIjoiZGVmYXVsdCIsInRoZW1lVmFyaWFibGVzIjp7ImJhY2tncm91bmQiOiJ3aGl0ZSIsInByaW1hcnlDb2xvciI6IiNFQ0VDRkYiLCJzZWNvbmRhcnlDb2xvciI6IiNmZmZmZGUiLCJ0ZXJ0aWFyeUNvbG9yIjoiaHNsKDgwLCAxMDAlLCA5Ni4yNzQ1MDk4MDM5JSkiLCJwcmltYXJ5Qm9yZGVyQ29sb3IiOiJoc2woMjQwLCA2MCUsIDg2LjI3NDUwOTgwMzklKSIsInNlY29uZGFyeUJvcmRlckNvbG9yIjoiaHNsKDYwLCA2MCUsIDgzLjUyOTQxMTc2NDclKSIsInRlcnRpYXJ5Qm9yZGVyQ29sb3IiOiJoc2woODAsIDYwJSwgODYuMjc0NTA5ODAzOSUpIiwicHJpbWFyeVRleHRDb2xvciI6IiMxMzEzMDAiLCJzZWNvbmRhcnlUZXh0Q29sb3IiOiIjMDAwMDIxIiwidGVydGlhcnlUZXh0Q29sb3IiOiJyZ2IoOS41MDAwMDAwMDAxLCA5LjUwMDAwMDAwMDEsIDkuNTAwMDAwMDAwMSkiLCJsaW5lQ29sb3IiOiIjMzMzMzMzIiwidGV4dENvbG9yIjoiIzMzMyIsIm1haW5Ca2ciOiIjRUNFQ0ZGIiwic2Vjb25kQmtnIjoiI2ZmZmZkZSIsImJvcmRlcjEiOiIjOTM3MERCIiwiYm9yZGVyMiI6IiNhYWFhMzMiLCJhcnJvd2hlYWRDb2xvciI6IiMzMzMzMzMiLCJmb250RmFtaWx5IjoiXCJ0cmVidWNoZXQgbXNcIiwgdmVyZGFuYSwgYXJpYWwiLCJmb250U2l6ZSI6IjE2cHgiLCJsYWJlbEJhY2tncm91bmQiOiIjZThlOGU4Iiwibm9kZUJrZyI6IiNFQ0VDRkYiLCJub2RlQm9yZGVyIjoiIzkzNzBEQiIsImNsdXN0ZXJCa2ciOiIjZmZmZmRlIiwiY2x1c3RlckJvcmRlciI6IiNhYWFhMzMiLCJkZWZhdWx0TGlua0NvbG9yIjoiIzMzMzMzMyIsInRpdGxlQ29sb3IiOiIjMzMzIiwiZWRnZUxhYmVsQmFja2dyb3VuZCI6IiNlOGU4ZTgiLCJhY3RvckJvcmRlciI6ImhzbCgyNTkuNjI2MTY4MjI0MywgNTkuNzc2NTM2MzEyOCUsIDg3LjkwMTk2MDc4NDMlKSIsImFjdG9yQmtnIjoiI0VDRUNGRiIsImFjdG9yVGV4dENvbG9yIjoiYmxhY2siLCJhY3RvckxpbmVDb2xvciI6ImdyZXkiLCJzaWduYWxDb2xvciI6IiMzMzMiLCJzaWduYWxUZXh0Q29sb3IiOiIjMzMzIiwibGFiZWxCb3hCa2dDb2xvciI6IiNFQ0VDRkYiLCJsYWJlbEJveEJvcmRlckNvbG9yIjoiaHNsKDI1OS42MjYxNjgyMjQzLCA1OS43NzY1MzYzMTI4JSwgODcuOTAxOTYwNzg0MyUpIiwibGFiZWxUZXh0Q29sb3IiOiJibGFjayIsImxvb3BUZXh0Q29sb3IiOiJibGFjayIsIm5vdGVCb3JkZXJDb2xvciI6IiNhYWFhMzMiLCJub3RlQmtnQ29sb3IiOiIjZmZmNWFkIiwibm90ZVRleHRDb2xvciI6ImJsYWNrIiwiYWN0aXZhdGlvbkJvcmRlckNvbG9yIjoiIzY2NiIsImFjdGl2YXRpb25Ca2dDb2xvciI6IiNmNGY0ZjQiLCJzZXF1ZW5jZU51bWJlckNvbG9yIjoid2hpdGUiLCJzZWN0aW9uQmtnQ29sb3IiOiJyZ2JhKDEwMiwgMTAyLCAyNTUsIDAuNDkpIiwiYWx0U2VjdGlvbkJrZ0NvbG9yIjoid2hpdGUiLCJzZWN0aW9uQmtnQ29sb3IyIjoiI2ZmZjQwMCIsInRhc2tCb3JkZXJDb2xvciI6IiM1MzRmYmMiLCJ0YXNrQmtnQ29sb3IiOiIjOGE5MGRkIiwidGFza1RleHRMaWdodENvbG9yIjoid2hpdGUiLCJ0YXNrVGV4dENvbG9yIjoid2hpdGUiLCJ0YXNrVGV4dERhcmtDb2xvciI6ImJsYWNrIiwidGFza1RleHRPdXRzaWRlQ29sb3IiOiJibGFjayIsInRhc2tUZXh0Q2xpY2thYmxlQ29sb3IiOiIjMDAzMTYzIiwiYWN0aXZlVGFza0JvcmRlckNvbG9yIjoiIzUzNGZiYyIsImFjdGl2ZVRhc2tCa2dDb2xvciI6IiNiZmM3ZmYiLCJncmlkQ29sb3IiOiJsaWdodGdyZXkiLCJkb25lVGFza0JrZ0NvbG9yIjoibGlnaHRncmV5IiwiZG9uZVRhc2tCb3JkZXJDb2xvciI6ImdyZXkiLCJjcml0Qm9yZGVyQ29sb3IiOiIjZmY4ODg4IiwiY3JpdEJrZ0NvbG9yIjoicmVkIiwidG9kYXlMaW5lQ29sb3IiOiJyZWQiLCJsYWJlbENvbG9yIjoiYmxhY2siLCJlcnJvckJrZ0NvbG9yIjoiIzU1MjIyMiIsImVycm9yVGV4dENvbG9yIjoiIzU1MjIyMiIsImNsYXNzVGV4dCI6IiMxMzEzMDAiLCJmaWxsVHlwZTAiOiIjRUNFQ0ZGIiwiZmlsbFR5cGUxIjoiI2ZmZmZkZSIsImZpbGxUeXBlMiI6ImhzbCgzMDQsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlMyI6ImhzbCgxMjQsIDEwMCUsIDkzLjUyOTQxMTc2NDclKSIsImZpbGxUeXBlNCI6ImhzbCgxNzYsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlNSI6ImhzbCgtNCwgMTAwJSwgOTMuNTI5NDExNzY0NyUpIiwiZmlsbFR5cGU2IjoiaHNsKDgsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlNyI6ImhzbCgxODgsIDEwMCUsIDkzLjUyOTQxMTc2NDclKSJ9fSwidXBkYXRlRWRpdG9yIjpmYWxzZX0)

Aplicação de back-end com authserver, api-gateway e services. Os módulos estão em containers e cada uma das imagens geradas foi disponibilizada no meu repositório no **docker-hub**. Está solução disponibiliza uma API-REST (**dev-api**) que integra com o a API do github. Nesta API é possível cadastrar desenvolver na base de dados local, consultar desenvolver ou listar os desenvolvedores e apagar desenvolver e listar os repositórios do desenvolver. Para acessar os métodos de negócio da API é preciso passar pelo gateway (**api-gateway-zuul**). O gateway é o responsável pela exposição externa e também receber as requisições que geram e validam o **access-token** através do authserver (**authserver-oauth2**). O authserver foi criado para autorizar os acessos a API e assim poder torná-la segura.

1. Módulo **dev-api** -> Acessa o GITHUB e cadastra desenvolvedores (http://localhost:8081/api);
2. Módulo **authserver-oauth2** -> Gera token de acesso e valida token de acesso (http://localhost:8082);
3. Módulo **api-gateway-zuul** -> Expõe a API, authserver e implementa circuitbreaker partner (http://localhost:8080).
4. Banco de dados -> Postgresql

No desenho elaborado acima é possível notar que a api e o servidor de autorização não conversam direto. Escolhi fazer assim porque as ferramentas de api-gateway possuem ferramentas capazes de gerar logs, consultar estes logs, implementam partners que tornam este trabalho de roteamento melhor e pensando em uma solução final onde teríamos um sistema escalável com vários auth-servers e várias apis a comunicação tem que ir para o gateway que encaminhara para o balanceador que irá enviar para um nodo/pod da api ou do authserver.

Preocupei em escrever um código limpo, seguro e fácil de testar. Utilizei DTO para não expor as classes de entidades nos metódos de entrada e saída da api e para assim retornar em cada método da API de forma simples e segura somente o necessário, nenhum dado a mais.

### Tecnologias utilizadas

- SO -> Windows 10
- JDK 11 (spring-boot, netflix-zuul de api-gateway, oauth2 com tipo access-token para autorizar o acessos as API's)
- Docker e docker-compse
- Maven
- Database -> postgresql e pgadmin4
- IDE's -> Intellij IDEA e Eclipse

### Desenho do banco de dados

[![](https://mermaid.ink/img/eyJjb2RlIjoiZXJEaWFncmFtXG4gICAgREVWRUxPUEVSUyB8fC0tfHsgUkVQT1NJVE9SSUVTIDogY29udGFpbnMiLCJtZXJtYWlkIjp7InRoZW1lIjoiZGVmYXVsdCIsInRoZW1lVmFyaWFibGVzIjp7ImJhY2tncm91bmQiOiJ3aGl0ZSIsInByaW1hcnlDb2xvciI6IiNFQ0VDRkYiLCJzZWNvbmRhcnlDb2xvciI6IiNmZmZmZGUiLCJ0ZXJ0aWFyeUNvbG9yIjoiaHNsKDgwLCAxMDAlLCA5Ni4yNzQ1MDk4MDM5JSkiLCJwcmltYXJ5Qm9yZGVyQ29sb3IiOiJoc2woMjQwLCA2MCUsIDg2LjI3NDUwOTgwMzklKSIsInNlY29uZGFyeUJvcmRlckNvbG9yIjoiaHNsKDYwLCA2MCUsIDgzLjUyOTQxMTc2NDclKSIsInRlcnRpYXJ5Qm9yZGVyQ29sb3IiOiJoc2woODAsIDYwJSwgODYuMjc0NTA5ODAzOSUpIiwicHJpbWFyeVRleHRDb2xvciI6IiMxMzEzMDAiLCJzZWNvbmRhcnlUZXh0Q29sb3IiOiIjMDAwMDIxIiwidGVydGlhcnlUZXh0Q29sb3IiOiJyZ2IoOS41MDAwMDAwMDAxLCA5LjUwMDAwMDAwMDEsIDkuNTAwMDAwMDAwMSkiLCJsaW5lQ29sb3IiOiIjMzMzMzMzIiwidGV4dENvbG9yIjoiIzMzMyIsIm1haW5Ca2ciOiIjRUNFQ0ZGIiwic2Vjb25kQmtnIjoiI2ZmZmZkZSIsImJvcmRlcjEiOiIjOTM3MERCIiwiYm9yZGVyMiI6IiNhYWFhMzMiLCJhcnJvd2hlYWRDb2xvciI6IiMzMzMzMzMiLCJmb250RmFtaWx5IjoiXCJ0cmVidWNoZXQgbXNcIiwgdmVyZGFuYSwgYXJpYWwiLCJmb250U2l6ZSI6IjE2cHgiLCJsYWJlbEJhY2tncm91bmQiOiIjZThlOGU4Iiwibm9kZUJrZyI6IiNFQ0VDRkYiLCJub2RlQm9yZGVyIjoiIzkzNzBEQiIsImNsdXN0ZXJCa2ciOiIjZmZmZmRlIiwiY2x1c3RlckJvcmRlciI6IiNhYWFhMzMiLCJkZWZhdWx0TGlua0NvbG9yIjoiIzMzMzMzMyIsInRpdGxlQ29sb3IiOiIjMzMzIiwiZWRnZUxhYmVsQmFja2dyb3VuZCI6IiNlOGU4ZTgiLCJhY3RvckJvcmRlciI6ImhzbCgyNTkuNjI2MTY4MjI0MywgNTkuNzc2NTM2MzEyOCUsIDg3LjkwMTk2MDc4NDMlKSIsImFjdG9yQmtnIjoiI0VDRUNGRiIsImFjdG9yVGV4dENvbG9yIjoiYmxhY2siLCJhY3RvckxpbmVDb2xvciI6ImdyZXkiLCJzaWduYWxDb2xvciI6IiMzMzMiLCJzaWduYWxUZXh0Q29sb3IiOiIjMzMzIiwibGFiZWxCb3hCa2dDb2xvciI6IiNFQ0VDRkYiLCJsYWJlbEJveEJvcmRlckNvbG9yIjoiaHNsKDI1OS42MjYxNjgyMjQzLCA1OS43NzY1MzYzMTI4JSwgODcuOTAxOTYwNzg0MyUpIiwibGFiZWxUZXh0Q29sb3IiOiJibGFjayIsImxvb3BUZXh0Q29sb3IiOiJibGFjayIsIm5vdGVCb3JkZXJDb2xvciI6IiNhYWFhMzMiLCJub3RlQmtnQ29sb3IiOiIjZmZmNWFkIiwibm90ZVRleHRDb2xvciI6ImJsYWNrIiwiYWN0aXZhdGlvbkJvcmRlckNvbG9yIjoiIzY2NiIsImFjdGl2YXRpb25Ca2dDb2xvciI6IiNmNGY0ZjQiLCJzZXF1ZW5jZU51bWJlckNvbG9yIjoid2hpdGUiLCJzZWN0aW9uQmtnQ29sb3IiOiJyZ2JhKDEwMiwgMTAyLCAyNTUsIDAuNDkpIiwiYWx0U2VjdGlvbkJrZ0NvbG9yIjoid2hpdGUiLCJzZWN0aW9uQmtnQ29sb3IyIjoiI2ZmZjQwMCIsInRhc2tCb3JkZXJDb2xvciI6IiM1MzRmYmMiLCJ0YXNrQmtnQ29sb3IiOiIjOGE5MGRkIiwidGFza1RleHRMaWdodENvbG9yIjoid2hpdGUiLCJ0YXNrVGV4dENvbG9yIjoid2hpdGUiLCJ0YXNrVGV4dERhcmtDb2xvciI6ImJsYWNrIiwidGFza1RleHRPdXRzaWRlQ29sb3IiOiJibGFjayIsInRhc2tUZXh0Q2xpY2thYmxlQ29sb3IiOiIjMDAzMTYzIiwiYWN0aXZlVGFza0JvcmRlckNvbG9yIjoiIzUzNGZiYyIsImFjdGl2ZVRhc2tCa2dDb2xvciI6IiNiZmM3ZmYiLCJncmlkQ29sb3IiOiJsaWdodGdyZXkiLCJkb25lVGFza0JrZ0NvbG9yIjoibGlnaHRncmV5IiwiZG9uZVRhc2tCb3JkZXJDb2xvciI6ImdyZXkiLCJjcml0Qm9yZGVyQ29sb3IiOiIjZmY4ODg4IiwiY3JpdEJrZ0NvbG9yIjoicmVkIiwidG9kYXlMaW5lQ29sb3IiOiJyZWQiLCJsYWJlbENvbG9yIjoiYmxhY2siLCJlcnJvckJrZ0NvbG9yIjoiIzU1MjIyMiIsImVycm9yVGV4dENvbG9yIjoiIzU1MjIyMiIsImNsYXNzVGV4dCI6IiMxMzEzMDAiLCJmaWxsVHlwZTAiOiIjRUNFQ0ZGIiwiZmlsbFR5cGUxIjoiI2ZmZmZkZSIsImZpbGxUeXBlMiI6ImhzbCgzMDQsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlMyI6ImhzbCgxMjQsIDEwMCUsIDkzLjUyOTQxMTc2NDclKSIsImZpbGxUeXBlNCI6ImhzbCgxNzYsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlNSI6ImhzbCgtNCwgMTAwJSwgOTMuNTI5NDExNzY0NyUpIiwiZmlsbFR5cGU2IjoiaHNsKDgsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlNyI6ImhzbCgxODgsIDEwMCUsIDkzLjUyOTQxMTc2NDclKSJ9fSwidXBkYXRlRWRpdG9yIjpmYWxzZX0)](https://mermaid-js.github.io/mermaid-live-editor/#/edit/eyJjb2RlIjoiZXJEaWFncmFtXG4gICAgREVWRUxPUEVSUyB8fC0tfHsgUkVQT1NJVE9SSUVTIDogY29udGFpbnMiLCJtZXJtYWlkIjp7InRoZW1lIjoiZGVmYXVsdCIsInRoZW1lVmFyaWFibGVzIjp7ImJhY2tncm91bmQiOiJ3aGl0ZSIsInByaW1hcnlDb2xvciI6IiNFQ0VDRkYiLCJzZWNvbmRhcnlDb2xvciI6IiNmZmZmZGUiLCJ0ZXJ0aWFyeUNvbG9yIjoiaHNsKDgwLCAxMDAlLCA5Ni4yNzQ1MDk4MDM5JSkiLCJwcmltYXJ5Qm9yZGVyQ29sb3IiOiJoc2woMjQwLCA2MCUsIDg2LjI3NDUwOTgwMzklKSIsInNlY29uZGFyeUJvcmRlckNvbG9yIjoiaHNsKDYwLCA2MCUsIDgzLjUyOTQxMTc2NDclKSIsInRlcnRpYXJ5Qm9yZGVyQ29sb3IiOiJoc2woODAsIDYwJSwgODYuMjc0NTA5ODAzOSUpIiwicHJpbWFyeVRleHRDb2xvciI6IiMxMzEzMDAiLCJzZWNvbmRhcnlUZXh0Q29sb3IiOiIjMDAwMDIxIiwidGVydGlhcnlUZXh0Q29sb3IiOiJyZ2IoOS41MDAwMDAwMDAxLCA5LjUwMDAwMDAwMDEsIDkuNTAwMDAwMDAwMSkiLCJsaW5lQ29sb3IiOiIjMzMzMzMzIiwidGV4dENvbG9yIjoiIzMzMyIsIm1haW5Ca2ciOiIjRUNFQ0ZGIiwic2Vjb25kQmtnIjoiI2ZmZmZkZSIsImJvcmRlcjEiOiIjOTM3MERCIiwiYm9yZGVyMiI6IiNhYWFhMzMiLCJhcnJvd2hlYWRDb2xvciI6IiMzMzMzMzMiLCJmb250RmFtaWx5IjoiXCJ0cmVidWNoZXQgbXNcIiwgdmVyZGFuYSwgYXJpYWwiLCJmb250U2l6ZSI6IjE2cHgiLCJsYWJlbEJhY2tncm91bmQiOiIjZThlOGU4Iiwibm9kZUJrZyI6IiNFQ0VDRkYiLCJub2RlQm9yZGVyIjoiIzkzNzBEQiIsImNsdXN0ZXJCa2ciOiIjZmZmZmRlIiwiY2x1c3RlckJvcmRlciI6IiNhYWFhMzMiLCJkZWZhdWx0TGlua0NvbG9yIjoiIzMzMzMzMyIsInRpdGxlQ29sb3IiOiIjMzMzIiwiZWRnZUxhYmVsQmFja2dyb3VuZCI6IiNlOGU4ZTgiLCJhY3RvckJvcmRlciI6ImhzbCgyNTkuNjI2MTY4MjI0MywgNTkuNzc2NTM2MzEyOCUsIDg3LjkwMTk2MDc4NDMlKSIsImFjdG9yQmtnIjoiI0VDRUNGRiIsImFjdG9yVGV4dENvbG9yIjoiYmxhY2siLCJhY3RvckxpbmVDb2xvciI6ImdyZXkiLCJzaWduYWxDb2xvciI6IiMzMzMiLCJzaWduYWxUZXh0Q29sb3IiOiIjMzMzIiwibGFiZWxCb3hCa2dDb2xvciI6IiNFQ0VDRkYiLCJsYWJlbEJveEJvcmRlckNvbG9yIjoiaHNsKDI1OS42MjYxNjgyMjQzLCA1OS43NzY1MzYzMTI4JSwgODcuOTAxOTYwNzg0MyUpIiwibGFiZWxUZXh0Q29sb3IiOiJibGFjayIsImxvb3BUZXh0Q29sb3IiOiJibGFjayIsIm5vdGVCb3JkZXJDb2xvciI6IiNhYWFhMzMiLCJub3RlQmtnQ29sb3IiOiIjZmZmNWFkIiwibm90ZVRleHRDb2xvciI6ImJsYWNrIiwiYWN0aXZhdGlvbkJvcmRlckNvbG9yIjoiIzY2NiIsImFjdGl2YXRpb25Ca2dDb2xvciI6IiNmNGY0ZjQiLCJzZXF1ZW5jZU51bWJlckNvbG9yIjoid2hpdGUiLCJzZWN0aW9uQmtnQ29sb3IiOiJyZ2JhKDEwMiwgMTAyLCAyNTUsIDAuNDkpIiwiYWx0U2VjdGlvbkJrZ0NvbG9yIjoid2hpdGUiLCJzZWN0aW9uQmtnQ29sb3IyIjoiI2ZmZjQwMCIsInRhc2tCb3JkZXJDb2xvciI6IiM1MzRmYmMiLCJ0YXNrQmtnQ29sb3IiOiIjOGE5MGRkIiwidGFza1RleHRMaWdodENvbG9yIjoid2hpdGUiLCJ0YXNrVGV4dENvbG9yIjoid2hpdGUiLCJ0YXNrVGV4dERhcmtDb2xvciI6ImJsYWNrIiwidGFza1RleHRPdXRzaWRlQ29sb3IiOiJibGFjayIsInRhc2tUZXh0Q2xpY2thYmxlQ29sb3IiOiIjMDAzMTYzIiwiYWN0aXZlVGFza0JvcmRlckNvbG9yIjoiIzUzNGZiYyIsImFjdGl2ZVRhc2tCa2dDb2xvciI6IiNiZmM3ZmYiLCJncmlkQ29sb3IiOiJsaWdodGdyZXkiLCJkb25lVGFza0JrZ0NvbG9yIjoibGlnaHRncmV5IiwiZG9uZVRhc2tCb3JkZXJDb2xvciI6ImdyZXkiLCJjcml0Qm9yZGVyQ29sb3IiOiIjZmY4ODg4IiwiY3JpdEJrZ0NvbG9yIjoicmVkIiwidG9kYXlMaW5lQ29sb3IiOiJyZWQiLCJsYWJlbENvbG9yIjoiYmxhY2siLCJlcnJvckJrZ0NvbG9yIjoiIzU1MjIyMiIsImVycm9yVGV4dENvbG9yIjoiIzU1MjIyMiIsImNsYXNzVGV4dCI6IiMxMzEzMDAiLCJmaWxsVHlwZTAiOiIjRUNFQ0ZGIiwiZmlsbFR5cGUxIjoiI2ZmZmZkZSIsImZpbGxUeXBlMiI6ImhzbCgzMDQsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlMyI6ImhzbCgxMjQsIDEwMCUsIDkzLjUyOTQxMTc2NDclKSIsImZpbGxUeXBlNCI6ImhzbCgxNzYsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlNSI6ImhzbCgtNCwgMTAwJSwgOTMuNTI5NDExNzY0NyUpIiwiZmlsbFR5cGU2IjoiaHNsKDgsIDEwMCUsIDk2LjI3NDUwOTgwMzklKSIsImZpbGxUeXBlNyI6ImhzbCgxODgsIDEwMCUsIDkzLjUyOTQxMTc2NDclKSJ9fSwidXBkYXRlRWRpdG9yIjpmYWxzZX0)

# Documentação

A explicação da solução, o desenho da implementação, o desenho do banco de dados, o passo a passo para executar localmente ou com docker, e o passo a passo para testar usando curl está tudo descrito neste **README.md**. 

## Clone o repositório

> Clonar o repositório da solução no **github** com os códigos fontes (https://github.com/fabriciofconde/proofconcept-tcc-archidistribsys)

```
git clone git@github.com:fabriciofconde/proofconcept-tcc-archidistribsys.git
```

> Acessar o diretório raiz do projeto **proofconcept-tcc-archidistribsys**

```
cd proofconcept-tcc-archidistribsys
```

## Opção 1 - Rodar projeto a partir de ambientes docker

#### Requerimentos

> É necessário que tenha instalado o **Docker**

Executar o comando abaixo do **docker-compose**. Este comando irá ler nosso arquivo **proofconcept-tcc-archidistribsys/docker-compose.yml** que irá fazer os downloads das imagens e depois irá inicializar as imagens conforme configuração no arquivo.

```
docker-compose up
```

Para interroper utilize

```
Crtl+C ou docker-compose down
```

#### Para fazer download das imagens separadamente

- docker pull fabriciofconde/dev-api (https://hub.docker.com/r/fabriciofconde/dev-api)
- docker pull fabriciofconde/api-gateway-zuul (https://hub.docker.com/r/fabriciofconde/api-gateway-zuul)
- docker pull fabriciofconde/authserver-oauth2 (https://hub.docker.com/r/fabriciofconde/authserver-oauth2)

## Opção 2 - Compilar e rodar o projeto localmente

> Necessário ter o **JDK 11 ou superior** instalado para conseguir

#### Primeiro, iremos iniciar a base de dados postgresql e pgadmin4

> Acesse a pasta **proofconcept-tcc-archidistribsys/db** dentro do projeto

```
cd db
```
> Execute o comando **docker-compose up** no diretório

```
docker-compose up --build
```

> Para acessar o pgadmin acesse http://localhost:16543/login com o usuário=fabriciofconde@gmail.com e senha=1234

#### Depois de iniciar o banco de dados, vamos compilar e executar nossa api de desenvolvedores

> Acesse a pasta **proofconcept-tcc-archidistribsys/dev-api** dentro do projeto

```
cd ../dev-api
```

> Execute o comando do maven descrito abaixo para compilar o projeto

```
.\mvnw clean package
```

> ou este outro comando para pular a execução dos testes unitários (ex: o banco de dados esteja desligado).

```
.\mvnw clean package -DskipTests
```

> Execute o comando do java para rodar a aplicação **dev-api**

```
java -jar .\target\dev-api-1.0.0.jar
```

#### Depois de iniciar a api de devs, vamos iniciar nossa api-gateway

> Acesse a pasta **proofconcept-tcc-archidistribsys/api-gateway-zuul** dentro do projeto

```
cd ../api-gateway-zuul
```

> Execute o comando do maven descrito abaixo para compilar o projeto

```
.\mvnw clean package -DskipTests
```

> Execute o comando do java para rodar a aplicação **api-gateway-zuul**

```
java -jar .\target\api-gateway-zuul-1.0.0.jar
```

#### E por último, vamos iniciar nosso authorization server

> Acesse a pasta **proofconcept-tcc-archidistribsys/authserver-oauth2** dentro do projeto

```
cd ../authserver-oauth2
```

> Execute o comando do maven descrito abaixo para compilar o projeto

```
.\mvnw clean package -DskipTests
```

> Execute o comando do java para rodar a aplicação **authserver-oauth2**

```
java -jar .\target\authserver-oauth2-1.0.0.jar
```

# Testando a aplicação

Para executar os testes abaixo é necessário que tenha instalado o **curl**.

#### Testaremos nosso AuthServer (passando as requisições pelo gateway)

1- Testar a api que retorna um access-token com sucesso

```
curl --location --request POST 'http://localhost:8080/auth-server/oauth/token?grant_type=client_credentials' --header 'Authorization: Basic Y2xpZW50VGVzdC1kZXZhcGk6c2VjdXJpdHkxMjM0'
```

> {"access_token":"4a6b1ba8-c708-41c7-88be-e94b80a0a76d","token_type":"bearer","expires_in":41899,"scope":"all"}
> HttpStatus: 200

1.1- Testar a api que retorna um access-token sem sucesso. Caso algum valor informado para ser credenciado esteja errado.

```
curl --location --request POST 'http://localhost:8080/auth-server/oauth/token?grant_type=client_credentials' --header 'Authorization: Basic Y2xpZW50VGVzdC1kZXZhcGlzczpzZWN1cml0eTEyMzQ='
```

> {"timestamp":"2020-09-29T16:25:29.826+00:00","status":401,"error":"Unauthorized","message":"","path":"/oauth/token"}
> HttpStatus: 401

2- Testar a api que checa se o token é valido com sucesso (**Importante:** Lembre de substituir o {token} pelo token gerado com sucesso no 1.1)

```
curl --location --request GET 'http://localhost:8080/auth-server/oauth/check_token?token={token}'
```

> {"scope":["all"],"active":true,"exp":1601438594,"authorities":["ROLE_ADMIN"],"client_id":"clientTest-devapi"}
> HttpStatus: 200

2.1- Testar a api que checa se o token é valido sem sucesso

```
curl --location --request GET 'http://localhost:8080/auth-server/oauth/check_token?1234'
```

> {"timestamp":"2020-09-29T16:28:48.738+00:00","status":400,"error":"Bad Request","message":"","path":"/oauth/check_token"}
> HttpStatus: 400

#### Testaremos nossa api-Devs (passando as requisições pelo gateway)

3- Testar método da api de devs sem passar o access-token (sem sucesso) - A segurança está ativada para todos os métodos

```
curl --location --request GET 'http://localhost:8080/devs-api/v1/developer'
```

> {"error":"unauthorized","error_description":"Full authentication is required to access this resource"}
> HttpStatus: 401

3.1- Testar método da api de devs com token inválido (sem sucesso) - A segurança está ativada para todos os métodos

```
curl --location --request GET 'http://localhost:8080/devs-api/v1/developer' --header 'Authorization: Bearer 1234'
```

> {"error": "invalid_token","error_description": "1234"}
> HttpStatus: 401

4- Testar método responsável por criar desenvolvedor a partir de um user github com sucesso (**Importante:** Lembre de substituir o {username} por um username que exista no github e o {token} pelo token gerado com sucesso no 1.1)

```
curl --location --request POST 'http://localhost:8080/devs-api/v1/developer/{username}' --header 'Authorization: Bearer {token}'
```

> {"id":2,"username":"fabriciofconde","avatarUrl":"https://avatars0.githubusercontent.com/u/2835024?v=4","name":"Fabrício Condé","company":"BHS","location":"Belo Horizonte, Brazil","email":null,"bio":null,"twitterUsername":null,"publicRepository":21,"followers":0,"following":6,"githubMemberSince":"2012-11-19T14:01:31Z"}
> HttpStatus: 200

4.1- Testar método responsável por criar desenvolvedor que ja existe localmente a partir de um user github (**Importante:** Lembre de substituir o {username} por um username que exista e o {token} pelo token gerado com sucesso no 1.1)

```
curl --location --request POST 'http://localhost:8080/devs-api/v1/developer/{username}' --header 'Authorization: Bearer {token}'
```

> {"timestamp":"2020-09-29T16:39:53.124Z","status":409,"error":"Conflict","message":"O desenvolver \"fabriciofconde\" já está cadastrado.","path":"/api/v1/developer/fabriciofconde"}
> HttpStatus: 409

4.2- Testar método responsável por criar desenvolvedor a partir de um username que não existe no github (**Importante:** Lembre de substituir o {token} pelo token gerado com sucesso no 1.1)

```
curl --location --request POST 'http://localhost:8080/devs-api/v1/developer/1f2a3b4r5i6c7i8o9f0c1o2n3d4e516' --header 'Authorization: Bearer {token}'
```

> {"timestamp":"2020-09-29T16:41:39.552Z","status":404,"error":"Not Found","message":"[404 Not Found] during [GET] to [https://api.github.com/users/1f2a3b4r5i6c7i8o9f0c1o2n3d4e516]  [GithubApiClient#getUserByLogin(String)]: [{\"message\":\"Not Found\",\"documentation_url\":\"https://docs.github.com/rest/reference/users#get-a-user\"}]","trace":"feign.FeignException$NotFound: [404 Not Found] during [GET] to [https://api.github.com/users/1f2a3b4r5i6c7i8o9f0c1o2n3d4e516]  [GithubApiClient#getUserByLogin(String)]: [{\"message\":\"Not Found\",\"documentation_url\":\"https://docs.github.com/rest/reference/users#get-a-user\"}]\n\tat feign.FeignException.clientErrorStatus(FeignException.java:201)\n\tat feign.FeignException.errorStatus(FeignException.java:177)\n\tat feign.FeignException.errorStatus(FeignException.java:169)\n\tat feign.codec.ErrorDecoder$Default.decode(ErrorDecoder.java:92)...","path":"/api/v1/developer/1f2a3b4r5i6c7i8o9f0c1o2n3d4e516"}
> HttpStatus: 404

5- Testar método responsável listar os desenvolvedores (**Importante:** Lembre de substituir o {token} pelo token gerado com sucesso no 1.1)

```
curl --location --request GET 'http://localhost:8080/devs-api/v1/developer' --header 'Authorization: Bearer {token}'
```

> [{"id":2,"username":"fabriciofconde","avatarUrl":"https://avatars0.githubusercontent.com/u/2835024?v=4","name":"Fabrício Condé","company":"BHS","location":"Belo Horizonte, Brazil","email":null,"bio":null,"twitterUsername":null,"publicRepository":21,"followers":0,"following":6,"githubMemberSince":"2012-11-19T14:01:31Z"},{"id":3,"username":"bemer","avatarUrl":"https://avatars3.githubusercontent.com/u/8561201?v=4","name":"Bruno Emer","company":null,"location":null,"email":null,"bio":null,"twitterUsername":null,"publicRepository":25,"followers":44,"following":3,"githubMemberSince":"2014-08-26T20:20:21Z"}]
> HttpStatus: 200

6- Testar método responsável por trazer o desenvolver pelo username (**Importante:** Lembre de substituir o {username} por um username cadastrado e {token} pelo token gerado com sucesso no 1.1)

```
curl --location --request GET 'http://localhost:8080/devs-api/v1/developer/{username}' --header 'Authorization: Bearer {token}'
```

> {"id":2,"username":"fabriciofconde","avatarUrl":"https://avatars0.githubusercontent.com/u/2835024?v=4","name":"Fabrício Condé","company":"BHS","location":"Belo Horizonte, Brazil","email":null,"bio":null,"twitterUsername":null,"publicRepository":21,"followers":0,"following":6,"githubMemberSince":"2012-11-19T14:01:31Z"}
> HttpStatus: 200

6.1- Testar método responsável por tentar consultar pelo username, mas que não existe (**Importante:** Lembre de substituir o {token} pelo token gerado com sucesso no 1.1)

```
curl --location --request GET 'http://localhost:8080/devs-api/v1/developer/1f2a3b4r5i6c7i8o9f0c1o2n3d4e516' --header 'Authorization: Bearer {token}'
```

> HttpStatus: 404

7- Testar método responsável por listar os repositórios do desenvolvedor (**Importante:** Lembre de substituir o {username} por um username cadastrado e {token} pelo token gerado com sucesso no 1.1)

```
curl --location --request GET 'http://localhost:8080/devs-api/v1/developer/{username}/repositories' --header 'Authorization: Bearer {token}'
```

> [{"id":22,"developerId":2,"name":"activerecord2java","description":null,"updatedAt":"2020-06-26T11:33:36Z","fork":false,"size":626,"forks":0,"watchers":0},{"id":23,"developerId":2,"name":"baking-microservice-pie","description":"This is the code of the demos for the \"Baking a Microservice Pie\" talk given by @radcortez and @agoncal","updatedAt":"2020-09-02T12:57:08Z","fork":true,"size":40195,"forks":0,"watchers":0},{"id":24,"developerId":2,"name":"basic-microservice-example","description":"Simple sketch of how we layout a clojure microservice","updatedAt":"2020-07-05T23:55:48Z","fork":true,"size":1609,"forks":0,"watchers":0},{"id":25,"developerId":2,"name":"containers-on-aws-workshop","description":null,"updatedAt":"2020-03-06T11:48:53Z","fork":true,"size":169451,"forks":0,"watchers":0},{"id":26,"developerId":2,"name":"globalize","description":"Rails I18n de-facto standard library for ActiveRecord model/data translation.","updatedAt":"2020-06-12T22:10:46Z","fork":true,"size":1593,"forks":0,"watchers":0},...}]
> HttpStatus: 200

8- Testar método responsável por remover desenvolvedor (**Importante:** Lembre de substituir o {id} por um existente e {token} pelo token gerado com sucesso no 1.1)

```
curl --location --request DELETE 'http://localhost:8080/devs-api/v1/developer/{id}' --header 'Authorization: Bearer {token}'
```

> HttpStatus: 200

8.1- Testar método responsável por remover desenvolvedor com usuário inexistente (**Importante:** Lembre de substituir o {token} pelo token gerado com sucesso no 1.1)

```
curl --location --request DELETE 'http://localhost:8080/devs-api/v1/developer/999999999' --header 'Authorization: Bearer {token}'
```

> {"timestamp":"2020-09-29T16:52:55.415Z","status":500,"error":"Internal Server Error","message":"No class br.com.ffc.puc.tcc.devapi.model.Developer entity with id 999999999 exists!","trace":"org.springframework.dao.EmptyResultDataAccessException: No class br.com.ffc.puc.tcc.devapi.model.Developer entity with id 999999999 exists!\n\tat org.springframework.data.jpa.repository.support.SimpleJpaRepository.lambda$deleteById$0(SimpleJpaRepository.java:176)...","path":"/api/v1/developer/999999999"}
> HttpStatus: 500