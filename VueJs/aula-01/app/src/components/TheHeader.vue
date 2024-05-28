<template>
  <div class="header">
    <div v-for="ele in todos" v-bind:key="ele.id" class="todoItem">
        <img v-if="ele.vsrc " v-bind:src="ele.vsrc" >
      {{ ele.title }}
    </div>
  </div>
  
</template>
<script>
export default {
  data() {
    return {
      todos: [
        {
          userId: 1,
          id: 1,
          title: "delectus aut autem",
          completed: false,
          vsrc:"https://preview.redd.it/is-it-me-or-does-tai-lungs-head-looks-more-angular-than-in-v0-7qwjxd6q6asc1.png?width=558&format=png&auto=webp&s=c328e70b9b0d19fb54247ec95907cc841f568fc3"
        },
        {
          userId: 1,
          id: 2,
          title: "quis ut nam facilis et officia qui",
          completed: false,
        },
        {
          userId: 1,
          id: 3,
          title: "fugiat veniam minus",
          completed: false,
        },
        {
          userId: 1,
          id: 4,
          title: "et porro tempora",
          completed: true,
        },
        {
          userId: 1,
          id: 5,
          title:
            "laboriosam mollitia et enim quasi adipisci quia provident illum",
          completed: false,
        },
      ],
    };
  },
};
</script>
<style>
.todoItem {
  background-color: aquamarine;
  margin: 0.2rem;
  padding: 1rem;
}
.header {
  font-family: Arial, Helvetica, sans-serif;
  font-weight: bolder;
}
</style>