// Implement a function that computes the difference between two lists. 
// The function should remove all occurrences of elements from the first list 
// (a) that are present in the second list 
// (b). The order of elements in the first list should be preserved in the result.

// Examples
// If a = [1, 2] and b = [1], the result should be [2].

// If a = [1, 2, 2, 2, 3] and b = [2], the result should be [1, 3].

function arrayDiff(a,b){

    const bSet = new Set(b);
    return a.filter(x => !bSet.has(x));
}
function logArrayDiff(a,b){
    console.log(`a: ${a}, b: ${b} => result: ${arrayDiff(a,b)}`);
}

// A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of 
// its own digits, each raised to the power of the number of digits in a given base. 
// In this Kata, we will restrict ourselves to decimal (base 10).
// For example, take 153 (3 digits), which is narcissistic:

// 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
// and 1652 (4 digits), which isn't:

// 1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
// The Challenge:

// Your code must return true or false (not 'true' and 'false') depending upon whether 
// the given number is a Narcissistic number in base 10.

// This may be True and False in your language, e.g. PHP.

// Error checking for text strings or other invalid inputs is not required, only valid 
// positive non-zero integers will be passed into the function.


function narcissistic(value) {
  const arr = Array.from(String(value),Number);
  const len = arr.length;
  const result = arr.map(item => item ** len);
  let arrSum = 0;
  
  for (const num of result) {
    arrSum += num;
  }
  
  return arrSum === value;
  
}

//Your task is to make a function that can take any non-negative integer as an argument 
//and return it with its digits in descending order. Essentially, rearrange the digits 
//to create the highest possible number.

// Examples:
// Input: 42145 Output: 54421

// Input: 145263 Output: 654321

// Input: 123456789 Output: 987654321

function descendingOrder(n){
  const arr = Array.from(String(n), Number).sort((a,b) => b-a);
  return Number(arr.join(''));
}


// Count the number of Duplicates
// Write a function that will return the count of distinct case-insensitive 
// alphabetic characters and numeric digits that occur more than once in the input string. 
// The input string can be assumed to contain only alphabets (both uppercase and lowercase) 
// and numeric digits.

// Example
// "abcde" -> 0 # no characters repeats more than once
// "aabbcde" -> 2 # 'a' and 'b'
// "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
// "indivisibility" -> 1 # 'i' occurs six times
// "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
// "aA11" -> 2 # 'a' and '1'
// "ABBA" -> 2 # 'A' and 'B' each occur twice

function duplicateCount(text){
  const lower = text.toLowerCase();
  
  const charMap = {};
  let count = 0;
  
  for (const char of lower){
    charMap[char] = (charMap[char] || 0) + 1;
    
    if(charMap[char] === 2){
      count++;
    }
  }
  return count;
}

// Complete the solution so that it splits the string into strings of two characters 
// in a list/array (depending on the language you use). If the string contains an 
// odd number of characters then it should replace the missing second character of the 
// final pair with an underscore ('_').

// Examples:

// * 'abc' =>  ['ab', 'c_']
// * 'abcdef' => ['ab', 'cd', 'ef']

function solution(str){
   let result = [];
  
  if (str.length % 2 !== 0){
    str += "_";
  }
  
  for (let i = 0; i < str.length; i += 2){
    result.push(str.substring(i, i + 2));
  }
  
  return result;
}