-- Mostar registros de peliculas
SELECT * FROM movie;
-- Mostrar datos actores
SELECT first_name, last_name, rating FROM actors;
-- Mostrar titulo de todas las series
SELECT title FROM series;
-- Nombre de los actores con rating mayor a 7.5
SELECT first_name, last_name FROM actors WHERE rating > 7.5;
-- Titulo de las peliculas, el rating y los premios con un rating mayor a 7.5 y con mas de 2 premios
SELECT title, rating, awards FROM movie WHERE rating > 7.5 AND awards > 2;
-- Mostrar el titulo de las peliculas y el rating ordenadas por rating ascendente
SELECT title, rating FROM movie ORDER BY rating ASC;
-- Mostrar el titulo y rating de todas las peliculas cuyo titulo incluya Toy Story
SELECT title, rating FROM movie WHERE title LIKE '%Toy Story%';
-- Mostrar todos los actores cuyos nombres empiecen con Sam
SELECT first_name, last_name FROM actors WHERE first_name LIKE 'Sam%';
-- Mostrar el titulo de las peliculas que salieron entre e; '2004-01-01' y '2008-12-31'
SELECT title FROM movie WHERE release_date BETWEEN '2004-01-01' AND '2008-12-31';