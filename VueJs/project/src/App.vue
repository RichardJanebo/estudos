<template>
  <TheHeader v-if="showHeader"></TheHeader>
  <div>
     <p v-show="showPara">Nome : {{ name }}</p> 
     <p >Sobrenome: {{ sobrenome }}</p> 
  </div> 
  <div v-if="assesLevel == 1" >Admin</div>
  <div v-else-if="assesLevel == 2" >Marketing</div>
  <div v-else-if="assesLevel == 3" >user </div>
  <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="Welcome to Your Vue.js App"/>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import TheHeader from  './components/TheHeader.vue'

export default {
  name: 'App',
  components: {
    HelloWorld,
    TheHeader
  },
  data(){
  return{
    showHeader: true,
    showPara:true,
    name:"Richard",
    sobrenome:"Janebo",
    assesLevel:3,
  }
}
}

</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
