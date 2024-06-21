
import {invoiceById} from './data/invoices';

//Asíncrono "simula API remoto "
const promise = new Promise((resolve, reject) => {
    setTimeout(() => {
        const result = invoiceById(2);
        if (result){
            resolve(result);
        }else{
            reject ('error: no existe la factura por el id!')
        }
    }, 2500);
}); 

promise
    .then(console.log)
    .catch(console.error);
