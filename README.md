Respostas da Atividade:


1. Por que Zoologico tem uma lista de animais, em vez de herdar de uma lista?


O fato de ter uma lista de animais em vez de herdar de uma lista entra no principio de composição pois Zooligo não é um tipo ele é uma entidade que usa uma lista. Apartir do momento que ele é uma composição ele vai conseguir controlar exatamente o que pode ser feito com os animais e a lista passa a ser um detalhe de implementação escondido. 


2. Por que Pato pode implementar duas interfaces, mas não poderia herdar de duas classes?

No Java não podemos fazer com que uma classe filho tenha herança de mais de uma classe pai mas ela pode ter quantas interfaces quiser (claro desde que faça sentido para aquela classe) apartir dos contratos de comportamento. Se chama problema do diamante que foi apresentado na aula, pois se duas classes pai tivessem os mesmos métodos -e fossem herdadas- o compilador não saberia o que fazer ou qual fazer primeiro. O exemplo vai ser a classe Pato.


3. Por que a mesma linha a.emitirSom() executa um código diferente pra cada animal?

Por causa do Polimorfismo. O tipo é declarado como Animal mas o objeto que vai ser referenciado pode ser qualquer um que foi cadastrado e vai ser feito em tempo de execução a partir da versão que foi sobrescrita com o Override.
