# restaurant-menu-api
Simple menu api Springboot CRUD. 

# Task

### API para restaurant

Se necesita  crear un API para un restaurante en base a la siguiente descripción:

a) Un restaurante posee un total de 10 platos en su menú. Cada uno de ellos tiene un número de plato, nombre, precio y breve descripción. El restaurante desea una aplicación que permita que los clientes sean capaces consultar los datos de los platos del menú a partir de proporcionar el número de plato. Para ello, se necesita el desarrollo de una API que a partir de la recepción de una id en una solicitud GET, devuelva el plato correspondiente. 

b) Para la carga de los 10 platos, se solicita una API que sea capaz de recibir los datos de cada plato mediante el método POST. Como resultado de la solicitud se debe agregar un nuevo objeto Plato a la lista de Platos que será luego consultada por el cliente.

### Calls 

#### Get menu

/menu

#### Get sepecific dish

/menu/{id}

#### Add a dish

/menu/add (send Dish body)

#### Edit dish

/menu/edit/{id} (send with params from Dish model)

#### Delete dish 

/menu/remove/{id}

# Status 

:heavy_check_mark: Completed
