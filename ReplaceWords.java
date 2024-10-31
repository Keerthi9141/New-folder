public class ReplaceWords {
    public static void main(String[] args) {
        String sentence = "Hello world, this is a test sentence.";
        String replacement = "REPLACED"; // The word to replace each word with

        // Split the sentence into words
        String[] words = sentence.split("\\s+"); // Splits by whitespace

        // Replace each word
        for (int i = 0; i < words.length; i++) {
            // If you want to keep punctuation, handle it here
            // Example: Replace the word, but keep punctuation like commas and periods
            if (words[i].matches("\\w+\\p{Punct}")) {
                words[i] = replacement + words[i].substring(words[i].length() - 1);
            } else {
                words[i] = replacement;
            }
        }

        // Join the words back into a sentence
        String modifiedSentence = String.join(" ", words);

        // Output the result
        System.out.println("Original sentence: " + sentence);
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}
