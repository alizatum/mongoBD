var mongoose = require('mongoose');

var tariffScheme = mongoose.Schema({
	tariff_id:{
		type:Number,
		unique:true,
		min:0,
		required:true		
},
	name:{
		type:String,
		unique:true,
		required:true
},
	numberOfGB:{
		type:Number,
		required:true,
		min:0
},
	numberOfMin:{
		type:Number,
		required:true,
		min:0
},
	numberOfSMS:{
		type:Number,
		required:true,
		min:0
},
	price:{
		type:Number,
		required:true,
		min:0
}
});

var operatorScheme = mongoose.Schema({
	operator_id:{
		type:Number,
		unique:true,
		min:0,
		required:true
},
	name:{
		type:String,
		required:true,
		unique:true
}
});

var optionScheme = mongoose.Schema({
	option_id:{
		type:Number,
		unique:true,
		min:0,
		required:true
},
	name:{
		type:String,
		required:true,
		unique:true
},
	price:{
		type:Number,
		required:true,
		min:0
}
});

var userScheme = mongoose.Schema({
	user_id:{
		type:Number,
		unique:true,
		min:0,
		required:true
},
	firstName:{
		type:String,
		required:true,
},
	lastName:{
		type:String,
		required:true,
},
	middleName:{
		type:String,
		required:true,
},
	passport:{
		type:Number,
		required:true,
		unique:true,
		min:0,
		max:999999
}
});

var cityScheme = mongoose.Schema({
	city_id:{
		type:Number,
		unique:true,
		min:0,
		required:true
},
	name:{
		type:String,
		required:true,
		unique:true
}
});



mongoose.connect('mongodb://localhost/mongoose_basics', function (err) {
 
   if (err) { console.log('Not connected');}
 
   console.log('Successfully connected');

var Tariff = mongoose.model('Tariff', tariffScheme);
var Operator = mongoose.model('Operator', operatorScheme);
var Option = mongoose.model('Option', optionScheme);
var User = mongoose.model('User', userScheme);
var City = mongoose.model('City', cityScheme);

var firstTariff = new Tariff({
    	tariff_id:1,
    	name: 'Smart',
	numberOfGB:3,
	numberOfMin:500,
	numberOfSMS:100,
	price:300
});

var secondTariff = new Tariff({
    	tariff_id:2,
    	name:'Smart-mini',
	numberOfGB:1,
	numberOfMin:300,
	numberOfSMS:50,
	price:150
});

var firstOperator = new Operator({
    operator_id:1,
    name: 'MTC'
});

var secondOperator = new Operator({
    operator_id:2,
    name: 'Beline'
});

var firstOption = new Option({
    	option_id:1,
    	name:'autoresponder',
	price:100
});


var secondOption = new Option({
    	option_id:2,
    	name:'auto-completion',
	price:150
});

var firstUser = new User({
    	user_id:1,
    	firstName:'Roman',
	lastName:'Fomin',
	middleName:'Vlaimirovich',
	passport:345678
});

var secondUser = new User({
    	user_id:2,
    	firstName:'Elizaveta',
	lastName:'Tumaykina',
	middleName:'Andreevna',
	passport:123456
});

var firstCity = new City({
    city_id:1,
    name: 'Moscow'
});

var secondCity = new City({
    city_id:2,
    name: 'Sochi'
});



firstTariff.save(function(err){
mongoose.disconnect();
if (err) throw err;
console.log('firstTariff successfully saved.');
});

secondTariff.save(function(err){
mongoose.disconnect();
if (err) throw err;
console.log('secondTariff successfully saved.');
});

firstOperator.save(function(err){
mongoose.disconnect();
if (err) throw err;
console.log('firstOperator successfully saved.');
});
secondOperator.save(function(err){
if (err) throw err;
console.log('secondOperator successfully saved.');
});

firstOption.save(function(err){
if (err) throw err;
console.log('firstOption successfully saved.');
});
secondOption.save(function(err){
if (err) throw err;
console.log('secondOption successfully saved.');
});

firstUser.save(function(err){
if (err) throw err;
console.log('firstUser successfully saved.');
});
secondUser.save(function(err){
if (err) throw err;
console.log('secondUser successfully saved.');
});

firstCity.save(function(err){
if (err) throw err;
console.log('firstCity successfully saved.');
});
secondCity.save(function(err){
if (err) throw err;
console.log('secondCity successfully saved.');
});


});
