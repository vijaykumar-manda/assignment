let string = prompt("enter string:");
let words = string.split(' ')
const reverse = words.map(word=>{
    return word.split('').reverse().join('')
})
const revSen= reverse.join(' ')
console.log(revSen)

