const readline = require('readline');

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

rl.on('line', function(answer) {
	const numbers = answer.trim().split(' ').map(el => parseInt(el));

	let hour = numbers[0];
	let minute = numbers[1];

	if (minute - 45 < 0) {
		if (hour === 0) hour = 23;
		else hour--;
		minute = 15 + minute; // 60 - 45
	} else {
		minute = minute - 45;
	} 
	console.log(`${hour} ${minute}`);
    rl.close();
});
