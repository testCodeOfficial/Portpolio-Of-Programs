import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MonkeyMonkey {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    // FUNCTION FOR DECK OF CARD
    public static String[] deckFunction() {
        String[] titleOfCard = {"Club", "Heart", "Diamond", "Spade"};
        String[] lowerToHigher = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] deck = new String[13*4];
        int index = 0;
        for (String lth : lowerToHigher) {
            for (String toc : titleOfCard) {
                deck[index++] = lth + " of " + toc;
            }
        }
        return deck;
    }

    // DISPLAY THE DECK WITHOUT SHUFFLE
    public static void printTheDeck(String[] deck) {
        for (String card : deck) {
            System.out.println(card);
        }
    }

    // DISPLAY THE DECK WITH SHUFFLE
    public static void displayShuffleDeck(String[] deck) {
        for (String card : deck) {
            System.out.println(card);
        }
    }

    // DEFINE FOR HEAD OR TAILS
    public static boolean headOrTails() {
        return random.nextBoolean();
    }

    // RANDOMIZE PICKED CARD / HIDE CARD IN DECK
    public static String randomizedOneCard(String[] deck) {
        int index = random.nextInt(deck.length);
        String pickedCard = deck[index];
        deck[index] = null;
        return pickedCard;
    }

    // DISPLAY PAIRED CARDS
    public static void displayAndEliminatedCard(String[] cards) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != null) {
                String card = cards[i];
                card = card.replaceAll(" of ", " ");
                System.out.println("{" + (i + 1) + "} " + card);
            }
        }
    }


    // ELIMINATE THE PAIRED CARDS
    public static void eliminatePairCards(String[] cards) {
        for (int i = 0; i < cards.length - 1; i++) {
            if (cards[i] != null) {
                for (int j = i + 1; j < cards.length; j++) {
                    if (cards[j] != null && cards[i].charAt(0) == cards[j].charAt(0)) {
                        cards[i] = null;
                        cards[j] = null;
                        break;
                    }
                }
            }
        }
    }

    // SELECTION CARD TO GIVE
    public static int selectByCount(String[] cards) {
        int remainingCards = countRemainingCards(cards);
        while (true) {
            try {
                System.out.print("Enter the index of the card to take (1-" + remainingCards + "): ");
                int choice = Integer.parseInt(scanner.nextLine()) - 1;
                if (choice >= 0 && choice < cards.length && cards[choice] != null) {
                    return choice;
                } else {
                    System.out.println("Invalid choice. Please select again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    // COUNT REMAINING CARDS
    public static int countRemainingCards(String[] cards) {
        int count = 0;
        for (String card : cards) {
            if (card != null) {
                count++;
            }
        }
        return count;
    }

    // CHECK IF ANY CARD IS FOUND
    public static boolean checkIfFound(String[] cards) {
        for (String card : cards) {
            if (card != null) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean returnToGame = true;
        while (returnToGame) {
            // DISPLAY DECK CARDS
            System.out.println("Before: ");
            String[] deckStraight = deckFunction();
            System.out.println("Display Deck without shuffle: ");
            printTheDeck(deckStraight);
            System.out.println("=================================================================================");

            try {
                System.out.println("Wait...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            

            // SHUFFLE CARDS
            System.out.println("After:");
            String[] deck = deckFunction();
            Collections.shuffle(java.util.Arrays.asList(deck));
            System.out.println("\nShuffled Deck:");
            displayShuffleDeck(deck);
            System.out.println("=================================================================================");

            try {
                System.out.println("Wait...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // DETERMINE WHO PLAYS FIRST
            boolean flippedCoin = headOrTails();

            // DISPLAY RANDOM WHO DEALS FIRST
            if (flippedCoin) {
                System.out.println("\nHeads! You start first.");
            } else {
                System.out.println("\nTails! Computer starts first.");
            }

            // GAME STARTS HERE
            String pickedCard = randomizedOneCard(deck);
            System.out.println("Randomly picked card: " + pickedCard);

            String[] computerCards = copyNonNullElements(java.util.Arrays.copyOfRange(deck, 0, deck.length / 2));
            String[] playerCards = copyNonNullElements(java.util.Arrays.copyOfRange(deck, deck.length / 2, deck.length));

            // DISPLAY THE ELIMINATED CARDS
            System.out.println("\nBefore eliminating pairs:");
            System.out.println("Player Cards:");
            displayShuffleDeck(playerCards);
            System.out.println("Computer Cards:");
            displayShuffleDeck(computerCards);
            System.out.println("=================================================================================");
            eliminatePairCards(computerCards);
            eliminatePairCards(playerCards);

            try {
                System.out.println("Wait...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // DISPLAY AFTER ELIMINATED CARDS AND REMAINING CARDS
            System.out.println("\nAfter eliminating pairs:");
            System.out.println("Player Cards:");
            displayAndEliminatedCard(playerCards);
            System.out.println("Computer Cards:");
            displayAndEliminatedCard(computerCards);
            System.out.println("=================================================================================");

            try {
                System.out.println("Wait...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // DETERMINE WHO STARTS TO DRAW/GIVE A CARD
            

            // FUNCTION FOR SELECTING CARDS
            String selectedCard;
            System.out.println("\nChoose a card what you want to give:");
            if (flippedCoin) {
                System.out.println("\n < Your cards > \n");
                displayAndEliminatedCard(playerCards);
                int selectedCardIndex = selectByCount(playerCards);
                selectedCard = playerCards[selectedCardIndex];
                playerCards[selectedCardIndex] = null;
                for (int i = 0; i < computerCards.length; i++) {
                    if (computerCards[i] == null) {
                        computerCards[i] = selectedCard;
                        break;
                    }
                }
                System.out.println("=================================================================================");
            } else {
                System.out.println("\n < Computer's cards > \n");
                displayAndEliminatedCard(computerCards);
                int selectedCardIndex = selectByCount(computerCards);
                selectedCard = computerCards[selectedCardIndex];
                computerCards[selectedCardIndex] = null;
                for (int i = 0; i < playerCards.length; i++) {
                    if (playerCards[i] == null) {
                        playerCards[i] = selectedCard;
                        break;
                    }
                }
                System.out.println("=================================================================================");
            }
            System.out.println("Selected card: " + selectedCard);

            // FUNCTION WHO STARTS TO PLAY
            if (flippedCoin) {
                System.out.println("\nFlipped Coin\nHuman starts first.");
                playGame(playerCards, computerCards, pickedCard, deck);
                System.out.println("=================================================================================");
            } else {
                System.out.println("\nFlipped Coin\nComputer starts first.");
                playGame(computerCards, playerCards, pickedCard, deck);
                System.out.println("=================================================================================");
            }

            returnToGame = returnToTheGame();
        }
    }

        // GENERATE THE GAME FOR CARD MONKEY MONKEY REMAINING
        public static void playGame(String[] playerCards, String[] computerCards, String pickedCard, String[] deck) {
        while (!isEmpty(playerCards) && !isEmpty(computerCards)) {

        System.out.println("\n < Human Turn > \n");
        System.out.println("Your Cards:");
        displayAndEliminatedCard(playerCards);
        if (!isEmpty(playerCards)) {
            int index = selectByCount(playerCards);
            String cardTaken = playerCards[index];
            playerCards[index] = null;
            displayAndEliminatedCard(playerCards);
            if (cardTaken.equals(pickedCard)) {
                System.out.println(contains(playerCards, pickedCard) ? "Got it, Found pair ★" : "No match found. Try next turn.");
                System.out.println("=================================================================================");
            }
        }

        if (!isEmpty(playerCards)) {
            boolean humanMatched = checkIfFound(playerCards);
            if (humanMatched) {
                System.out.println("================================================================================");
                System.out.println("You found a pair ★");
            }
        }

        System.out.println("\n< Computer's Turn >\n");
        boolean matched = checkIfFound(computerCards);
        if (!isEmpty(computerCards)) {
            if (matched) {
                eliminatePairCards(computerCards);
                System.out.println("Computer found a pair ★");
                System.out.println("=================================================================================");
            } else {
                boolean computerMatched = false;
                for (int i = 0; i < computerCards.length; i++) {
                    if (computerCards[i] != null && computerCards[i].startsWith(pickedCard.substring(0, 1))) {
                        System.out.println("Computer chose: " + computerCards[i]);
                        computerCards[i] = null;
                        computerMatched = true;
                        break;
                    }
                }
                if (!computerMatched) {
                    int randomIndex = random.nextInt(computerCards.length);
                    while (computerCards[randomIndex] == null) {
                        randomIndex = random.nextInt(computerCards.length);
                    }
                    System.out.println("Computer chose: " + computerCards[randomIndex]);
                    computerCards[randomIndex] = null;
                }

                System.out.println("=================================================================================");
            }
        } else {
            System.out.println("Computer has no cards left.");
            break;
        }
    
    }

    // DETERMINE THE WINNER IN GAME
    if (isEmpty(computerCards)) {
        System.out.println("\nYou lose in the pair Game");
    } else {
        System.out.println("\nYou Win the Game");
    }

    // DISPLAY FIRST AND LAST CARD IN BOTH
    System.out.println("\n< Human Cards >");
    if (!isEmpty(playerCards)) {
        System.out.println("First Card: " + extractRank(pickedCard));
        System.out.println("Last Card: " + extractRank(playerCards[playerCards.length - 0]));
    } else {
        System.out.println("No cards remaining.");
    }

    System.out.println("\n< Computer's Cards >");
    if (!isEmpty(computerCards)) {
        System.out.println("First Card: " + extractRank(pickedCard));
        System.out.println("Last Card: " + extractRank(computerCards[computerCards.length - 1]));
    } else {
        System.out.println("No cards remaining.");
    }

}   

    //FUNCTION FOR THE LAST CARD 
    public static String extractRank(String card) {
        if (card != null) {
            int index = card.indexOf(" of ");
            return card.substring(0, index);
        }
        return "the last card is paired to first card";
    }



    // FUNCTION FOR RETURNING THE GAME
    public static boolean returnToTheGame() {
        try {
            System.out.println("Monkey Monkey <(o/\\o)>...\n");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Would you want to try the game again? \n[Y]Yes\n[N]No\nChoice: ");
        String input = scanner.nextLine().toLowerCase().toUpperCase().trim();
        return input.equals("Y");
    }

    // ANOTHER HELPER METHODS FOR FUNCTIONING
    public static boolean isEmpty(String[] array) {
        for (String item : array) {
            if (item != null) {
                return false;
            }
        }
        return true;
    }

    //CHECK IF IT IN CARDS
    public static boolean contains(String[] array, String card) {
        for (String item : array) {
            if (card.equals(item)) {
                return true;
            }
        }
        return false;
    }

    // FOR AVOIDING GETTING NULL VALUE
    public static String[] copyNonNullElements(String[] array) {
        int count = 0;
        for (String item : array) {
            if (item != null) {
                count++;
            }
        }
        String[] result = new String[count];
        int index = 0;
        for (String item : array) {
            if (item != null) {
                result[index++] = item;
            }
        }
        return result;
    }
}

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// import java.util.Random;
// import java.util.Scanner;

// public class MonkeyMonkey {

//     static Random random = new Random();
//     static Scanner scanner = new Scanner(System.in);

//     // FUNCTION FOR DECK OF CARD
//     public static List<String> initializeDeck() {
//         List<String> deck = new ArrayList<>();
//         String[] suits = {"Clubs", "Hearts", "Diamonds", "Spades"};
//         String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

//         for (String suit : suits) {
//             for (String value : values) {
//                 deck.add(value + " of " + suit);
//             }
//         }
//         return deck;
//     }

//     // DISPLAY THE DECK WITHOUT SHUFFLE
//     public static void showDeck(List<String> deck) {
//         for (String card : deck) {
//             System.out.println(card);
//         }
//     }

//     // DISPLAY THE DECK WITH SHUFFLE
//     public static void shuffleAndShowDeck(List<String> deck) {
//         Collections.shuffle(deck);
//         showDeck(deck);
//     }

//     // TOSS A COIN
//     public static boolean tossCoin() {
//         return random.nextBoolean();
//     }

//     // RANDOMLY PICK A CARD
//     public static String pickRandomCard(List<String> deck) {
//         int index = random.nextInt(deck.size());
//         return deck.remove(index);
//     }

//     // DISPLAY CARDS AND REMOVE PAIRS
//     public static void displayAndRemovePairs(List<String> cards) {
//         List<String> uniqueCards = new ArrayList<>(cards);
//         for (String card : uniqueCards) {
//             if (Collections.frequency(cards, card) > 1) {
//                 System.out.println("Pair Found: " + card);
//                 cards.removeAll(Collections.singleton(card));
//             }
//         }
//     }

//     // SELECT A CARD TO PLAY
//     public static String selectCardToPlay(List<String> cards) {
//         System.out.println("Select a card to play:");
//         for (int i = 0; i < cards.size(); i++) {
//             System.out.println((i + 1) + ". " + cards.get(i));
//         }
//         int choice = scanner.nextInt();
//         scanner.nextLine(); // Consume newline character
//         return cards.remove(choice - 1);
//     }

//     // CHECK IF THE GAME IS OVER
//     public static boolean isGameOver(List<String> playerCards, List<String> computerCards) {
//         return playerCards.isEmpty() || computerCards.isEmpty();
//     }

//     // DISPLAY FIRST AND LAST CARDS
//     public static void displayFirstAndLast(List<String> cards) {
//         if (!cards.isEmpty()) {
//             System.out.println("First Card: " + cards.get(0));
//             System.out.println("Last Card: " + cards.get(cards.size() - 1));
//         } else {
//             System.out.println("No cards remaining.");
//         }
//     }

//     public static void main(String[] args) {
//         boolean playAgain = true;

//         while (playAgain) {
//             // Initialize and shuffle the deck
//             List<String> deck = initializeDeck();
//             System.out.println("Deck before shuffling:");
//             showDeck(deck);
//             System.out.println("Deck after shuffling:");
//             shuffleAndShowDeck(deck);

//             // Determine who starts first
//             boolean playerStarts = tossCoin();
//             if (playerStarts) {
//                 System.out.println("\nYou start first.");
//             } else {
//                 System.out.println("\nComputer starts first.");
//             }

//             // Game loop
//             List<String> playerCards = new ArrayList<>(deck.subList(0, deck.size() / 2));
//             List<String> computerCards = new ArrayList<>(deck.subList(deck.size() / 2, deck.size()));

//             String pickedCard = pickRandomCard(deck);
//             System.out.println("Randomly picked card: " + pickedCard);

//             System.out.println("\nPlayer Cards:");
//             displayAndRemovePairs(playerCards);
//             System.out.println("\nComputer Cards:");
//             displayAndRemovePairs(computerCards);

//             while (!isGameOver(playerCards, computerCards)) {
//                 if (playerStarts) {
//                     String selectedCard = selectCardToPlay(playerCards);
//                     System.out.println("You played: " + selectedCard);
//                     if (selectedCard.equals(pickedCard)) {
//                         System.out.println("You found a pair!");
//                     }
//                 } else {
//                     String selectedCard = computerCards.remove(random.nextInt(computerCards.size()));
//                     System.out.println("Computer played: " + selectedCard);
//                     if (selectedCard.equals(pickedCard)) {
//                         System.out.println("Computer found a pair!");
//                     }
//                 }
//                 playerStarts = !playerStarts;
//             }

//             // Determine the winner
//             if (playerCards.isEmpty()) {
//                 System.out.println("\nCongratulations! You win!");
//             } else {
//                 System.out.println("\nSorry, you lose. Better luck next time!");
//             }

//             // Display first and last cards
//             System.out.println("\nPlayer's cards:");
//             displayFirstAndLast(playerCards);
//             System.out.println("\nComputer's cards:");
//             displayFirstAndLast(computerCards);

//             // Ask if the user wants to play again
//             System.out.println("\nDo you want to play again? (yes/no)");
//             String response = scanner.nextLine();
//             playAgain = response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");
//         }

//         scanner.close();
//     }
// }
