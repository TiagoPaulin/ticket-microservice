const express = require("express");
const eventTypeController = require("../controllers/eventTypeController");
const router = express.Router();

router.get("/:id", eventTypeController.getEventTypeById);
router.post("/", eventTypeController.createEventType);
router.delete("/:id", eventTypeController.deleteEventType);
router.put("/:id", eventTypeController.updateEventType);

module.exports = router;
