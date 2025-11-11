package Practice;

public class WordsFormedByCharacters {

    // ही पद्धत वापरून त्या शब्दांचा एकूण length काढतो जे availableChars पासून बनवता येतात
    public int countCharacters(String[] wordsList, String availableChars) {
        // Step 1: availableChars मध्ये प्रत्येक character किती वेळा आहे ते मोजा
        // 26 आकाराची array तयार करा ('a' ते 'z' साठी)
        int[] availableCharCounts = new int[26];
        for (char ch : availableChars.toCharArray()) {
            // 'a' ला index 0, 'b' ला 1, ..., 'z' ला 25 म्हणून map करतो
            // या character ची count वाढवा
            availableCharCounts[ch - 'a']++;
        }

        int totalGoodWordsLength = 0; // "good" words चा एकूण length ठेवण्यासाठी

        // Step 2: wordsList मधील प्रत्येक शब्द तपासा
        for (String word : wordsList) {
            // जर हा शब्द available characters वापरून बनू शकतो
            if (canFormWord(word, availableCharCounts)) {
                // त्याचा length total मध्ये जोडा
                totalGoodWordsLength += word.length();
            }
        }

        // Step 3: एकूण length return करा
        return totalGoodWordsLength;
    }

    // ही helper पद्धत तपासते की दिलेला word बनवता येईल का
    private boolean canFormWord(String word, int[] availableCharCounts) {
        // current word मधील प्रत्येक character किती वेळा आहे ते मोजा
        int[] wordCharCounts = new int[26];

        for (char ch : word.toCharArray()) {
            // या character ची count वाढवा
            wordCharCounts[ch - 'a']++;

            // जर हा शब्द त्या character ची available count पेक्षा जास्त वापरतो
            if (wordCharCounts[ch - 'a'] > availableCharCounts[ch - 'a']) {
                return false; // word बनवता येत नाही
            }
        }

        return true; // सर्व characters योग्य आहेत, word बनवता येतो
    }

    // Main method टेस्टिंगसाठी
    public static void main(String[] args) {
        WordsFormedByCharacters solution = new WordsFormedByCharacters();

        String[] wordsList1 = {"cat", "bt", "hat", "tree"};
        String availableChars1 = "atach";
        System.out.println(solution.countCharacters(wordsList1, availableChars1)); // Output: 6

        String[] wordsList2 = {"hello", "world", "leetcode"};
        String availableChars2 = "welldonehoneyr";
        System.out.println(solution.countCharacters(wordsList2, availableChars2)); // Output: 10
    }
}
