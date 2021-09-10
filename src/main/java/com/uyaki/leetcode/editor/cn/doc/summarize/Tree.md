# 树的解题套路总结
## 树的结构
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
```
## 树的遍历
### 前序遍历
```java
class Solution{
    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        // do something...
        preOrder(node.left);
        preOrder(node.right);
    }
}
```
### 中序遍历
```java
class Solution {
    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        //do something...
        inOrder(node.right);
    }
}
```
### 后序遍历
```java
class Solution {
    public void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        //do something...
    }
}
```
### 前序、中序、后序遍历
前序、中序、后序遍历的区别在于是访问根节点的顺序：
- 前序：根、左、右
- 中序：左、根、右
- 后序：左、右、根
```java
/**
 * 通用模板如下
 */
class Solution {
    public void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        // 前序遍历 do something ...
        traverse(node.left);
        // 中序遍历 do something ...
        traverse(node.right);
        // 后序遍历 do something ...
    }
}
```
由上可知，两种遍历组合可以推导出树的结构
- 前序+中序。如算法[P105_从前序与中序遍历序列构造二叉树](../content/P105_ConstructBinaryTreeFromPreorderAndInorderTraversal.md)
- 中序+后序。如算法[P106_从中序与后序遍历序列构造二叉树](../content/P106_ConstructBinaryTreeFromInorderAndPostorderTraversal.md)
思路如下：
1. 前序遍历的第一个节点为根节点。根据该根节点，可以将中序遍历的结构切割成两部分。左边为根节点的左子树，右边为根节点的右子树。
2. 根据左、右子树中序遍历的长度，可以将前序遍历切割成左、右子树对应的前序遍历。
3. 根据左、右子树的前序遍历+中序遍历，可以递归，继续切割，推导下一层级的子树。
4. 递归得到树的结构
### 层序遍历
```java
class Solution{
    public void levelOrder(TreeNode root) {
        levelRecursion(root, 0);
    }
    
    private void levelRecursion(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        //do something...
        levelRecursion(node.left, level + 1);
        levelRecursion(node.right, level + 1);
    }
}
```

### 树的深度
```java
class Solution{
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
```