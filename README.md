# MovieRecommendationSystem
Recommendation System Exercise

Over the course of the next weeks we will be developing a single user movie recommendation system. You will work in groups throughout the project.

The following are the mandatory functional requirements to the system:

It must have a graphical user interface
As a user you must be able to add new movies to the system
You should be able to do all C.R.U.D. operations on movies
As a user you must be able to rate all movies on a scale from 1-5 based on how much you like the movie (-5 (bad), -3, 1 (neutral), 3, 5 (good))
On the UI you can optionally display this 5 point scale differently: Ex: ★★★☆☆
As a user you must be able to receive recommendation for movies to watch based on:
… all users top rated movies you haven't seen (rated) yet
… your personal rating history
As a user you may be able to search for movies based on their title

Besides the requirements above the following are nice to have features. 

The application should automatically search movies when you enter a key in the search field
The application should automatically recommend movies whenever you have rated a new one
Movies must always be displayed the same way and with an image of the cover.
Movies should also contain categories
As a user you should be able to do all the mandatory operations limiting the results to certain categories (Search / recommendation)

The following are the non-functional requirements:

The application should have a layered architecture
The code must not be smelly...
It must store data between executions
Operations should be relatively fast when performing operations

Building a recommendation system is no trivial task. In 2010 the streaming giant Netflix issued a competition to see who could create the most efficient recommendation system. To that end they also released a dataset containing millions of actual user recommendations. We will be using data from that dataset to create our own recommendation system. The dataset contains several files:

	movie_titles.txt
	ratings.txt
	users.txt

The files are both structured with one data item per row. Thus the first line of the movie titles dataset is:

	1,2003,Dinosaur Planet

This means that there is a movie with the ID of 1, released in 2003 and the title is “Dinosaur Panet”. The following is the first line of the TrainingRatings.txt:

	8,1744889,-5

This means that the movie with the ID 8, was rated by the user with the ID 1744889, and the rated value was -5. 

Users are stored with an ID and a name. 

Over the course of the weeks we will extend the system so that we at the end of the semester have met all the mandatory requirements. 
