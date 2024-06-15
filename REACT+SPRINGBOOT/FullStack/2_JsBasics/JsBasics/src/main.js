
const invoices = [
    {
        id: 1,
        name: 'Compras de oficina',
        date: new Date(),
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
        ]
    }
];

const invoicesClone = invoices.map(i => {
    return i.firstname
})