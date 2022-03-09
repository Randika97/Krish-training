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

      let tempArray = req.body.series;
      var array = JSON.parse("[" + tempArray + "]");
      console.log(array);
      let arr_size = array.length;
      var result=0;            
      if (arr_size < 3){
         document.write(" Invalid Input ");
         return;
      }
               
      let temp;
      for (let i = 0;i < arr_size ; i++){
         for(let j=i+1;j<arr_size;j++){
            if (array[i] >array[j]){
               temp = array[i];
               array[i]=array[j];
               array[j]=temp;
            }
         }
      }
      result=array[arr_size-3];
      res.json(`Second largest number is ${result}`);
});

app.listen(port, () => {            //server starts listening for any attempts from a client to connect at port: {port}
    console.log(`Now listening on port ${port}`); 
});