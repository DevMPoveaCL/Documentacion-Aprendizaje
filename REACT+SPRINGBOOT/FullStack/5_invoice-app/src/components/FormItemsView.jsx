import { useState } from "react";

export const FormItemsView = ({ handler }) => {

    const [formItemsState, setFormItemsState] = useState({
        product: '',
        price: '',
        quantity: '',
    });
    const { product, price, quantity } = formItemsState;

    const onInputChange = ({ target: { name, value } }) => {
        setFormItemsState({
            ...formItemsState,
            [name]: value
        });
    };

    const onInvoiceItemsSubmit = (event) => {
        event.preventDefault();
        if (product.trim().length <= 1) {
            alert("El nombre del producto debe tener 2 o más carácteres")
            return
        };
        if (isNaN(price.trim()) || price.trim().length <= 1) {
            alert("El precio del producto debe ser un número y tener 2 o más dígitos")
            return
        };
        if (isNaN(quantity.trim()) || quantity.trim().length < 1) {
            alert("La cantidad del producto debe se un número y tener 1 o más dígitos")
            return
        };

        handler(formItemsState);

        setFormItemsState({
            product: '',
            price: '',
            quantity: '',
        });

    }


    return (<>
        <form className="w-50" onSubmit={onInvoiceItemsSubmit}>
            <input
                type="text"
                name="product"
                value={product}
                placeholder="Producto"
                className="form-control m-3"
                onChange={onInputChange} />
            <input
                type="text"
                name="price"
                value={price}
                placeholder="Precio"
                className="form-control m-3"
                onChange={onInputChange} />

            <input
                type="text"
                name="quantity"
                value={quantity}
                placeholder="Cantidad"
                className="form-control m-3"
                onChange={onInputChange} />
            <button
                type="submit"
                className="btn btn-primary m-3">
                Nuevo Item
            </button>
        </form>
    </>)
};
