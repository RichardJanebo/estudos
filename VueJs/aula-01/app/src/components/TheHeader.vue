<template>
  <div class="header">
    <div v-for="ele in todos" v-bind:key="ele.id" class="todoItem">
      <img v-if="ele.vsrc" :src="ele.vsrc" />
      {{ ele.title }}
    </div>
  </div>
  <p v-for="ele in todos" :key="ele.id" :class="{'ficouBlue':ishome}">
    {{ ele.title }}
  </p>
  <h1 :class="{ vermelho: true, isHomePage: ishome }">ola Bom dia</h1>
  <p :class="['ficouvermelho', { ficouBlue: ishome }]">
    Lorem ipsum dolor, sit amet consectetur adipisicing elit. Natus, sint?
    Accusantium autem inventore a omnis voluptatum dolores, quasi magni tempora
    dolorum est earum sint tempore libero quia praesentium? Esse, sint.
  </p>
  <p :style="{ color: 'aqua' }">
    Lorem ipsum dolor sit amet consectetur adipisicing elit. Harum neque quam
    animi iste ratione nostrum sunt in ex laborum, quo soluta atque voluptate
    architecto? Quo dolore tempora sint inventore sunt.
  </p>
</template>
<script>
export default {
  data() {
    return {
      text: "ficouBlue",
      ishome: true,
      vermelho: "ficouvermelho",
      todos: [
        {
          userId: 1,
          id: 1,
          title: "delectus aut autem",
          completed: false,
          vsrc: "https://preview.redd.it/is-it-me-or-does-tai-lungs-head-looks-more-angular-than-in-v0-7qwjxd6q6asc1.png?width=558&format=png&auto=webp&s=c328e70b9b0d19fb54247ec95907cc841f568fc3",
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
.ficouBlue {
  color: blue;
}
.isHomePage {
  color: blueviolet;
  font-size: larger;
}
.ficouvermelho {
  color: red;
}
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