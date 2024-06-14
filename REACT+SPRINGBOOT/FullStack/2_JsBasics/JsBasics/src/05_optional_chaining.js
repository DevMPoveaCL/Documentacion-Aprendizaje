const invoice = {
    id: 10,
    name: 'Compras de Oficina',
    date: new Date(),
    client: {
        id: 2,
        firstname: 'John Doe',
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
// El operador optional chaining (?.) permite acceder a propiedades de objetos de manera segura, 
// retornando undefined si una propiedad intermedia es null o undefined, evitando errores.
console.log(invoice.company?.firstname);
