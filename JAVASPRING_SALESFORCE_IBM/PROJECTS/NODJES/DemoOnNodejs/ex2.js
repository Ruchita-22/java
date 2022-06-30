var http = require('http');

http.createServer(function(req,res){
	
	
	res.writeHead(404,{'Content-Type':'text/html'});
	res.write("welcome to js ...using httpserver");
	
	res.end();
	
}).listen(4000);

console.log("server is running at http://localhost:6000");