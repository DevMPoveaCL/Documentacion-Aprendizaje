// tipos de variables - tipado de datos
// boolean - string - number - Date - array -  - object - any - null - undefined

let helloWorld = "Hello World";
let text: string = 'Hello word';
let temp: number = 10;
// let temp;
let today: Date;
let datos: string[] = ['a', 'b', 'c']
let test: any;
// let datos: string[] = ['a', 'b', 10]
// let datos: Array<string> = ['a', 'b', 10]
// let datos: Array<any> = ['a', 'b', 10]
// let datos: any[] = ['a', 'b', 10]
// let user = { nombre: 'Juan', edad: 10, enable: false};
// let user: UserI = { nombre: 'Juan', edad: 10, enable: false};
// let user: UserI; 
// user = {
  
// }

// interfaces 
interface UserI {
  name: string;
  edad: number;
  // enable: boolean;
  direccion?: boolean;
}



// componiendo tipos de datos 
type MyBool = true | false;
let enable: MyBool = false;

type Rol = 'admin' | 'vendedor' | 'cliente';

interface User {
  name: string;
  email: string;
  rol: Rol
}

const cliente: User = {
  name: 'Juan',
  email: 'juan@inc.com',
  rol: 'admin'
}

// const users: User[];
// let users: Array<User>;
// let users: Array<{name: string, email: string}>;

 





console.log('cliente es de tipo -> ', typeof cliente);
console.log('datos es de tipo  -> ', typeof datos);
console.log('datos es un array  -> ', Array.isArray(datos));

console.log('temp es de tipo  -> ', typeof temp);