
//importación función por defecto e invoices y luca
import invoiceById, {invoices, luca} from './data/invoices';


//Creación de nuevas instancias (arrays) sin afectar al original, forEach afecta al original.
// Genera un array con los nombres de todas las facturas usando el método map.
const invoicesName = invoices.map (i => i.name);

console.log(invoices); // Imprime todas las facturas
console.log(invoicesName); // Imprime los nombres de las facturas

// Genera un array con los nombres de los clientes de todas las facturas usando el método map.
const invoiceClient = invoices.map (i => {
    return i.client.firstname;
});

console.log(invoiceClient); // Imprime los nombres de los clientes

// Encuentra y retorna la factura con id idéntico a 3 usando el método find.
// const invoiceById = invoices.find(i => i.id === 3 );
console.log(invoiceById()); // Imprime la factura con id 3

// Filtra y retorna las facturas con id mayor a 1 usando el método filter.
const invoiceFilter = invoices.filter(i => i.id > 1);
console.log(invoiceFilter); // Imprime las facturas con id mayor a 1

// Filtra y retorna las facturas que contienen el producto "luca" en sus artículos usando el método filter.
const invoiceFilter2 = invoices.filter(i => i.items.includes(luca));
console.log(invoiceFilter2); // Imprime las facturas que contienen el producto "luca"

// Filtra y retorna las facturas excluyendo la factura con id igual a 2 usando el método filter.
const invoiceDelete = invoices.filter(i => i.id != 2);
console.log(invoiceDelete); // Imprime las facturas excluyendo la factura con id 2

// Verifica si existe alguna factura con id igual a 3 usando el método some.
const result = invoices.some(i => i.id === 3);
console.log(result); // Imprime true si existe una factura con id 3, de lo contrario false
