let isPalindrome = function(x) {
    if (x < 0) return false;
    
    const compare = parseInt(String(x).split('').reverse().join(''));
    if(compare === x) return true;
    else return false;
};

console.log(isPalindrome(10));