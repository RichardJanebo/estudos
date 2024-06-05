<template>
  <TheHeader v-show="showHeader"></TheHeader>

  <div v-show="showFirstName">
    nome: {{ firstName }}
  </div>
  <div>
    
    sobrenome : {{ lastName }}
  </div>
  <div v-if="levelAcess == 'admin' ">Admin</div>
  <div v-else-if="levelAcess == 'user'">User</div>
  <div v-else>Visitante</div>
  <TheFooter/>






</template>

<script>
import TheFooter from './components/TheFooter.vue';
import TheHeader from './components/TheHeader.vue';


const obj = ()=>{
  let n = "admin"
  let u = "visitante"
  let j = "user"

  let mat = 0

  mat=Math.floor(Math.random() * 10)
  console.log(mat)

  if (mat < 3){
    return n
  }else if(mat > 3 && mat <8){
    return u
  }else{
    return j
  }
}



export default {
  name: 'App',
  components: {
    TheHeader,
    TheFooter
  },
  data(){
    return{
      showHeader:true,
      firstName:"Richard",
      lastName:"Gabriel",  
      showFirstName:true,
      levelAcess:obj(),
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
