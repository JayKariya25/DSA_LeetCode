/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode temp;
    struct ListNode* r=&temp;
    temp.next=NULL;

    while(list1!=NULL && list2!=NULL){
       if(list1->val<list2->val){
           r->next=list1;
           list1=list1->next;
        }
        else{
           r->next=list2;
           list2=list2->next;
        }
        r=r->next;
    }

    if(list1!=NULL){
        r->next=list1;
    }
    else{
        r->next=list2;
    }

    return temp.next;
}