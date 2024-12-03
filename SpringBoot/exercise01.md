# Exercise 01 - GET

Create a controller and a methood that returns a list of anime names through the following URL: https://localhost:8080/v1/animes

# Exercise 02 - @RequestParan @ PathVariable

Create a classe called Anime, into the an pacage called domain, with the atributes:long id, String name. Criate a metod into the Anime that return an list "hardcoded" of Animes; Update the AnimeController for return an list of Anime and then criate outhers two maetods, one for filter by name, using @RequesParan and outher to return an Anime by id, using @PathVariable

# Exercise 03 - Post

Update the AnimeController by editing a method that receives a Json anime via post, adds it to the existing list of animes and returns the created object. Restriction: If the ID is passed in the request, it must be ignored. It generates a random air before adding the object to the list.