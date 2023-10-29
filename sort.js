// This function will take user input and sort it in descending order
function sortArrayDescending() {
    // Take user input
    let array = prompt("Enter the elements of the array separated by commas (e.g., 1,2,3,4,5)").split(',');

    // Convert strings to numbers
    array = array.map(Number);

    // Sort the array in descending order
    array.sort(function(a, b) {
        return b - a;
    });

    // Output the sorted array
    console.log(array);
}

// Call the function
sortArrayDescending();
