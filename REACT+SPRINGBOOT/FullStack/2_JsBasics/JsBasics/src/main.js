
import {invoiceById} from './data/invoices';

//Asíncrono "simula API remoto "
const promise = new Promise((resolve, reject) => {
    setTimeout(() => {
        const result = invoiceById(3);
        console.log(result)
    }, 2500);
}); 


