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