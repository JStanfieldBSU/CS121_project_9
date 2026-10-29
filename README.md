# Java Guesser
### CS121 Stanfield

## Main
```
string errorMessage = "Invalid Input.\n Please try again. \n"
print "welcome to the guesser"
call menu
print "thank you for playing"
```

## Menu
```
new scanner for user's input
bool keepGoing = true;
string menuText = "0) Exit\n1) Human Guesser\n2) Computer Guesser\n\nPlease enter 0-2: "

while keepGoing
  print menuText
  accept input
  if input == 0
    set keepGoing to false
  else if input == 1
    call humanGuesser
  else if input == 2
    call computerGuesser
  else
    print errorMessage
```

## Human Guesser
```
new scanner for user's input
create a random number using math.random and cast it to an int
int correctAnswer = (int)((Math.random() * 100) + 1)
int i = 1;
keepGoing = true

while keepGoing
  print i + ") Please enter a number: "
  accept input
  if input < correctAnswer
    print too low...
    i++
  else if input > correctAnswer
    print too high...
    i++
  else if input == correctAnswer
    print got it!
    keepGoing = false;
```

## Computer Guesser
```
new scanner for user's input
string answerPrompt = "Too (H)igh, too (L)ow, or (C)orrect? "
higherBound = 100;
lowerBound = 0;
currentGuess = 50;
i = 1;
keepGoing = true

while keepGoing
  set currentGuess to the remainder of the sum of higher and lower bounds.
  print i + ") I guess " + currentGuess
  print answerPrompt
  accept user input
  convert input to upper
  get first character of input
  if input == H
    higherbound = currentguess
    i++
  else if input == L
    lowerbound = currentguess
    i++
  else if input == C
    keepGoing = false
  else
    print errorMessage
```
