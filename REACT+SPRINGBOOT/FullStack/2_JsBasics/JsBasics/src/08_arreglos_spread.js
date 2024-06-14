

const products = ['mesa', 'silla', 'mouse', 'teclado'];
// push modifica el array original, concat crea una nueva instancia.
products.push('pantalla lcd', 'celular');

const fruits = ['pera', 'manzana', 'sandia', 'frutilla'];

// Nombre de arreglos en plural y objetos en singular.
const orders = [ ...products, ...fruits, 'lechuga', 'papa', 'uva'];




console.log (products);
console.log (orders);

