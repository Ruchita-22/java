//querystring   module
//to convert querystring into json object -parse()
//to convert json into querystring - stringify()

//name=raju&sal=200 --querystring


var querystring = require('querystring');

var s = querystring.parse("name=raju&sal=200");


var b=querystring.stringify(s);

console.log(s);
console.log(b);





