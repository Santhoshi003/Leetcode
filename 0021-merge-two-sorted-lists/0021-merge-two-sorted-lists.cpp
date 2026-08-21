class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        

    // Create a dummy node to simplify the merge process
    ListNode* dummy = new ListNode(0);
    ListNode* current = dummy;

    // Traverse through both lists and merge them
    while (list1 != nullptr && list2 != nullptr) {
        if (list1->val <= list2->val) {
            current->next = list1;
            list1 = list1->next;
        } else {
            current->next = list2;
            list2 = list2->next;
        }
        current = current->next;
    }

    // Attach the remaining nodes from the non-empty list
    if (list1 != nullptr) {
        current->next = list1;
    } else {
        current->next = list2;
    }

    return dummy->next;  // The head of the merged list is dummy->next
}

// Function to print the list (for testing)
void printList(ListNode* head) {
    ListNode* current = head;
    while (current != nullptr) {
        cout << current->val << " ";
        current = current->next;
    }
    cout << endl;
}

// Helper function to create a new node (for testing)
ListNode* createNode(int value) {
    return new ListNode(value);
}
    
};