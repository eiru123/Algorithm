const readline = require('readline');

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});
let count = 1;
let set = new Set();
let mod = Array(42).fill(0);

rl.on('line', function(answer) {
    if (count === 10) {
        let mcount = 0;
        for(let m of mod) {
            if (m !== 0) mcount++;
        }
        console.log(mcount);
        rl.close(); 
    }
	let numbers = answer.trim().split(' ').map(el => parseInt(el));

    mod[numbers%42]++;
    count++;
});
