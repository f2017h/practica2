package edu.comillas.icai.git.pat.spring.feliciahuynh;

import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class ControladorCarrito {
    private Map<Long, ModeloCarrito> shoppingCartMap = new ConcurrentHashMap<>();
    private Long idContador = 0L;
    @PostMapping("/api/carrito")
    @ResponseStatus(HttpStatus.CREATED)
    public ModeloCarrito crear(@RequestBody ModeloCarrito carritoNuevo) {

        long idCarrito = idContador++;
        Long precioFinal = carritoNuevo.unidades() * 10;

        ModeloCarrito carrito = new ModeloCarrito(
                idCarrito,
                carritoNuevo.idArticulo(),
                carritoNuevo.descripcion(),
                carritoNuevo.unidades(),
                precioFinal);

        shoppingCartMap.put(idCarrito, carrito);
        return carrito;
    }

    @GetMapping("/api/carrito/{idCarrito}")
    public ModeloCarrito buscar(@PathVariable Long idCarrito) {
        ModeloCarrito cart = shoppingCartMap.get(idCarrito);
        if (cart == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Cart not found");
        }
        return cart;
    }


    @PutMapping("/api/carrito/{idCarrito}")
    public ModeloCarrito actualizar(@PathVariable Long idCarrito, @RequestBody ModeloCarrito carritoNuevo){
        ModeloCarrito cart = shoppingCartMap.get(idCarrito);
        if (cart == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Cart not found");
        }

        Long precioFinal = carritoNuevo.unidades() * 10;
        ModeloCarrito carrito = new ModeloCarrito(
                idCarrito,
                carritoNuevo.idArticulo(),
                carritoNuevo.descripcion(),
                carritoNuevo.unidades(),
                precioFinal
                );

        shoppingCartMap.put(idCarrito, carrito);
        return carrito;
    }


    @DeleteMapping("/api/carrito/borrar/{idCarrito}")
    public void borrar(@PathVariable Long idCarrito){
        shoppingCartMap.remove(idCarrito);
        return;
    }

}
