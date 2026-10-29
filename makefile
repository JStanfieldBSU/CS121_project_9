compile: Guesser.java
	javac Guesser.java

clean:
	rm Guesser

run: program
	java Guesser

debug: program
	jdb -g Guesser
