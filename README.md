# Eurosong Prognomaker
This program will make a ranking of the prognostics made by you and your friends. 

## How to run
Create a folder with .txt files in which the first line contains the number of the country you think will be first, the second line the number of the country you think will be second,... You can decide if you want a top 3, top 5 or top 10 or anything else. The only restriction is that everyone has the same number of guesses.

After you have created those, you can already run the jar file as following: 

    java -jar Eurosong.jar "path\to\directory\with\prognostics"
    
with the path with no trailing "\".

The program will pause so you can fill in the results.txt file in the same directory as the prognostics with the results of Eurosong, with line 1 being the winners number (So for Belgium it should be 1). Then press enter in the application and then the program will calculate the ranking.