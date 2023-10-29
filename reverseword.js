function reverseWords(sentence) {
    return sentence.split(' ').map(function(word) {
        return word.split('').reverse().join('');
    }).join(' ');
}

console.log(reverseWords("This is a sunny day")); // Outputs: "shiT si a ynnus yad"
