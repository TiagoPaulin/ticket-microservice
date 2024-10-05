const express = require("express");
const eventController = require("../controllers/eventController");
const router = express.Router();

router.get("/:id", eventController.getEventById);
router.post("/", eventController.createEvent);
router.delete("/:id", eventController.deleteEvent);
router.put("/:id", eventController.updateEvent);

module.exports = router;
