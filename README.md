# NumberGuesserJava

main
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

String menu
  no parameters
  print out menu
    0) quit
    1) human guesser
    2) computer guesser
  ask for input
  return inout as string

void humanGuesser
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
