
//Pepe y "cero" es default para undefined.
const sayHello = (firstname = 'Pepe', age = 0) => `Hola mundo function= Nombre: ${firstname} Edad: ${age}  `;
const add = (a = 0, b = 0) => a+b;
// console.log('Hola mundo function');


const result = sayHello('Andrés');

console.log(result);
console.log (add(10,5))