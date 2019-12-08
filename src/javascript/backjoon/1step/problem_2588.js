const readline = require('readline');

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

function calculator (a, b) {
    console.info(a * (b % 10));
    console.info(a * (Math.floor(b / 10) % 10));
    console.info(a * (Math.floor(b / 100)));
    console.info(a * b);
}
const input = [];
rl.on('line', function(answer) {
    input.push(parseInt(answer));
    if (input.length === 2) {
        calculator(input[0], input[1]);
        rl.close();
    }
});
