<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <TheHeader v-show="showHeader"></TheHeader>
  <HelloWorld msg="Welcome to Your Vue.js App"/>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import TheHeader from './components/TheHeader.vue';

const obj = ()=>{
  return true
}


export default {
  name: 'App',
  components: {
    HelloWorld,
    TheHeader
  },
  data(){
    return{
      showHeader:obj()
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
