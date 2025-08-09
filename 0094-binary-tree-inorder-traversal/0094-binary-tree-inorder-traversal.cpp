/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
   void Inorder(TreeNode* root,vector<int>&inor)
   {
    if(!root) return;
    Inorder(root->left,inor);
    inor.push_back(root->val);
    Inorder(root->right,inor);
   } 
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> inor;
        Inorder(root,inor);
        return inor;
    }
};