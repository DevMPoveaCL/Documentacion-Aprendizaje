// tsc arrays.ts && node arrays.js

console.log('ARRAYS');

// |----- ARRAYS -----| //

// const arrayDatos: string[] = ['B', 'C', 'D', 'E', 'F'];
// console.log('arrayDatos -> ', arrayDatos);

// |----- PUSH -----| //


    // const numero = arrayDatos.push('G', 'H');
    // console.log('número de letras -> ', numero);
    // console.log('arrayDatos -> ', arrayDatos);

// |----- UNSHIFT -----| //

    // console.log('arrayDatos -> ', arrayDatos);
    // arrayDatos.unshift('A');
    // console.log('arrayDatos -> ', arrayDatos);

// |----- FOR EACH -----| //

const arrayDatos: string[] = ['A', 'B', 'C', 'D', 'E', 'F'];
arrayDatos.forEach( (ele, index) => {
    console.log('ele', ele);
    

} );    

// console.log('arrayDatos -> ', arrayDatos);


// |----- MAP -----| //


const meses = ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'];


const mapeo = meses.map( (elemento) => {
    // console.log('mes -> ', mes);
    const text = 'Mes ' +  elemento;
    return text;
})

// mapeo = ['Mes Ene', 'Mes Feb', ....]


console.log('meses -> ', meses);
console.log('mapeo -> ', mapeo);


// |----- MÁS FUNCIONES -----| //



interface NotasI { 
    nombre: string, 
    codigo: number 
}

const materias: NotasI[] = [ 
    {nombre: 'Matemáticas', codigo: 105},
    {nombre: 'Ciencias', codigo: 208},
    {nombre: 'Sociales', codigo: 309} 
]

const busquedaMateria = materias.find( (materia) => { 
    if (materia.nombre == 'Ciencias') {
        return true;
    } 
    return false
});

console.log('busquedaMateria -> ', busquedaMateria);
console.log('busquedaMateria -> ', busquedaMateria?.codigo);



// |----- DESAFIO -----| //

type Dia = 'Lunes' | 'Martes' | 'Miércoles' | 'Jueves' | 'Viernes'
interface Venta {
    dia: Dia;
    ventas: number[]
}

const ventasArray: Venta[] = [
    {dia: 'Lunes', ventas: [10, 30, 45, 50] },
    {dia: 'Martes', ventas: [20, 30, 45, 30] },
    {dia: 'Viernes', ventas: [90, 30, 45, 5] },
    {dia: 'Lunes', ventas: [10, 50, 45, 80] },
];

function reporteByDia(dia: Dia): string {
    let total: number = 0;
    ventasArray.forEach( (reporteDia) => {
        if (reporteDia.dia == dia) {
            reporteDia.ventas.forEach( (venta) => {
                total = total + venta
            })
        }
    })
    return `Las ventas totales de los dias ${dia} es: ${total}`
}

// const msg = reporteByDia('Lunes');
const msg = reporteByDia('Martes');
console.log('msg -> ', msg);



