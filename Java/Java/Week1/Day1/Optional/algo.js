// // Singly Linked List

// // Blueprint of a node
// class Node {
//     constructor(value) {
//       this.value = value;
//       this.next = null;
//     }
//   }
//   // Blueprint of a singly linked list
//   class SLL {
//     constructor() {
//       this.head = null;
//     }
  
//     isEmpty() {
//       return this.head === null;
//     }
//     addToFront(node) {}
//   }
  
//   // instantiate a singly linked list
//   var myFirstSLL = new SLL();
//   // console.log(myFirstSLL);
  
//   // instantiate nodes
//   var n1 = new Node(11);
//   var n2 = new Node(22);
//   var n3 = new Node(33);
  
//   console.log(myFirstSLL.isEmpty());
class BSTNode {
  constructor(val) {
      this.val = val;
      this.left = null;
      this.right = null;
  }
};
class BST {
  constructor() {
      this.root = null;
  }
  isEmpty() {
      return this.root === null;
  };
}