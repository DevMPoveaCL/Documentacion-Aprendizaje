
//-----|BUCLES|-----//

//-----|FOR|-----//

// for ([expresion-inicial]; [condicion]; [expresion-final]) sentencia

// for ( ; ; ) {



// }

//-----|EJEMPLOS|-----//    -- break -- continue

// index = 10

for (let index = 0; index < 10; index ++) {
    if (index == 5) {
        break;
    }
    console.log('index -> ', index);
    

}





const ventas = [10, 20 , 13, 16]

let total = 0;
for (let i = 0; i < ventas.length; i = i + 1) {
    total = total + ventas[i];
}

// const total = ventas[0] + ventas[1] + ventas[2] + ventas[3]

// console.log('total -> ', total);


//-----|FOR OF|-----//

// for (const iterator of array) {
    
// }

let iterable = [10, 20, 30];

for (let venta of ventas) {
//   console.log(venta);
}


const cars = [ {placa: 'ABC-123', year: 2013}, {placa: 'ABC-1230', year: 2015}]

for (let car of cars) {
    // console.log(car.placa);
}



//-----|FOR IN|-----//

const object: any = { a: 1, b: 2, c: 3 };

for (const property in object) {
//   console.log(property);
//   console.log(object [property])
}


// DESAFIO
// Calcular el promedio de varios estudiantes cada uno con n notas

const estudiantes = [ {nombre: "juan", notas: [20, 19, 18]}, {nombre: "josé", notas: [10, 13, 0, 10, 20, 20]}  ];

for (let estudiante of estudiantes) {
    let suma = 0;
    for (let nota of estudiante.notas) {
        suma += nota;
    }
    const prom = suma / estudiante.notas.length;
    console.log(`el estudiante ${estudiante.nombre} tiene un promedio de ${prom.toFixed(2)}`);
}