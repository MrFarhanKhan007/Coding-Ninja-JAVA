/*Given n number of words and an incomplete word w. You need to auto-complete that word w.
That means, find and print all the possible words which can be formed using the incomplete word w.
Note : Order of words does not matter.
Input Format :
The first line of input contains an integer, that denotes the value of n.
The following line contains n space separated words.
The following line contains the word w, that has to be auto-completed.
Output Format :
Print all possible words in separate lines.
Constraints:
Time Limit: 1 sec
Sample Input 1 :
7
do dont no not note notes den
no
Sample Output 2 :
no
not
note
notes
Sample Input 2 :
7
do dont no not note notes den
de
Sample Output 2 :
den
Sample Input 3 :
7
do dont no not note notes den
nom
Sample Output 3 :
(Empty) There is no word which starts with "nom"*/
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
	
	
	
	public TrieNode search(String word) {
		return search(root, word);
	}
	public TrieNode search(TrieNode root,String word) {
		if(word.length()==0) {
			return root;
		}
		int childIndex = word.charAt(0)-'a';
		TrieNode childNode = root.children[childIndex];
		if(childNode==null) {
			return null;
		}
		return search(childNode, word.substring(1));
	}
	public void printPossibleWords(TrieNode root, String word,String output ) {

		if(root.isTerminating) {
			System.out.println(word + output);
		}
		for(int i=0;i<root.children.length;i++) {
			if(root.children[i]!=null)
				printPossibleWords(root.children[i], word, output + root.children[i].data  );
		}


	}
	public void autoComplete(ArrayList<String> input, String word) {
		// change with Trie
		Trie trie = new Trie();
		for(String string : input ) {
			trie.add(string);
		}
		TrieNode t = trie.search(word);
		if(t==null) {
			return ;
		}
		printPossibleWords(t,word,"");



	}
}
