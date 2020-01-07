## Voice Controlled Connect Four
Note: The [CMU Sphinx JARs](https://cmusphinx.github.io/) need to be installed on your device.

### The Code
My program is a voice controlled, fully functional game of connect 4.

The classes in it are:
1. Piece: This class signifies each piece on the board, it will be a White or a Black depending on the player that actually instantiates the piece.
2. Player: The player class allows me to determine the color of a piece to be placed, as well as personalise it to the user, since they will be able to set their own name in the game. It also helps me determine the winner and print out his/her name.
3. Game: The game class is actually the meat of my code which allows it to run and function. This is the class that ties together all the other classes in order to make it a functional game
4. GameDriver: The method that is to be run

Detailed documentation and explanation of methods can be found [here](https://docs.google.com/document/d/1E5zmExT1kvxoKOUeEr8uV8FAQ38ux9eAE9e6a3annf8/edit?usp=sharing).

### Results
The board is printed at the start, and the machine then allows player 1 to speak. 
![Board](https://user-images.githubusercontent.com/35256233/71883083-9d194a80-3170-11ea-81c3-8784113d52db.png)

After player one has spoken:
![Player one](https://user-images.githubusercontent.com/35256233/71883164-c5a14480-3170-11ea-911a-abe3a2c34fde.png)

The program then allows player 2's turn:
![Player 2](https://user-images.githubusercontent.com/35256233/71883244-fc775a80-3170-11ea-808e-26d1c2d726f4.png)

The pieces stack up if in the same column:
![Stack up](https://user-images.githubusercontent.com/35256233/71883275-1022c100-3171-11ea-90cb-33ae329b0033.png)

The game ends if there are 4 in a row!
![Endgame](https://user-images.githubusercontent.com/35256233/71883306-229cfa80-3171-11ea-9bd3-1110aa21a33c.png)
