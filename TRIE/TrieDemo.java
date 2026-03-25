
class Node{
    Node[] links = new Node[26];

    boolean flag = false;

    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }

    void put(char ch, Node node){
        links[ch-'a'] = node;
    }

    Node get(char ch){
        return links[ch-'a'];
    }

    void setEnd(){
        flag = true;
    }

    boolean isEnd(){
        return flag;
    }
}

class Trie{
    private Node root;

    public Trie(){
        root = new Node();
    }

    public void insert(String word){
        Node node = root;
        for(char ch:word.toCharArray()){
            if(node.containsKey(ch)){
                node.put(ch,new Node());
            }
            node = node.get(ch);
        }
        node.setEnd();
    }
}

public class TrieDemo{
    public static void main(String[] args) {
        
    }
}