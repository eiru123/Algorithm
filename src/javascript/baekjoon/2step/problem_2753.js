const readline = require('readline');

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

rl.on('line', function(answer) {
	const number = parseInt(answer);
	
	if ((number % 400 === 0) || ((number % 4 === 0) && (number % 100 !== 0))) console.info(1);
	else console.info(0);
	
    rl.close();
});
