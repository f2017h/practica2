# practica2

This repo shows a design and implementation of a REST web services which uses http request and response architectural style. CRUD is implemented to a shopping cart simulation. 

| Method  | Endpoint | Body | Description | Response | 
| ------------- | ---------- | ------------| ------------ | --------- |
| POST  | "/api/carrito"  | CART JSON without id or final price | Creates a shopping cart with a product | 201, 400 |
| GET  | "/api/carrito/{idCarrito}"  | - | Gets a specific shopping cart bases on the id given from the client | 200, 404 |
| PUT  | "/api/carrito/{idCarrito}"  | CART JSON without id or final price  | Updates an existing shopping cart to a new shopping cart | 200, 404 |
| DELETE  | "/api/carrito/borrar/{idCarrito}"  | - | Deletes an existing shopping cart | 200, 404 |
