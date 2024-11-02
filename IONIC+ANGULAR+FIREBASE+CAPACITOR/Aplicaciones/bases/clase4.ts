// |----- ASYNC AWAIT -----| //
// tsc async-await.ts && node async-await.js


interface UserI2 {id: number; name: string;}
const db: UserI2[] = [ {id: 1, name: 'A'}, {id: 2, name: 'B'}, {id: 3, name: 'C'}]

function find(id: number): Promise<boolean> {
    return new Promise((resolve, reject) => { 
      
      setTimeout(() => {
        let exist = false;
        // // sentencias
        // db.find(argumentos)
        resolve(exist)
        return;
      
      }, 1000);

    })
}

function save(data: any):  Promise<boolean> {
  return new Promise((resolve, reject) => { 
      

    setTimeout(() => {
      let saved: boolean = true;
      // sentencias
      // db.create(data)
      resolve(saved)
      return;
    }, 3000)


  })
}

const user: UserI2 = {id: 4, name: 'D'}


async function createUser(user: any) {
    console.log('finding...');
    const exist = await find(user.id);
    console.log('finish function find -> ', exist);
    if (!exist) {
        console.log('saving...');
        const saved = await save(user);
        console.log('finish function save -> ', exist);
        if (saved) {
          console.log('guardado con éxito');
        }
    }
}

createUser(user)

//createUser with async and await



// const user: UserI = {id: 3, name: 'D'}
// createUser(user);


// CREANDO UNA PROMESA

function delay(time: number): Promise<number> {
 return new Promise ( (resolve) => {
      setTimeout( () => {

          console.log('finish delay');
          resolve(10)

      }, time*1000 );   
 })


}

async function action() {
  console.log('call to delay');
  const res = await delay(3)
  console.log('after delay -> ', res);
}

// action();




