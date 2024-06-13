const invoice = {
    id: 10,
    name: 'Compras de Oficina',
    date: new Date(),
    client: 'John Doe',
    total: 1000,
};

invoice.client = 'Pepe Roe'; //Es como el método set de Java
invoice.total = 5000;
console.log (invoice); // Se selecciona mediante punto si se quiere mostrar solo un atributo del objeto.