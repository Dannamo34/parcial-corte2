<!-- src/components/TipoPago.vue -->
<template>
  <div class="pago">
    <h2>Método de Pago</h2>

    <div class="opciones">
      <label v-for="opcion in opciones" :key="opcion.valor" :class="{ activo: seleccionado === opcion.valor }">
        <input
          type="radio"
          :value="opcion.valor"
          v-model="seleccionado"
        />
        {{ opcion.texto }}
      </label>
    </div>

    <p v-if="seleccionado">Seleccionado: <strong>{{ seleccionado }}</strong></p>
  </div>
</template>

<script>
export default {
  name: "TipoPago",
  data() {
    return {
      seleccionado: "",
      opciones: [
        { valor: "efectivo", texto: "Efectivo 💵" },
        { valor: "tarjeta", texto: "Tarjeta 💳" },
        { valor: "transferencia", texto: "Transferencia 🏦" }
      ]
    };
  }
};
</script>

<style scoped>
.pago {
  background-color: #e8ffe5;
  padding: 15px;
  border-radius: 10px;
  width: 30%;
}
.opciones {
  display: flex;
  flex-direction: column;
  gap: 10px;
}
label {
  background-color: #d0f2cd;
  padding: 8px;
  border-radius: 8px;
  cursor: pointer;
  display: flex;
  align-items: center;
}
label.activo {
  background-color: #8eea93;
  font-weight: bold;
}
input[type="radio"] {
  margin-right: 10px;
}
</style>
