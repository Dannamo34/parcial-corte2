<!-- src/views/PantallaPrincipal.vue -->
<template>
  <div class="contenedor">
    <ProductoCard @agregar-producto="agregarAlCarrito" />
    <PantallaFactura :carrito="carrito" />
    <TipoPago />
  </div>
</template>

<script>
import ProductoCard from "../components/ProductoCard.vue";
import PantallaFactura from "../components/PantallaFactura.vue";
import TipoPago from "../components/TipoPago.vue";

export default {
  name: "PantallaPrincipal",
  components: {
    ProductoCard,
    PantallaFactura,
    TipoPago
  },
  data() {
    return {
      carrito: []
    };
  },
  methods: {
    agregarAlCarrito(producto) {
      const existe = this.carrito.find((p) => p.id === producto.id);
      if (existe) {
        existe.cantidad += producto.cantidad;
      } else {
        this.carrito.push(producto);
      }
    }
  }
};
</script>

<style scoped>
.contenedor {
  display: flex;
  flex-direction: row;
  gap: 20px;
  padding: 20px;
}
</style>
