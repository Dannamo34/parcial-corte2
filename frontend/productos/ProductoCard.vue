<!-- src/components/ProductoCard.vue -->
<template>
  <div class="producto-section">
    <h2>Productos</h2>
    <div class="producto-list">
      <div class="producto-card" v-for="producto in productos" :key="producto.id">
        <h3>{{ producto.nombre }}</h3>
        <p>$ {{ producto.precio }}</p>
        <label>Cantidad:</label>
        <input type="number" v-model.number="producto.cantidad" min="1" />
        <button @click="agregar(producto)">Agregar</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "ProductoCard",
  emits: ["agregar-producto"],
  data() {
    return {
      productos: [
        { id: 1, nombre: "Mouse", precio: 50, cantidad: 1 },
        { id: 2, nombre: "Teclado", precio: 80, cantidad: 1 },
        { id: 3, nombre: "Monitor", precio: 300, cantidad: 1 }
      ]
    };
  },
  methods: {
    agregar(producto) {
      this.$emit("agregar-producto", { ...producto });
    }
  }
};
</script>

<style scoped>
.producto-section {
  background-color: #f0f9ff;
  padding: 15px;
  border-radius: 10px;
  width: 30%;
}
.producto-list {
  display: flex;
  flex-direction: column;
  gap: 10px;
}
.producto-card {
  background-color: #cfe8fc;
  padding: 10px;
  border-radius: 8px;
}
button {
  margin-top: 8px;
  background: #007bff;
  color: white;
  border: none;
  padding: 6px 10px;
  border-radius: 5px;
}
</style>
