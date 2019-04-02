# pounds-or-kilos

# Weightlifting 1-Rep Max Calculator
> Accurately calculate and predict your weights in the gym

I was inspired by the 1-rep max calculators you can find online such as the ExRx.net calculator (https://exrx.net/Calculators/OneRepMax),
which I have attempted to emulate here. I wanted to do this project to learn Swing and create it as a gui application.

Though challenging at first, I enjoyed working with Swing as I learned my way around the interface
and the application eventually came together to where it is today.

## Installing / Getting started

To install and run the program, clone the repository and import the project into your IDE of choice. 
Open the Application class in the swing_beginner package, and run it.



You'll be given an option to input numbers into the Weight Lifted text box, and to choose a number of repetitions performed.
Once these numbers are input correctly, clicking calculate will provide the user with percentages of their number entered, as 
well as a predicted 1-rep max. 


## Features
To begin, enter a weight that was lifted, and select from the Reps Performed dropdown a number of reps. Then click Calculate.

The calculate button will take the input from the Weight lifted text field and the reps performed dropdown to accurately 
calculate a lifter's 1RM (one-rep max) and output it, as well as percentages of this lift (e.g. 50% of predicted 1RM) to give an idea of the numbers required to work up to the predicted number at the bottom.

To clear entries, the user can click the clear button or simply type in another number to calculate.

If input is not correctly entered (or, for example non-digit input such as "a" or "*#?%^") the user will be prompted to input a number for the calculator to work.

Currently this calculator only supports weight in pounds (lbs), but I would like to add kilogram functionality in future versions.

## Configuration and Examples

Example:
Weight Lifted (lbs): 100
Reps Performed: 1
```
output 1RM: 100 lbs, as well as percentages of this 1RM from 50 up to 95%.

This is a standard example, now if we change the number of reps performed, we can get more interesting predictions.

Example 2:
Weight Lifted (lbs): 100
Reps Performed: 8
```
output 1RM: 124 lbs, with percentages listing predictions at 50%, 55%, 60, 65 and so on.

## Contributing

If you'd like to contribute, please fork the repository and use a feature
branch. Pull requests are warmly welcome.

## Links

Here are some links that have helped me in creating this project, as well as links to other calculators, and research used in creating the equations used within the application.

- Repository: https://github.com/circletakesthesquare/pounds-or-kilos

- Source: https://exrx.net/Calculators/OneRepMax
- Source: https://en.wikipedia.org/wiki/One-repetition_maximum -> Brzycki's formula

- Other projects:
  - Diceware passphrase generator: https://github.com/circletakesthesquare/correct-horse
  - more to come!


## Licensing

The code in this project is licensed under MIT license.
