const axios = require("axios");
const EventType = require("../models/eventTypeModel");

const API_URL = process.env.API_URL || "http://localhost:8080/type";

exports.getEventTypeById = async (req, res) => {
  try {
    const { id } = req.params;
    const response = await axios.get(`${API_URL}/${id}`);
    const eventTypeData = response.data;

    const eventType = new EventType(eventTypeData.id, eventTypeData.description, eventTypeData.events);

    res.status(200).json(eventType);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.createEventType = async (req, res) => {
  try {
    const eventTypeData = req.body;
    const response = await axios.post(API_URL, eventTypeData);
    res.status(201).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.deleteEventType = async (req, res) => {
  try {
    const { id } = req.params;
    await axios.delete(`${API_URL}/${id}`);
    res.status(204).send();
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.updateEventType = async (req, res) => {
  try {
    const { id } = req.params;
    const eventTypeData = req.body;
    const response = await axios.put(`${API_URL}/${id}`, eventTypeData);
    res.status(200).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};
