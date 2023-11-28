// /* 
//   Acronyms
//   Create a function that, given a string, returns the string’s acronym 
//   (first letter of each word capitalized). 
//   Do it with .split first if you need to, then try to do it without
// */

// const strA = "object oriented programming";
// const expectedA = "OOP";

// // The 4 pillars of OOP
// const strB = "abstraction polymorphism inheritance encapsulation";
// const expectedB = "APIE";

// const strC = "software development life cycle";
// const expectedC = "SDLC";

// //- Bonus: ignore extra spaces
// // const strD = "  global   information tracker    ";
// // const expectedD = "GIT";
// function acronymize (str) {
//     const strA = str.split (" ");
//     // console.log(strA)
     
// // }
// // acronymize(strA)
// // const strA = str.ap
// /* 
//   Given an arr and a separator string, output a string of every item in the array separated by the separator.
  
//   No trailing separator at the end
//   Default the separator to a comma with a space after it if no separator is provided
// */js
// //                v
// // const arr1 = [1, 2, 3];
// // const separator1 = ", ";
// // // const expected1 = "1, 2, 3"
// // sep=", "

// // for (i=0; i<arr1.length-1; i++ ){
// //   if(i=arr1.length-1){
// //     join +=arr1[i]
// //   }
// // }






// // const arr2 = [1, 2, 3];
// // const separator2 = "-";
// // const expected2 = "1-2-3";
// // console.log(arr1.join(-))

// // const arr3 = [1, 2, 3];
// // const separator3 = " - ";
// // const expected3 = "1 - 2 - 3";

// // const arr4 = [1];
// // const separator4 = ", ";
// // const expected4 = "1";

// // const arr5 = [];
// // const separator5 = ", ";
// // const expected5 = "";

// // // 1. Driver 🚗
// // // 2. Presenter 👩‍💻
// // // 3. Navigator 🧭

// // // take 5-7 mins to write the pseudocode here:

// // // create the function and decide what params it needs and what it will return
// // function join(arr, separator) {
// /* 
 



// Given an array of strings
//   return the number of times each string occurs (a frequency / hash table)
//   hasOwnProperty()
// */
// var user = {username:"John", age:35}

// // console.log(user.hasOwnProperty('age'));
// // console.log(user.hasOwnProperty('email'));

// // const arr1 = ["a", "a", "a"];
// // const expected1 = {
// //   a: 3,
// // };
// // const arr2 = ["a", "b", "a", "c", "B", "c", "c", "d"];
// // const expected2 = {
// //   a: 2,
// //   b: 1,
// //   c: 3,
// //   B: 1,
// //   d: 1,
// // };

// // const arr3 = [];
// // const expected3 = {};

// // function makeFrequencyTable(arr) {
// // }

// /* 
//   Given a string,
//   return a new string with the duplicates excluded
//   Bonus: Keep only the last instance of each character.
// */
// const str1 = "abcABC";
// const expected1 = "abcABC";

// const str2 = "helloo";
// const expected2 = "helo";

// const str3 = "";
// const expected3 = "";

// const str4 = "aa";
// const expected4 = "a";

// /**
//  * De-dupes the given string.
//  */

// // function stringDedupe(str) {
// // }

// function stringDedupe(str) {
//   let dedupedStr = '';
  
// //   for (let i = 0; i < str.length; i++) {
    
// //     if (str[i] !== str[i + 1]) {
// //       dedupedStr += str[i];
// //     }
// //   }
  
// //   return dedupedStr;
// // }

// // // const str2 = "helloo";
// // // const expected2 = "helo";
// // // console.log(stringDedupe(str2));
// /* 
// Parens Valid
// Given an str that has parenthesis in it
// return whether the parenthesis are valid

// Determines whether the parenthesis in the given string are valid.
//  * Each opening parenthesis must have exactly one closing parenthesis.
// */
// const str1 = "Y(3(p)p(3)r)s";
// const expected1 = true;

// const str2 = "N(0(p)3";
// const expected2 = false;
// // Explanation: not every parenthesis is closed.

// const str3 = "N(0)t ) 0(k";
// const expected3 = false;
// // Explanation: because the second ")" is premature: there is nothing open for it to close.

// const str4 = "a(b))(c";
// const expected4 = false;
// // Explanation: same number of opens and closes but the 2nd closing closes nothing.

// const str5 = "a)b((c))";
// const expected5 = false;
// // Explanation: same number of opens and closes but the 2nd closing closes nothing.

// function parensValid(str = "") {
//   var parens1 = "(";
// 	var parens2 = ")";

//   for (let i = 0; i<str.length; i++)
// }

// *************************w2 d5*******************
/* 
  String: Rotate String

  Create a standalone function that accepts a string and an integer,
  and rotates the characters in the string to the right by that given
  integer amount.
*/

const str = "Hello World";

const rotateAmnt1 = 0;
const expected1 = "Hello World";

const rotateAmnt2 = 1;
const expected2 = "dHello Worl";

const rotateAmnt3 = 2;
const expected3 = "ldHello Wor";

const rotateAmnt4 = 4;
const expected4 = "orldHello W";

const rotateAmnt5 = 13;
const expected5 = "ldHello Wor";
/* 
Explanation: this is 2 more than the length so it ends up being the same
as rotating it 2 characters because after rotating every letter it gets back
to the original position.
*/

/**
 * Rotates a given string's characters to the right by the given amount,
 * wrapping characters to the beginning.
 * @param {string} str
 * @param {number} amnt The amount of characters in the given str to rotate to the
 *    right.
 * @returns {string} The string rotated by the given amount.
 */
function rotateStr(str, amnt) {}

console.log(rotateStr(str, rotateAmnt1), "should equal", expected1);
console.log(rotateStr(str, rotateAmnt2), "should equal", expected2);
console.log(rotateStr(str, rotateAmnt3), "should equal", expected3);
console.log(rotateStr(str, rotateAmnt4), "should equal", expected4);
console.log(rotateStr(str, rotateAmnt5), "should equal", expected5);
