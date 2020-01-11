let reverse = function(x) {
    let str = String(Math.abs(x));
    
    str = str.split('').reverse().join('');

    if(str.startsWith('0')) str = str.slice(1);
    
    let result = x < 0 ? Number('-' + str) : Number(str);
    if(result > 0x7FFFFFFF - 1 || result < -0x7FFFFFFF) return 0;
    if(x < 0) return '-' + str;
    else return str;
};
