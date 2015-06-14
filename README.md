#Teste de programa��o

<br>

##Suposi��es

- Assumi a constru��o de uma aplica��o web;
- As sondas n�o podem assumir valores de X e Y negativos;
- As sondas n�o podem ultrapassar os limites do planalto;
- Caso sejam passadas coordenadas que n�o estejam de acordo com as suposi��es acima, a sonda mant�m seu estado;
- Caso seja informada uma a��o n�o esperada (diferente de L, M e R), a sonda mant�m seu estado.


##Aplica��o

A aplica��o foi implementada e testada no seguinte ambiente:

- maven 3
- Java 6
- Chrome 42
- Firefox 33

Trata-se de uma aplica��o Java com spring-boot e google charts, para renderizar o movimento da sonda no planalto.
<br>
Para compilar/rodar testes, primeiro execute
<br>
```
mvn clean install
```
<br>
Para executar a aplica��o, execute a linha de comando:
<br>
```
java -jar target/nasa-teste-0.0.1-SNAPSHOT.jar
```
<br>
O Spring-boot ir� inicializar a aplica��o web, e far� o bind na porta 8080. Pronto! � s� acessar [http://localhost:8080], preencha a *textarea* com a entrada do algoritmo, e a sa�da ser� renderizada na tela.