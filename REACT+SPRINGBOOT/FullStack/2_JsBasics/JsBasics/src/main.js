function sayHello(firstname = 'Pepe', age = 0){ //Pepe y "cero" es default para undefined.
   
   const greeting = `Hola mundo function: 
   Nombre: ${firstname}
   Edad: ${age}  `;
    // console.log('Hola mundo function');
    return greeting;
}

const result = sayHello('Andrés');

console.log(result);