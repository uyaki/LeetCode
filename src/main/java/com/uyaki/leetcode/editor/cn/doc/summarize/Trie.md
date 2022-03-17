# 前缀树|字典树（Trie）

## 简介

Trie，又称前缀树或字典树，是一棵有根树，其每个节点包含以下字段：
- 指向子节点的指针数组 children。假设字典由全小写字母组成，则数组长度为 26，即小写英文字母的数量。此时 children[0] 对应小写字母 a，children[1] 对应小写字母 b，…，children[25] 对应小写字母 z。
- 布尔字段 isEnd，表示该节点是否为字符串的结尾。

## 功能

1. 插入字符串
   - 我们从字典树的根开始，插入字符串。对于当前字符对应的子节点，有两种情况：
     - 子节点存在。沿着指针移动到子节点，继续处理下一个字符。
     - 子节点不存在。创建一个新的子节点，记录在 children 数组的对应位置上，然后沿着指针移动到子节点，继续搜索下一个字符。
2. 查找前缀
   - 我们从字典树的根开始，查找前缀。对于当前字符对应的子节点，有两种情况：
     - 子节点存在。沿着指针移动到子节点，继续搜索下一个字符。
     - 子节点不存在。说明字典树中不包含该前缀，返回空指针。
   - 重复以上步骤，直到返回空指针或搜索完前缀的最后一个字符。
   - 若搜索到了前缀的末尾，就说明字典树中存在该前缀。此外，若前缀末尾对应节点的 isEnd 为真，则说明字典树中存在该字符串。

## 实现

```java
class Trie {
    private Trie[] children;
    private boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }
    
    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }
    
    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}
```

## 示例

|难度| 题目                                                                                                        |题解| 代码                                                                                                                  |掌握度|
|:---:|:----------------------------------------------------------------------------------------------------------|:---|:--------------------------------------------------------------------------------------------------------------------|:---:|
|💛 | [P208_实现 Trie (前缀树)](./../content/P208_ImplementTriePrefixTree.md)                                        | | [P208_ImplementTriePrefixTree.java](./../../P208_ImplementTriePrefixTree.java)                                      |😄|
|💚 | [P720_词典中最长的单词](./../content/P720_LongestWordInDictionary.md) | 👍字典树 | [P720_LongestWordInDictionary.java](./../../P720_LongestWordInDictionary.java) |😄|
|❤️ | [P472_连接词](./../content/P472_ConcatenatedWords.md)            | 👍字典树+DFS  | [P472_ConcatenatedWords.java](./../../P472_ConcatenatedWords.java)             |😄|
