# Book Sorter for North Seattle College Library

## Description
This project enhances the North Seattle College Library's digital catalog system by implementing custom sorting features for books. The sorting options include sorting by title, author, and publication year, as well as chained sorting by author and title.

## Features
1. **Default Sorting by Title**: Books are sorted alphabetically by title.
2. **Sorting by Author**: Books are sorted by the author's name in alphabetical order.
3. **Sorting by Publication Year**: Books are sorted by year of publication, with newer books first.
4. **Chained Sorting**: First, books are sorted by author, and then by title if the authors are the same.

## Classes
- **Book**: Contains book attributes such as title, author, and year. Implements `Comparable` for default sorting by title.
- **BookSorter**: Contains methods to sort books by author, year, and a chained comparator for sorting by author and then by title.

## How to Run
1. Clone the repository.
2. Navigate to the `src` directory.
3. Compile the Java files using:
   ```bash
   javac Book.java BookSorter.java
