

const user = {
    username: 'Andrés',
    email: 'correo@google.com',
    age: 20,
    ranking:9,
};

// Desestructa el objeto y sus atributos locales en el global.
const{username, ranking, age} = user;

console.log(`${username} tiene ${age} de edad`);
console.log(ranking);