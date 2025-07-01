public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String[] words = {"car", "home", "juice", "car", "tea", "juice"};
        int n = words.length;

       
        String[] unique = new String[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (words[i].equals(unique[j])) {
                    isDuplicate = true;
                    break;
                }
            }

           
            if (!isDuplicate) {
                unique[uniqueCount] = words[i];
                uniqueCount++;
            }
        }

        System.out.print("Unique words: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
