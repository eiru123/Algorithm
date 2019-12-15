const readline = require('readline');

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

rl.on('line', function(answer) {
	const numbers = answer.trim().split(' ').map(el => parseInt(el));
	
	if (numbers[0] < numbers[1]) console.log('<');
	else if (numbers[0] === numbers[1]) console.log('==');
	else console.log('>');
	
    rl.close();
});
