<template>
  <div class="instrument-list">
    <h2>Markt-Instrumente</h2>
    <table>
      <thead>
        <tr>
          <th>Symbol</th>
          <th>Name</th>
          <th>Typ</th>
          <th>Preis</th>
          <th>Quelle</th>
        </tr>
      </thead>
      <tbody>

        <tr v-for="instrument in instruments" :key="instrument.id">
          <td>{{ instrument.symbol }}</td>
          <td>{{ instrument.name }}</td>
          <td>{{ instrument.type }}</td>
          <td>{{ instrument.price }}</td>
          <td>{{ instrument.source }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const instruments = ref([
  { id: 1, symbol: 'AAPL', name: 'Apple Inc.', type: 'Aktie', price: 180.5, source: 'Mock' },
  { id: 2, symbol: 'VWCE', name: 'Vanguard All-World ETF', type: 'ETF', price: 115.2, source: 'Mock' },
  { id: 3, symbol: 'BTC', name: 'Bitcoin', type: 'Krypto', price: 65000.0, source: 'Mock' },
  { id: 4, symbol: 'EUR/USD', name: 'Euro / US Dollar', type: 'Paar', price: 1.08, source: 'Mock' }
])
</script>

<style scoped>
table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 1rem;
}
th, td {
  border: 1px solid #ddd;
  padding: 8px;
  text-align: left;
}
th {
  background-color: #f4f4f4;
}
</style>