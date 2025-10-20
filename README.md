# Mars Rover Kata

## Credits and references

Victor Farcic

## Incremental Kata - no peeping ahead!

This is an incremental kata to simulate a real business situation: work your way through the steps in order, but do not read the next requirement before you have finished your current one.

## Your Task

You’re part of the team that explores Mars by sending remotely controlled vehicles to the surface of the planet. Develop an API that translates the commands sent from earth to instructions that are understood by the rover.

## Requirements

1. You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing.
1. The rover receives a character array of commands.
1. Implement commands that move the rover forward/backward (f,b).
1. Implement commands that turn the rover left/right (l,r).
1. Implement wrapping at edges. But be careful, planets are spheres.
1. Implement obstacle detection before each move to a new square. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point, aborts the sequence and reports the obstacle.
1. Rules
1. Hardcore TDD. No Excuses!
1. Change roles (driver, navigator) after each TDD cycle.
1. No red phases while refactoring.
1. Be careful about edge cases and exceptions. We can not afford to lose a mars rover, just because the developers overlooked a null pointer.
