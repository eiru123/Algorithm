const readline = require('readline');

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

rl.on('line', function(answer) {
	let numbers = answer.trim().split(' ').map(el => parseInt(el));

    for(let i=1; i<10; i++)
        console.log(`${numbers[0]} * ${i} = ${numbers[0]*i}`);
    rl.close();
});
