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

// const arr1 = ["a", "a", "a"];
// const expected1 = {
//   a: 3,
// };
// const arr2 = ["a", "b", "a", "c", "B", "c", "c", "d"];
// const expected2 = {
//   a: 2,
//   b: 1,
//   c: 3,
//   B: 1,
//   d: 1,
// };

// const arr3 = [];
// const expected3 = {};

// function makeFrequencyTable(arr) {
// }

/* 
  Given a string,
  return a new string with the duplicates excluded
  Bonus: Keep only the last instance of each character.
*/
const str1 = "abcABC";
const expected1 = "abcABC";

const str2 = "helloo";
const expected2 = "helo";

const str3 = "";
const expected3 = "";

const str4 = "aa";
const expected4 = "a";

/**
 * De-dupes the given string.
 */

// function stringDedupe(str) {
// }

function stringDedupe(str) {
  let dedupedStr = '';
  
  for (let i = 0; i < str.length; i++) {
    
    if (str[i] !== str[i + 1]) {
      dedupedStr += str[i];
    }
  }
  
  return dedupedStr;
}

// const str2 = "helloo";
// const expected2 = "helo";
// console.log(stringDedupe(str2));