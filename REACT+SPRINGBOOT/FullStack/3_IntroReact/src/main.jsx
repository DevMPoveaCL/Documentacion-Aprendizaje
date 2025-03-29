import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { HelloWorldApp } from './HelloWorldApp'


createRoot(document.getElementById('root')).render(
  <StrictMode>
    <HelloWorldApp user= {{name: 'Pepe', lastName: 'Cuenca'}}
    id= {1}
    />
  </StrictMode>,
)
