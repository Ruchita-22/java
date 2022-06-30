/**
 * http://usejsdoc.org/
 */
//console.log('welcome to nodeJs');


//querystring
//to convert querystring into json object----parse()
//to convert json into querystring---stringify()

var querystring=require('querystring');
var s= querystring.parse("name=raju&sal=200");
var b=querystring.stringify(s);
console.log(s);
console.log(b);