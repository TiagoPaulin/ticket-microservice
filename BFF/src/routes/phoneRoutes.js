const express = require("express");
const phoneController = require("../controllers/phoneController");
const router = express.Router();

router.post("/", phoneController.createPhone);
router.get("/", phoneController.getAllPhones);
router.get("/:id", phoneController.getPhoneById);
router.put("/:id", phoneController.updatePhone);
router.delete("/:id", phoneController.deletePhone);

module.exports = router;
