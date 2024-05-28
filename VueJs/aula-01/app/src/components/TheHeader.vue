<template>
    <div class="header">
        <div v-for="ele in todos" 
        v-bind:key="ele.id" class="todoItem"> {{ ele.title }}</div>
    </div>
</template>
<script>
    export default{
        data(){
            return{
                todos :[
                        {
                            "userId": 1,
                            "id": 1,
                            "title": "delectus aut autem",
                            "completed": false
                        },
                        {
                            "userId": 1,
                            "id": 2,
                            "title": "quis ut nam facilis et officia qui",
                            "completed": false
                        },
                        {
                            "userId": 1,
                            "id": 3,
                            "title": "fugiat veniam minus",
                            "completed": false
                        },
                        {
                            "userId": 1,
                            "id": 4,
                            "title": "et porro tempora",
                            "completed": true
                        },
                        {
                            "userId": 1,
                            "id": 5,
                            "title": "laboriosam mollitia et enim quasi adipisci quia provident illum",
                            "completed": false
                        },
                    ]


            }
        }
    }



</script>
<style>
    .todoItem{
        background-color:aquamarine ;
        margin: 0.2rem;
        padding: 1rem;

    }
    .header{
        font-family: Arial, Helvetica, sans-serif;
        font-weight: bolder;
        
    }

</style>