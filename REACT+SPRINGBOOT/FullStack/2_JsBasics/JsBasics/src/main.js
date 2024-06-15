// Definición del objeto "luca" que representa un producto con propiedades de nombre, precio y cantidad.
const luca = {
    product: 'luca',
    price: 1000,
    quantity: 1,
};

// Creación de un array "invoices" que contiene múltiples objetos, cada uno representando una factura con detalles como id, nombre, fecha, cliente y artículos.
const invoices = [
    {
        id: 1,
        name: 'Compras de oficina',
        date: new Date(), // Establece la fecha actual
        client: {
            firstname: 'John',
            lastname: 'Doe',
        },
        items: [
            {
                product: 'teclado',
                price: 399,
                quantity:2,
            },
            {
                product: 'mouse',
                price: 200,
                quantity:1,
            },
            {
                product: 'papel',
                price: 100,
                quantity:10,
            },
            luca, // Añade el producto "luca" a la lista de artículos
        ]
    },
    {
        id: 2,
        name: 'Compras de medicamentos',
        date: new Date(),
        client: {
            firstname: 'Raúl',
            lastname: 'Doe',
        },
        items: [
            {
                product: 'paracetamol',
                price: 699,
                quantity:2,
            },
            {
                product: 'metformina',
                price: 800,
                quantity:1,
            },
            {
                product: 'enalapril',
                price: 670,
                quantity:10,
            },
        ]
    },
    {
        id: 3,
        name: 'Compras de perfumería',
        date: new Date(),
        client: {
            firstname: 'Celeste',
            lastname: 'Doe',
        },
        items: [
            {
                product: 'axe chocolate',
                price: 1499,
                quantity:2,
            },
            {
                product: 'etiquet women',
                price: 900,
                quantity:1,
            },
            {
                product: 'head and shoulders shampoo',
                price: 2000,
                quantity:1,
            },
            luca, // Añade el producto "luca" a la lista de artículos
        ]
    }
];

//Creación de nuevas instancias (arrays) sin afectar al original, forEach afecta al original.
// Genera un array con los nombres de todas las facturas usando el método map.
const invoicesName = invoices.map(i => {
    return i.name;
});

console.log(invoices); // Imprime todas las facturas
console.log(invoicesName); // Imprime los nombres de las facturas

// Genera un array con los nombres de los clientes de todas las facturas usando el método map.
const invoiceClient = invoices.map (i => {
    return i.client.firstname;
});

console.log(invoiceClient); // Imprime los nombres de los clientes

// Encuentra y retorna la factura con id idéntico a 3 usando el método find.
const invoiceById = invoices.find(i => i.id === 3 );
console.log(invoiceById); // Imprime la factura con id 3

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
