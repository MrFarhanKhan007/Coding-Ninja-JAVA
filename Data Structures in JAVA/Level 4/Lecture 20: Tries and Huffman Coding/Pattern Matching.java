/*Given a list of n words and a pattern p that we want to search. Check if the pattern p is present the given words or not. Return true if the pattern is present and false otherwise.
Input Format :
The first line of input contains an integer, that denotes the value of n.
The following line contains n space separated words.
The following line contains a string, that denotes the value of the pattern p.
Output Format :
The first and only line of output contains true if the pattern is present and false otherwise.
Constraints:
Time Limit: 1 sec
Sample Input 1 :
4
abc def ghi cba
de
Sample Output 2 :
true
Sample Input 2 :
4
abc def ghi hg
hi
Sample Output 2 :
true
Sample Input 3 :
4
abc def ghi hg
hif
Sample Output 3 :
false*/
import java.util.ArrayList;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word){
        if(word.length() == 0){
            root.isTerminating = true;
            return;
        }		
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word){
        add(root, word);
    }

	
// public boolean patternMatching(ArrayList<String> input, String pattern) {
//     for (int i = 0; i < input.size(); i++) {
//         String word = input.get(i); 
//         for (int j = 0; j < word.length(); j++) {
//             add(word.substring(j)); 
//         }
//     }
//     return search(pattern); 
//    }
    public boolean patternMatching(ArrayList<String> input, String pattern) {
         for (int i = 0; i < input.size(); i++) {
        String word = input.get(i); 
        for (int j = 0; j < word.length(); j++) {
            add(word.substring(j)); }}
        // for(int i=0;i<input.size();i++)
        // {   
        //  int j=1;
        //  while(j<input.get(i).length()){
        //      add(pattern.substring(j));
        //      j++;
        //  }
        // }
        return search(root,pattern);
    }
    private boolean search(TrieNode root,String pattern){
        if(pattern.length()==0)
            return true;
        int childIndex=pattern.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
        if(child==null)
            return false;
        return search(child,pattern.substring(1));

    }


}
