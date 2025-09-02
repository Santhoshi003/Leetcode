class Solution {
public:
    ListNode* reverseList(ListNode* head) {
    struct ListNode* pre=NULL;
    struct ListNode* curr=head;
    struct ListNode* next=NULL;
    while(curr!=NULL){
        next=curr->next;
        curr->next=pre;
        pre=curr;
        curr=next;
    }
    return pre;
    }
};
