import PropTypes from "prop-types";
import { Title } from "./components/Title";
import { UserDetails } from "./components/UserDetails";
import { Book } from "./components/Book";

export const HelloWorldApp = ({user, id, title, book}) => {

    console.log(title);
    //const name = 'Goku';

    return (
    <>
        <Title title= {title} />
        <UserDetails user={user} id={id}/>
        <Book book= {book}/>
    </>
    );
}


HelloWorldApp.propTypes = {
    user: PropTypes.object.isRequired,
    title: PropTypes.string.isRequired,
    id: PropTypes.number.isRequired
};

HelloWorldApp.defaultProps = {
    title: 'Hola mundo por defecto',
    book: 'UML got a gota'
};