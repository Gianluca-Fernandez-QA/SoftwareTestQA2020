select title, release_date 

	from movies  

	where release_date between '1983-01-01' AND '1993-12-31' 

	Order by release_date DESC;

	SELECT movies.title, ratings.rating 

FROM ratings 

	INNER JOIN movies ON movies.id=ratings.id 

	ORDER BY rating ASC LIMIT 10;

	JOIN genres_movies ON movies.id=genres_movies.movie_id 

	JOIN ratings ON movies.id=ratings.movie_id 

	JOIN users ON ratings.user_id=users.id 

	JOIN occupations ON users.occupation_id=occupations.id 

	WHERE ratings.rating=5 AND occupations.name=’Student’ AND users.gender=’M’ AND users.age=24;

SELECT movies.title, ratings.rating 

	FROM ratings 

	INNER JOIN movies ON movies.id=ratings.id 

	ORDER BY rating ASC LIMIT 10;

SELECT title FROM movies 
	WHERE release_date = (SELECT release_date FROM movies GROUP BY release_date 
	ORDER BY COUNT(*) DESC LIMIT 1); 

SELECT DISTINCT genres.name, COUNT(genres.id) AS genre_total 
	FROM genres_movies 
	LEFT JOIN movies ON movie_id = movies.id 
	LEFT JOIN genres ON genre_id = genres.id 
	GROUP BY genres.id 
	ORDER BY genre_total ASC; 

