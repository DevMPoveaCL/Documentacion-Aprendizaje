import { useState } from "react";

export const CounterApp = ({value}) => {

  const [counter, setCounter]= useState(value);


  const counterIncrement = () => setCounter(c => c + 1);
  

  return <>
  <h1>El valor del contador es {counter}</h1>
  <button onClick={ counterIncrement } >Incrementar contador +1 </button>
  </>
}