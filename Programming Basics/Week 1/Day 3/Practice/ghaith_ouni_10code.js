// code 1

function hello() {
    console.log('hello');
}
hello();
console.log('Dojo');

// the function in the code below to console log all string 'hello'  , 'dojo' 

// code 2

function hello() {
    console.log('hello');
    return 15;
}
var result = hello();
console.log('result is', result);

// the function in the code below to console log all 'hello' and num 15

// code3

function numPlus(num) {
    console.log('num is', num);
    return num+15;
}
var result = numPlus(3);
console.log('result is', result);


//  function in the code below to console log all   num is  + num 


// code 5
var num = 15; // Declare a variable  value 15
console.log(num); // Log the value of num

function timesTwo(num){ // Declare a function timesTwo 
   console.log(num); // Log the value of num
   return num * 2; // Return num multiplied by 2
}

var result = timesTwo(10); // Call the timesTwo  argument 10
console.log(result); // Log the value of result (20) 
console.log(num); // Log the value  num variabl  15 

// code 6 

function timesTwoAgain(num) {
 console.log('num is', num);  // Print the value of num
 var y = num * 2;             // Multiply num by 2 
 return y;                    // Return the value of y
}

var result = timesTwoAgain(3) + timesTwoAgain(5);  // Call the timesTwoAgain (3) + timesTwoAgain (5)

// The timesTwoAgain function is defined It takes a parametr num multiplie it by 2

// First argument 3,  printsnum is 3 to  console  6
// Then with the argument 5 which prints num is 5 to the console and returns 10
//  results of the two function = 6 + 10 = 16

//  final console.log statement prints result is 16 
//   code 7

function sumNums(num1, num2) {  
    return num1+num2;
}
console.log(sumNums(2,3))
console.log(sumNums(3,5))

//    console.log ( sumNums (2, 3)  ) will output  5 = because   adding 2 and 3
//  console.log ( sumNums (3, 5) )  will output 8 =  adding 3 and 5

// code 8 

function printSumNums(num1, num2) {
    console.log(num1);   
    return num1+num2;
}
console.log(printSumNums(2,3))
console.log(printSumNums(3,5))

 //  returns the sum of num 1 and num 2

// After defining the function

  //    call is printSumNums  ( 2, 3 )  it logs 2 and  returns the sun  of 2 and 3 which is 5

//  call is printSumNums ( 3, 5 ) it logs 3 and  returns the sum of 3 and 5 which is 8



// code 10 

function sumNums(num1, num2) {
    var sum = num1 + num2;
    console.log('sum is', sum);
    return sum;
}
var result = sumNums(2,3) + sumNums(3,sumNums(2,1)) + sumNums(sumNums(2,1),sumNums(2,3));
console.log('result is', result); 

// The sumNums function take two arguments num 1 and num 2 


// The code then calls the sumNums function several times


// 1 sumNums ( 2 , 3 ) is called first  which returns 5  


// 2 sumNums ( 2 , 1 ) is  3 It logs  3 to the console

// 3  sumNums ( 3 , 3 ) is  returns 6 It logs sum is 6 

//  4   sumNums( 5 , 6 ) is  returns 11 It logs sum is 11 











