const express = require("express");
const ticketController = require("../controllers/ticketController");
const router = express.Router();

router.get("/:id", ticketController.getTicketById);
router.post("/", ticketController.createTicket);
router.delete("/:id", ticketController.deleteTicket);
router.put("/:id", ticketController.updateTicket);

module.exports = router;
