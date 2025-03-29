const httpCLient = fetch('https://jsonplaceholder.typicode.com/users');

httpCLient
    .then(response => response.json())
    .then(data => console.log(data));