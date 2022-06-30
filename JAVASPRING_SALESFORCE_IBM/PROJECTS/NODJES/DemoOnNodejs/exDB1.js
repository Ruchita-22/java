var mysql  = require('mysql'); //load or import module;

var mysqlCon = mysql.createConnection({
	
	host:'localhost',
	user:'root',
	password:'root',
	database:'ibm',
     port :'3306'
});

mysqlCon.connect(function(err){
	
	if(err){
		
		console.log(err);
		
	}
		console.log("connection is successfull..!");
	
	
});//to connect database


//insert query

mysqlCon.query("insert into emp values(1004,'martin55',30000)",function(err){
	
	if(err){
		
		console.log(err);
		
	}
	
	console.log('Record is inserted into  emp table');
	
});


mysqlCon.query("insert into emp values(1001,'raju20',30000)",function(err){
	
	if(err){
		
		console.log(err);
		
	}
	
	console.log('Record is inserted into  emp table');
	
});


mysqlCon.end();


