const { MongoClient } = require("mongodb");
const { v4: uuidv4 } = require("uuid");

/* use the Cosmos DB connection string you copied ealier and replace in the `url` variable */
const url = "mongodb://ticketit:wW4IYObwQk8pRgQqOHKTNZnqhcRxDWw4XFnRFk0LbemiCkTVakxXFQKemkRh83Ap7zhLcpcD3FIpACDbr4p1wA==@ticketit.mongo.cosmos.azure.com:10255/?ssl=true&retrywrites=false&maxIdleTimeMS=120000&appName=@ticketit@";
const client = new MongoClient(url);

module.exports = async function (context, req) {
  await client.connect();
  const database = client.db("ticketit-db");
  const collection = database.collection("user");
  let obj = await collection.findOne({ _id: req.params.id });
  if (!obj) {
  return  context.res = {
      status: 404,
      body: "Not found"
    };
  }
 return context.res = {
    status: 200,
    body: obj,
  };
};