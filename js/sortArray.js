let stringArray = prompt("Enter array seperated by space:");
stringArray = stringArray.split(" ");
let intArray = stringArray.map((word) => {
  return parseInt(word);
});
intArray.sort((a, b) => {
  return b - a;
});
console.log(intArray);
