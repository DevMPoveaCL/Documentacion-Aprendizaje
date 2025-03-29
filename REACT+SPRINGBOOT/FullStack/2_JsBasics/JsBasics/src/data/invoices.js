
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

/* export const invoiceById = () => {
   return invoices.find(i => i.id === 3 );
}  */
 /*   export default () => {
    return invoices.find(i => i.id === 3 );
 }  */

const invoiceById = (id) => {
    return invoices.find(i => i.id === id );
} 

const findInvoiceById = (id) => {
    const promise = new Promise((resolve, reject) => {
        setTimeout(() => {
            const result = invoiceById(id);
            if (result){
                resolve(result);
            }else{
                reject ('error: no existe la factura por el id!')
            }
        }, 2500);
    }); 
    return promise;
}

//funciones a exportar
export {
    invoices as default,
    invoiceById,
    luca,
    findInvoiceById
}