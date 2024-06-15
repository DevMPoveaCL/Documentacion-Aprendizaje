const invoice = {
    id: 10,
    name: 'Compras de Oficina',
    date: new Date(),
    client: {
        id: 2,
        firstname: 'John',
        lastname: 'Doe',
        age: 20,
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
    ],
    total: function() {
        let total = 0;
        this.items.forEach(item =>{
            total = total + item.price*item.quantity;
        });
        return total;
    },
    greeting: function() {
        return `Hola ${this.client.firstname}`;
    }
};

// invoice.client.firstname = 'Pepe'; //Es como el método set de Java
// invoice.total = 5000;
console.log (invoice); // Se selecciona mediante punto si se quiere mostrar solo un atributo del objeto.

const greeting = invoice.greeting();
console.log(greeting);
console.log('Total: ' + invoice.total());