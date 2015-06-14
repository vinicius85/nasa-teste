#Teste de programação

<br>

##Suposições

- Assumi a construção de uma aplicação web;
- As sondas não podem ultrapassar os limites do planalto, caso a ação não esteja de acordo com esta suposição, a sonda mantém seu estado;
- Caso seja informada uma ação não esperada (diferente de L, M e R), a sonda mantém seu estado.


##Aplicação

A aplicação foi implementada e testada no seguinte ambiente:

- maven 3
- Java 6
- Chrome 42
- Firefox 33

Trata-se de uma aplicação Java com spring-boot e google charts, para renderizar o movimento da sonda no planalto.
<br>
Para compilar/rodar testes, primeiro execute
<br>
```
mvn clean install
```
<br>
Para executar a aplicação, execute a linha de comando:
<br>
```
java -jar target/nasa-teste-0.0.1-SNAPSHOT.jar
```
<br>
O Spring-boot irá inicializar a aplicação web, e fará o bind na porta 8080. Pronto! É só acessar [http://localhost:8080], preencha a *textarea* com a entrada do algoritmo, e a saída será renderizada na tela.