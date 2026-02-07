# practica2

This repo shows a design and implementation of a REST web services which uses http request and response architectural style. CRUD is implemented to a shopping cart simulation. 

| Method  | Endpoint | Description | Response | 
| ------------- | ------------- | ------------ | --------- |
| POST  | "/api/carrito"  | Creates a shopping cart with a product | 201, 400 |
| GET  | "/api/carrito/{idCarrito}"  | Gets a specific shopping cart bases on the id given from the client | 200, 404 |
| PUT  | "/api/carrito/{idCarrito}"  | Updates an existing shopping cart to a new shopping cart | 200, 404 |
| DELETE  | "/api/carrito/borrar/{idCarrito}"  | Deletes an existing shopping cart | 200, 404 |
