const express = require('express'); //Import the express dependency
const app = express();              //Instantiate an express app, the main work horse of this server
const port = 5000;                  //Save the port number where your server will be listening
var http = require('http');
var bodyParser = require('body-parser');
var helmet = require('helmet');

app.use(bodyParser.urlencoded({extended: false}));
app.use(helmet());

app.get('/', (req, res) => {        //get requests to the root ("/") will route here
    res.sendFile('index.html', {root: __dirname});      //server responds by sending the index.html file to the client's browser                                                      //the .sendFile method needs the absolute path to the file, see: https://expressjs.com/en/4x/api.html#res.sendFile 
});
// View
app.post('/view', function(req,res){

        let a = req.body.wordOne;
        let b = req.body.wordTwo;
        let lenWordOne = a.length;
        let lenWordTwo = b.length;
            if(lenWordOne !== lenWordTwo){
               res.send("Length of two words do not match");
               return
            }
            let str1 = a.toString().split('').sort().join('');
            let str2 = b.toString().split('').sort().join('');
            if(str1 === str2){
               res.send("Two words are Anagram words");
            } else { 
               res.send("Two words not are Anagram words");
            }
  });

app.listen(port, () => {            //server starts listening for any attempts from a client to connect at port: {port}
    console.log(`Now listening on port ${port}`); 
});