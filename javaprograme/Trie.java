public class Trie {
    static class Node{
        Node[] children;
        boolean eow; // end of node

        public Node(){
            children =new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }

    static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){ // o(l) l=length of string
            int idx=word.charAt(i)-'a';   // get index from the word

            if(curr.children[idx] == null){
                // creat new node
                curr.children[idx]=new Node();
            }
            if(i == word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    public static boolean search(String key){   // tc=L(l) ; l=length of the key
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';  // index of the key
            Node node=curr.children[idx];
            if(node == null){  // node null
                return false;
            }
            
            if(i == key.length()-1 && node.eow == false){  // last node false retrun false
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
       String word[]={"the","a","there","their","any"};
       for(int i=0;i<word.length;i++){
           insert(word[i]);
       }

       System.out.println(search("their"));  // true
       System.out.println(search("thor"));   // false
       System.out.println(search("an")); // false

    }
}
