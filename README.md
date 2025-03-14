# NumberGuesserJava

main
```
  keepGoing boolean 
  set response to empty string
  while keepGoing
    call menu() & put result in string
    if response is 0 
      keepGoing = false
    if response is 1
      call humanGuesser()
    if response is 2
      call computerGuesser()
```

String menu
```
  no parameters
  print out menu
    0) quit
    1) human guesser
    2) computer guesser
  ask for input
  return inout as string
```

void humanGuesser
```
  int num = random int
  int tries = 0
  int guess = 0
  keepGoing boolean
  while keepGoing
    ask for input for guess
    if guess == num
      print "You got it in {guess} tries!"
      if guess < 7
        print "You win"
      else if guess == 7
        Print "You tied"
      else
        Print "You lose"
      keepGoing = false
    if guess > num
      print "Too high"
    if guess < num
      print "Too low"
```

void computerGuesser
```
  int low = 1
  int high = 100
  int guess = 50
  int tries = 0
  keepGoing boolean
  print "Think of a number between 1 and 100"
  while keepGoing
    increment tries
    print "I guess {guess}"
    ask for input (H for too high, L for too low, C for correct)
    if input is C
      print "Got it in {tries} tries!"
      keepGoing = false
    if input is H
      high = guess - 1
      guess = getMean
    if input is L
      low = guess + 1
      guess = getMean
```
```
int getMean
  utility function
  parameters: int low, int high  
  return (low + high) / 2  
```
