var mysql=require('mysql');		//load or import module
var mysqlCon=mysql.createConnection({
	host:'localhost' ,
	user:'root' , 
	password:'mysql' ,
	database:'ruchita' ,
	port:'3306'

});

mysqlCon.connect(function(err){
	
	if(err){
		
		console.log(err);
		
	}
	console.log("connection is successful...!");
	
});
mysqlCon.query("insert into emp values('sonu','singh','abc','xyz')",function(err){
	
	if(err){
		
		
		console.log(err);
	}
	console.log('recod is inserted');
	
});
mysqlCon.end();		//to close the connection



//insert into emp values('vishnu','singh','abc','xyz')





