# Welcome to Chess

If you are reading this, you succesfully started this portion of the homework. I am proud of you, little man.

This project is designed to scale with you as a programmer, and will continue to expand in scope in chunks as you gain different skillsets. You have hit the first stage: basic software design.

## Chess Game Model
We want to be able to play chess with your code. What does this mean? Here is a basic outline of the requirements.

1. [ ] We can input moves into the game following a player color indicator, our origin piece, and its destination. We'll read this input from a file at first. Each move will be a line. For example:
```
W 1e 2e
B 6e 5e
```
1. [ ] We can properly create exceptions in the case that we get an incorrect input. For example, an illegal move.
2. [ ] We can detect when the game ends in a checkmate or a draw.

For now, let us ignore a couple of features we will consider adding later:
- Castling
- En passant 