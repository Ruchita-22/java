var http= require("http");
http.createServer(function(request,response){
	response.writeHead(404, {'Content-Type':'text/html'});
	response.write("welcome to js.... using httpserver");
	response.end();
	
	
	
}).listen(4000);
console.log("server is running ");