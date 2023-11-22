
let nome = prompt('Por favor, digite seu nome:');
let cidade = prompt('Digite a cidade onde você mora:');
console.log(typeof nome, typeof cidade);

console.log(`Olá, meu nome é ${nome} e eu moro em ${cidade}`);

// Perguntas Sim ou Não
let resposta1 = prompt('Você gosta de Esportes? (Sim ou Não):');
let resposta2 = prompt('Você gosta de cozinhar? ( Sim ou Não):');
let resposta3 = prompt('Você ja comeu churrasco? ( Sim ou Não):');

console.log('Você gosta de Esportes? Resposta:', resposta1);
console.log('Você gosta de cozinhar? Resposta:', resposta2);
console.log('Você ja comeu churrasco? Resposta:', resposta3);


let x = 5;
let y = 10;
let z

z = x
x = y
y = z



[x, y] = [y, x];

// console.log("Troquei valores x = 10", x)
// console.log("Troquei valores y = 5", y)
 
let numero1 = Number(prompt (' Insira seu primeiro número'))
let numero2 = Number(prompt (' Insira seu segundo número'))
 
let soma = numero1 + numero2
console.log(soma)
 
let multiplicar = numero1*numero2