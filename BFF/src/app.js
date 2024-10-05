const express = require("express");
const app = express();
const ticketRoutes = require("./routes/ticketRoutes");
const eventRoutes = require("./routes/eventRoutes");
const eventTypeRoutes = require("./routes/eventTypeRoutes");

const PORT = 3000;

app.use("/bff/event", eventRoutes);
app.use("/bff/ticket", ticketRoutes);
app.use("/bff/type", eventTypeRoutes);

app.get("/", (req, res) => {
  res.send("Hello World!");
});

app.listen(PORT, () => {
  console.log(`Servidor rodando na porta ${PORT}`);
});
