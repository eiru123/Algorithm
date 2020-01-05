const readline = require('readline');

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

rl.on('line', function(answer) {
	let numbers = answer.trim().split(' ').map(el => parseInt(el));

    numbers.sort((a, b) => a - b);
    
    console.log(numbers[1]);
    rl.close();
});
