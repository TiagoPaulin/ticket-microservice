const axios = require("axios");
const Event = require("../models/eventModel");
const API_URL = process.env.API_URL || "http://localhost:8080/event";

exports.getEventById = async (req, res) => {
  try {
    const { id } = req.params;
    const response = await axios.get(`${API_URL}/${id}`);
    const eventData = response.data;

    const event = new Event(eventData.id, eventData.name, eventData.description, eventData.date, eventData.time, eventData.type, eventData.tickets);

    res.status(200).json(event);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.createEvent = async (req, res) => {
  try {
    const eventData = req.body;
    const response = await axios.post(API_URL, eventData);
    res.status(201).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.deleteEvent = async (req, res) => {
  try {
    const { id } = req.params;
    await axios.delete(`${API_URL}/${id}`);
    res.status(204).send();
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.updateEvent = async (req, res) => {
  try {
    const { id } = req.params;
    const eventData = req.body;
    const response = await axios.put(`${API_URL}/${id}`, eventData);
    res.status(200).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};
