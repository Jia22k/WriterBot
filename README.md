# Custom Hash Table for WriterBot

Welcome to the repository for the third project in my data structures class, where I implemented a custom hash table to support the functionality of a `WriterBot`. The `CustomHashTable`, `CustomLinklist`, and `CustomNode` classes were designed to manage and retrieve character sequences efficiently.

## Overview

The `WriterBot` program reads an input text file, processes it using a hash table to track character sequences, and then generates new text output based on the probabilities of character sequences occurring in the input. The hash table is custom-designed to handle collisions and store character sequences as keys with their subsequent characters as values.

## Features

- **Custom Hash Function**: A unique hash function that processes character sequences into keys.
- **Collision Handling**: The hash table uses linked lists to manage collisions.
- **Character Sequence Processing**: Efficient tracking and retrieval of character sequences.
- **Text Generation**: The `WriterBot` generates text based on input probabilities, which can be used for predictive text input or other applications.

## Getting Started

### Prerequisites

- Java Runtime Environment (JRE) and Java Development Kit (JDK) installed.

### Installation

1. Clone the repository to your local machine:
   ```sh
   git clone https://github.com/your-username/custom-hash-table.git
