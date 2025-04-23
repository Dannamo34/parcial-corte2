<!-- src/components/PantallaFactura.vue -->
<template>
  <div class="factura">
    <h2>Factura</h2>

    <div class="encabezado">
      <label>Cliente:</label>
      <input v-model="encabezado.cliente" type="text" placeholder="Nombre del cliente" />

      <label>Fecha:</label>
      <input v-model="encabezado.fecha" type="date" />

      <label>N° Factura:</label>
      <input v-model="encabezado.numero" type="text" placeholder="0001" />
    </div>

    <h3>Detalle:</h3>
    <ul>
      <li v-for="item in carrito" :key="item.id">
        {{ item.nombre }} x {{ item.cantidad }} - ${{ item.precio * item.cantidad }}
      </li>
    </ul>
    <p><strong>Total: ${{ total }}</strong></p>
  </div>
</template>

<script>
export default {
  name: "PantallaFactura",
  props: ["carrito"],
  data() {
    return {
      encabezado: {
        cliente: "",
        fecha: "",
        numero: ""
      }
    };
  },
  computed: {
    total() {
      return this.carrito.reduce((sum, item) => sum + item.precio * item.cantidad, 0);
    }
  }
};
</script>

<style scoped>
.factura {
  background-color: #fff4e6;
  padding: 20px;
  border-radius: 10px;
  width: 35%;
}
.encabezado {
  background-color: #ffe9d0;
  padding: 10px;
  margin-bottom: 15px;
  border-radius: 8px;
  display: flex;
  flex-direction: column;
  gap: 8px;
}
input {
  padding: 5px;
  border-radius: 5px;
  border: 1px solid #ccc;
}
</style>
